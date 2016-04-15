package calculadoraampliacioningsw;


import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Datos {
    
    private double total;
    private double num1,num2;
    private char oper;

    private Stack <Double> pilaNum;
    private Stack pilaOper;
    private boolean esNumber;

    public Datos() {
        this.pilaNum = new Stack<Double>();
        this.pilaOper = new Stack();
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
        
 /*   switch(d.getOper()){
                    case '+':   d.setTotal(d.suma());
                                String stringTotal = String.valueOf(d.getTotal());
                                resultado.setText(stringTotal);
                                break;
                }*/
    
    public Integer DamePrioridad (char c){
        Integer a = null;
	switch (c){
            case '*' : a = 2;
                        break;
            case '/' : a = 2;
                        break;
            case '-' : a = 1;
                        break;
            case '+' : a = 1;
                        break;
            case '(' : a = 0;
                        break;
        }
        return a;
    }
	
    /////////////////////////////////////////////////////////////////
    //getters y setters
    public double getTotal(){
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }
    
    //metodos de las operaciones
    public double suma()
    {
        total=this.getNum1()+this.getNum2();
        return (total);
    }
    
    public double resta(boolean neg)
    {
        if (this.getNum1()<0 && neg==false)
            total=this.getNum2()+ this.getNum1();
        else
            total=this.getNum2()- this.getNum1();
        return (total);
    }
    
    public double mult()
    {
        total=this.getNum1()*this.getNum2(); 
        return (total);
    }
    
    public double div()
    {
        total=this.getNum2()/this.getNum1();
        return (total);
}
    
    public void addPilaNum(double num, boolean menorPrio){
        if (menorPrio==true ){
            double n1= pilaNum.pop();
            double n2= pilaNum.pop();
            pilaNum.push(num);
            pilaNum.push(n2);
            pilaNum.push(n1);
        }else{
            pilaNum.push(num);
        }
    }
    
    public boolean addPilaOper(char oper, boolean parentesis) {
        if(!pilaOper.empty() && parentesis==false){
            char operAux = (char) pilaOper.peek();
            if ((oper == '+' || oper == '-') && (operAux == '*' || operAux == '/')) {
                operAux = (char) pilaOper.pop();
                pilaOper.push(oper);
                pilaOper.push(operAux);
                return true;
            }else{ 
                pilaOper.push(oper);
                return false;
            }
        } else {
            pilaOper.push(oper);
            return false;
        }
    }//end-addPilaOper
    
    public double getPilaNum (){
        if (!pilaNum.empty()){
            return pilaNum.pop();
        }
        return 0;
    }
    
    public char getPilaOper (){
        if (!pilaOper.empty()){
            return (char) pilaOper.pop();
        }
        return 0;
    }
    
    public boolean esPilaNumVacia(){
        return pilaNum.empty();
    }
    
    public boolean esPilaOperVacia(){
        return pilaOper.empty();
    }
    
    
    public double transformaDouble(String cad){
        double num=0;
        String aux="", aux2="";
        char x;
        for (int i=cad.length(); i>0 && cad.charAt(i-1)!= '+' && cad.charAt(i-1)!= '*'
                    && cad.charAt(i-1)!= '/' && cad.charAt(i-1)!= '('; i--){
            if (cad.charAt(i-1)!= '+' && cad.charAt(i-1)!= '*' 
                    && cad.charAt(i-1)!= '/' && cad.charAt(i-1)!= '(' && cad.charAt(i-1)!= ')'){
                aux+=(cad.charAt(i-1));
                if (cad.charAt(i-1)== '-')
                    break;
            }
        }//end-for
        
        for(int i=aux.length();i>0;i--){
            aux2+=aux.charAt(i-1);
        }
        if(aux2!="")
            num= Double.parseDouble(aux2);
        return num;
    }//end-transformaDouble

    public double getPeekNum() {
        return pilaNum.peek();
    }
   
  
}//end-Datos
