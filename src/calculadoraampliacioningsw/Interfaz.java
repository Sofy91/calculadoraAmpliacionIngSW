package calculadoraampliacioningsw;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Administrador
 */
public class Interfaz extends JFrame implements ActionListener, KeyListener {

    Datos d = new Datos();
    //contador punto
    boolean contador = false; //Booleano para saber si se ha escrito "."
    boolean operador = false;
    boolean resultIgual = false; //Booleano para saber si se ha producido un resultado
    int contadorParent = 0; //Cuenta el numero de parentesis para controlar los cierres de parentesis
    boolean menorPrio =false; //Prioridad + o -
    int contPar= 0; //Cuenta el numero de parentesis para controlar las operaciones

    //creacion imagenes para añadir a botones
    ImageIcon cero = new ImageIcon("Captura0.JPG");
    ImageIcon uno = new ImageIcon("Captura1.JPG");
    ImageIcon dos = new ImageIcon("Captura2.JPG");
    ImageIcon tres = new ImageIcon("Captura3.JPG");
    ImageIcon cuatro = new ImageIcon("Captura4.JPG");
    ImageIcon cinco = new ImageIcon("Captura5.JPG");
    ImageIcon seis = new ImageIcon("Captura6.JPG");
    ImageIcon siete = new ImageIcon("Captura7.JPG");
    ImageIcon ocho = new ImageIcon("Captura8.JPG");
    ImageIcon nueve = new ImageIcon("Captura9.JPG");
    ImageIcon punto = new ImageIcon("CapturaPunto.JPG");
    ImageIcon igual = new ImageIcon("CapturaIgual.JPG");
    ImageIcon suma = new ImageIcon("CapturaMas.JPG");
    ImageIcon resta = new ImageIcon("CapturaMenos.JPG");
    ImageIcon mult = new ImageIcon("CapturaPor.JPG");
    ImageIcon div = new ImageIcon("CapturaDivision.JPG");
    ImageIcon c = new ImageIcon("CapturaC.JPG");
    ImageIcon ce = new ImageIcon("CapturaCE.JPG");
    ImageIcon abrirPar = new ImageIcon("CapturaAbreParent.JPG");
    ImageIcon cerrarPar = new ImageIcon("CapturaCierraParent.JPG");

    //creacion botones calculadora
    private JButton btnNumero0 = new JButton(cero);
    private JButton btnNumero1 = new JButton(uno);
    private JButton btnNumero2 = new JButton(dos);
    private JButton btnNumero3 = new JButton(tres);
    private JButton btnNumero4 = new JButton(cuatro);
    private JButton btnNumero5 = new JButton(cinco);
    private JButton btnNumero6 = new JButton(seis);
    private JButton btnNumero7 = new JButton(siete);
    private JButton btnNumero8 = new JButton(ocho);
    private JButton btnNumero9 = new JButton(nueve);
    private JButton btnPunto = new JButton(punto);
    private JButton btnBorrar = new JButton(c);
    private JButton btnBorrar1 = new JButton(ce);
    private JButton btnParentA = new JButton(abrirPar);
    private JButton btnParentC = new JButton(cerrarPar);

    private JButton btnIgual = new JButton(igual);
    private JButton btnSuma = new JButton(suma);
    private JButton btnResta = new JButton(resta);
    private JButton btnMult = new JButton(mult);
    private JButton btnDiv = new JButton(div);

    private JTextField screen = new JTextField(30);
    private JTextField resultado = new JTextField(30);

    public Interfaz() {
        JFrame frame = new JFrame("Calculadora");
        Container contenedor = new Container();
        contenedor.setLayout(new BorderLayout());

        Container contenedorN = new Container();
        contenedorN.setLayout(new GridLayout(2, 1));

        Container contCentro1 = new Container();
        contCentro1.setLayout(new GridLayout(4, 5));

        btnNumero0.addActionListener(this);
        btnNumero1.addActionListener(this);
        btnNumero2.addActionListener(this);
        btnNumero3.addActionListener(this);
        btnNumero4.addActionListener(this);
        btnNumero5.addActionListener(this);
        btnNumero6.addActionListener(this);
        btnNumero7.addActionListener(this);
        btnNumero8.addActionListener(this);
        btnNumero9.addActionListener(this);
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnPunto.addActionListener(this);
        btnBorrar.addActionListener(this);
        btnBorrar1.addActionListener(this);
        btnIgual.addActionListener(this);
        btnParentA.addActionListener(this);
        btnParentC.addActionListener(this);

        btnNumero0.addKeyListener(this);
        btnNumero1.addKeyListener(this);
        btnNumero2.addKeyListener(this);
        btnNumero3.addKeyListener(this);
        btnNumero4.addKeyListener(this);
        btnNumero5.addKeyListener(this);
        btnNumero6.addKeyListener(this);
        btnNumero7.addKeyListener(this);
        btnNumero8.addKeyListener(this);
        btnNumero9.addKeyListener(this);
        btnSuma.addKeyListener(this);
        btnResta.addKeyListener(this);
        btnMult.addKeyListener(this);
        btnDiv.addKeyListener(this);
        btnPunto.addKeyListener(this);
        btnIgual.addKeyListener(this);
        btnParentA.addKeyListener(this);
        btnParentC.addKeyListener(this);

        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false);
        screen.setBackground(Color.cyan);
        screen.setFont(new Font("TimesRoman", 2, 40));

        resultado.setHorizontalAlignment(JTextField.RIGHT);
        resultado.setEditable(false);
        resultado.setBackground(Color.cyan);
        resultado.setFont(new Font("TimesRoman", 2, 40));

        //contenedor norte
        contenedorN.add(this.screen);
        contenedorN.add(this.resultado);

        //añadir elementos al contenedor central
        contCentro1.add(this.btnBorrar1);
        contCentro1.add(this.btnNumero7);
        contCentro1.add(this.btnNumero8);
        contCentro1.add(this.btnNumero9);
        contCentro1.add(this.btnSuma);

        contCentro1.add(this.btnBorrar);
        contCentro1.add(this.btnNumero4);
        contCentro1.add(this.btnNumero5);
        contCentro1.add(this.btnNumero6);
        contCentro1.add(this.btnResta);

        contCentro1.add(this.btnParentA);
        contCentro1.add(this.btnNumero1);
        contCentro1.add(this.btnNumero2);
        contCentro1.add(this.btnNumero3);
        contCentro1.add(this.btnMult);

        contCentro1.add(this.btnParentC);
        contCentro1.add(this.btnNumero0);
        contCentro1.add(this.btnPunto);
        contCentro1.add(this.btnIgual);
        contCentro1.add(this.btnDiv);

        //insercion de los gridlayouts en el borderLayout
        contenedor.add(contenedorN, BorderLayout.NORTH);
        contenedor.add(contCentro1, BorderLayout.CENTER);

        //propiedades del frame
        frame.getContentPane().add(contenedor);
        frame.setSize(450, 400);
        frame.setLocation(50, 50);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        btnNumero0.requestFocus();
        btnNumero1.requestFocus();
        btnNumero2.requestFocus();
        btnNumero3.requestFocus();
        btnNumero4.requestFocus();
        btnNumero5.requestFocus();
        btnNumero6.requestFocus();
        btnNumero7.requestFocus();
        btnNumero8.requestFocus();
        btnNumero9.requestFocus();
        btnSuma.requestFocus();
        btnResta.requestFocus();
        btnMult.requestFocus();
        btnDiv.requestFocus();
        btnIgual.requestFocus();
        btnParentA.requestFocus();
        btnParentC.requestFocus();

        if (e.getSource() == btnNumero0) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("0");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "0");
            }
            operador = false;
            resultIgual=false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero1) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("1");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "1");
            }
            operador = false;
            resultIgual=false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero2) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("2");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "2");
            }
            operador = false;
            resultIgual=false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero3) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("3");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "3");
            }
            operador = false;
            resultIgual=false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero4) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("4");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "4");
            }
            operador = false;
            resultIgual=false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero5) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("5");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "5");
            }
            resultIgual=false;
            operador = false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero6) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("6");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "6");
            }
            resultIgual=false;
            operador = false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero7) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("7");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "7");
            }
            resultIgual=false;
            operador = false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero8) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("8");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "8");
            }
            resultIgual=false;
            operador = false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnNumero9) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("9");
                d.getPilaNum();
            }
            else{
                resultado.setText(resultado.getText() + "9");
            }
            resultIgual=false;
            operador = false;
            btnIgual.setEnabled(true);
        } else if (e.getSource() == btnParentA) {
            if ((!resultado.getText().endsWith(".")) && (resultado.getText().endsWith("+"))
                    || (resultado.getText().endsWith("-")) || (resultado.getText().endsWith("*"))
                    || (resultado.getText().endsWith("/"))) {
                resultado.setText(resultado.getText() + "(");
                contadorParent++;
                contPar++;
                btnIgual.setEnabled(false);
                //d.addPilaOper('(', true);
            }
        } else if (e.getSource() == btnParentC) {
            if ((!resultado.getText().endsWith(".")) && (!resultado.getText().endsWith("+"))
                    && (!resultado.getText().endsWith("-")) && (!resultado.getText().endsWith("*"))
                    && (!resultado.getText().endsWith("/")) && (!resultado.getText().endsWith("("))) {
                    while (contPar != 0) {
                        resultado.setText(resultado.getText() + ")");
                        contPar--;
                        //d.addPilaOper(')', true);
                    }
            }

        } else if ((e.getSource() == btnPunto) && (contador != true)) {
            if(resultIgual==true){
                screen.setText("");
                resultado.setText("0.");
                d.getPilaNum();
                btnIgual.setEnabled(false);
            }else{
                if ((resultado.getText().endsWith("+")) || (resultado.getText().endsWith("-")) 
                        || (resultado.getText().endsWith("*")) || (resultado.getText().endsWith("/")) 
                        || (resultado.getText().equals(""))
                        || (resultado.getText().endsWith("(")) || (resultado.getText().endsWith(")"))) {
                    resultado.setText(resultado.getText() + "0.");
                }
                else
                    resultado.setText(resultado.getText() + ".");
            }
            contador = true;
            operador = true;
            resultIgual=false;
        } else if (e.getSource() == btnBorrar) { //Borrar TODO
            resultado.setText("");
            screen.setText("");
            while(!d.esPilaNumVacia())
                d.getPilaNum();
            while(!d.esPilaOperVacia())
                d.getPilaOper();
            contador = false;
            resultIgual=true;
            menorPrio = false;
            btnIgual.setEnabled(true);
            operador = false;
            
        } else if (e.getSource() == btnBorrar1) { //Borrar numero
            if (resultIgual==true){
                resultado.setText("");
                screen.setText("");
                while(!d.esPilaNumVacia())
                    d.getPilaNum();
                while(!d.esPilaOperVacia())
                    d.getPilaOper();
                contador = false;
                resultIgual=true;
                menorPrio = false;
                btnIgual.setEnabled(true);
                operador = false;
            }else{
                String borrarNum =resultado.getText();
                if (!borrarNum.endsWith("+") && !borrarNum.endsWith("-") && !borrarNum.endsWith("*") 
                        && !borrarNum.endsWith("/") && !borrarNum.endsWith("(") && !borrarNum.endsWith(")")
                        && !borrarNum.endsWith(".") && !borrarNum.equals("")){
                    borrarNum= borrarNum.substring(0, borrarNum.length()-1);
                    if (borrarNum.endsWith("+") || borrarNum.endsWith("-") || borrarNum.endsWith("*") 
                        || borrarNum.endsWith("/") || borrarNum.endsWith("(") || borrarNum.endsWith(")")){
                        btnIgual.setEnabled(false);
                        operador = true;
                    }
                }//end-if
                resultado.setText(borrarNum);            
                //contador = false;
            }
        } else if (e.getSource() == btnSuma) {
            if (operador == false) {
                double num = d.transformaDouble(resultado.getText());
                d.addPilaNum(num, menorPrio);
                if (contadorParent>0){
                    menorPrio =d.addPilaOper('+', true);
                    menorPrio=false;
                }
                else
                    menorPrio =d.addPilaOper('+', false);
                resultado.setText(resultado.getText() + '+');                
                contador = false;
                operador = true;
                resultIgual=false;
                btnIgual.setEnabled(false);
            }
        } else if (e.getSource() == btnResta) {
            if (operador == false) {
                double num = d.transformaDouble(resultado.getText());
                d.addPilaNum(num, menorPrio);
                if (contadorParent>0){
                    menorPrio =d.addPilaOper('-', true);
                    menorPrio=false;
                }
                else
                    menorPrio =d.addPilaOper('-', false);                
                resultado.setText(resultado.getText() + '-');
                contador = false;
                operador = true;
                resultIgual=false;
                btnIgual.setEnabled(false);
            }
        } else if (e.getSource() == btnMult) {
            menorPrio=false;
            if (operador == false && resultIgual==false) {
                double num = d.transformaDouble(resultado.getText());
                d.addPilaNum(num, menorPrio);
                resultado.setText(resultado.getText() + '*');
                d.addPilaOper('*',false);
                contador = false;
                operador = true;
                resultIgual=false;
                menorPrio = false;
                btnIgual.setEnabled(false);
            }
        } else if (e.getSource() == btnDiv) {
            menorPrio=false;
            if (operador == false && resultIgual==false) {
                double num = d.transformaDouble(resultado.getText());
                d.addPilaNum(num, menorPrio);
                resultado.setText(resultado.getText() + '/');
                d.addPilaOper('/',false);
                contador = false;
                operador = true;
                resultIgual=false;
                menorPrio = false;
                btnIgual.setEnabled(false);
            }
        } else if (e.getSource() == btnIgual) {
            String stringTotal = "";
            String par="";
            boolean error=false;
            screen.setText("");
            double num = d.transformaDouble(resultado.getText());
            d.addPilaNum(num,menorPrio);
            screen.setText(screen.getText() + resultado.getText());
            while (contPar > 0) {
                par+=(")");
                contPar--;
                if (contPar==0)
                    screen.setText(resultado.getText() + par);
            }          
            while (!d.esPilaOperVacia()) {
                d.setNum1(d.getPilaNum());
                d.setNum2(d.getPilaNum());
                
                switch (d.getPilaOper()) {

                    case '+':
                        d.setTotal(d.suma());
                        d.addPilaNum(d.getTotal(),false);
                        break;
                    case '-':
                        d.setTotal(d.resta());
                        d.addPilaNum(d.getTotal(),false);
                        break;

                    case '*':
                        d.setTotal(d.mult());
                        d.addPilaNum(d.getTotal(),false);
                        break;

                    case '/':
                        if (d.getNum1()!=0){
                            d.setTotal(d.div());
                            d.addPilaNum(d.getTotal(),false);
                        }else{
                            screen.setText("Error Div /0");
                            resultado.setText("");
                            error=true;
                            while(!d.esPilaNumVacia())
                                d.getPilaNum();
                            while(!d.esPilaOperVacia())
                                d.getPilaOper();
                        }
                        break;
                }
            }//end-while
            if (error==false){
                stringTotal= (String.valueOf(d.getPilaNum()));
                resultado.setText(stringTotal);
            }
            contador = false;
            operador = false;
            resultIgual = true;
            menorPrio = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        //codigos de teclado         
        if (ke.getKeyCode() == 10) {
            btnIgual.doClick();
        } else if (ke.getKeyCode() == 48) {
            btnNumero0.doClick();
        } else if (ke.getKeyCode() == 49) {
            btnNumero1.doClick();
        } else if (ke.getKeyCode() == 50) {
            btnNumero2.doClick();
        } else if (ke.getKeyCode() == 51) {
            btnNumero3.doClick();
        } else if (ke.getKeyCode() == 52) {
            btnNumero4.doClick();
        } else if (ke.getKeyCode() == 53) {
            btnNumero5.doClick();
        } else if (ke.getKeyCode() == 54) {
            btnNumero6.doClick();
        } else if (ke.getKeyCode() == 55) {
            btnNumero7.doClick();
        } else if (ke.getKeyCode() == 56) {
            btnNumero8.doClick();
        } else if (ke.getKeyCode() == 57) {
            btnNumero9.doClick();
        } else if (ke.getKeyCode() == 127)//retroceso
        {
            btnBorrar.doClick();
        } else if (ke.getKeyCode() == 8)//suprimir
        {
            btnBorrar1.doClick();
        } else if (ke.getKeyCode() == 40)//parentesis Abierto
        {
            btnParentA.doClick();
        } else if (ke.getKeyCode() == 41)//parentesis Cerrado
        {
            btnParentC.doClick();
        }

        //codigos de teclado numerico
        if (ke.getKeyCode() == 96) {
            btnNumero0.doClick();
        } else if (ke.getKeyCode() == 97) {
            btnNumero1.doClick();
        } else if (ke.getKeyCode() == 98) {
            btnNumero2.doClick();
        } else if (ke.getKeyCode() == 99) {
            btnNumero3.doClick();
        } else if (ke.getKeyCode() == 100) {
            btnNumero4.doClick();
        } else if (ke.getKeyCode() == 101) {
            btnNumero5.doClick();
        } else if (ke.getKeyCode() == 102) {
            btnNumero6.doClick();
        } else if (ke.getKeyCode() == 103) {
            btnNumero7.doClick();
        } else if (ke.getKeyCode() == 104) {
            btnNumero8.doClick();
        } else if (ke.getKeyCode() == 105) {
            btnNumero9.doClick();
        } else if (ke.getKeyCode() == 106) {
            btnMult.doClick();
        } else if (ke.getKeyCode() == 107) {
            btnSuma.doClick();
        } else if (ke.getKeyCode() == 109) {
            btnResta.doClick();
        } else if (ke.getKeyCode() == 111) {
            btnDiv.doClick();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
