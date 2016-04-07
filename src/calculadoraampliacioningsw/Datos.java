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

    Stack <Double> pilaNum;
    Stack pilaOper;
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
    
    public double resta()
    {
        total=this.getNum1()- this.getNum2();
        return (total);
    }
    
    public double mult()
    {
        total=this.getNum1()*this.getNum2(); 
        return (total);
    }
    
    public double div()
    {
        total=this.getNum1()/this.getNum2();
        return (total);
    }
    
    public void addPilaNum(double num){
        pilaNum.push(num);
    }
    
    public void addPilaOper(char oper){
        pilaOper.push(oper);
    }
    
}
