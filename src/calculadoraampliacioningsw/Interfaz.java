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
public class Interfaz extends JFrame implements ActionListener, KeyListener{
    
    
    Datos d = new Datos();
    //contador punto
    boolean contador=false;
    boolean operador=false;

    //creacion imagenes para añadir a botones
    ImageIcon cero=new ImageIcon("Captura0.JPG");
    ImageIcon uno=new ImageIcon("Captura1.JPG");
    ImageIcon dos=new ImageIcon("Captura2.JPG");
    ImageIcon tres=new ImageIcon("Captura3.JPG");
    ImageIcon cuatro=new ImageIcon("Captura4.JPG");
    ImageIcon cinco=new ImageIcon("Captura5.JPG");
    ImageIcon seis=new ImageIcon("Captura6.JPG");
    ImageIcon siete=new ImageIcon("Captura7.JPG");
    ImageIcon ocho=new ImageIcon("Captura8.JPG");
    ImageIcon nueve=new ImageIcon("Captura9.JPG");
    ImageIcon punto=new ImageIcon("CapturaPunto.JPG");
    ImageIcon igual=new ImageIcon("CapturaIgual.JPG");
    ImageIcon suma=new ImageIcon("CapturaMas.JPG");
    ImageIcon resta=new ImageIcon("CapturaMenos.JPG");
    ImageIcon mult=new ImageIcon("CapturaPor.JPG");
    ImageIcon div=new ImageIcon("CapturaDivision.JPG");
    ImageIcon c=new ImageIcon("CapturaC.JPG");
    ImageIcon ce=new ImageIcon("CapturaCE.JPG");
    ImageIcon abrirPar=new ImageIcon("CapturaAbreParent.JPG");
    ImageIcon cerrarPar=new ImageIcon("CapturaCierraParent.JPG"); 
    
    //creacion botones calculadora
    private JButton btnNumero0=new JButton (cero);
    private JButton btnNumero1=new JButton (uno);
    private JButton btnNumero2=new JButton (dos);
    private JButton btnNumero3=new JButton (tres);
    private JButton btnNumero4=new JButton (cuatro);
    private JButton btnNumero5=new JButton (cinco);
    private JButton btnNumero6=new JButton (seis);
    private JButton btnNumero7=new JButton (siete);
    private JButton btnNumero8=new JButton (ocho);
    private JButton btnNumero9=new JButton (nueve);
    private JButton btnPunto=new JButton (punto);
    private JButton btnBorrar=new JButton (c);
    private JButton btnBorrar1=new JButton (ce);
    private JButton btnParentA=new JButton (abrirPar);
    private JButton btnParentC=new JButton (cerrarPar);
    
    private JButton btnIgual=new JButton (igual);
    private JButton btnSuma=new JButton (suma);
    private JButton btnResta=new JButton (resta);
    private JButton btnMult=new JButton (mult);
    private JButton btnDiv=new JButton (div);
    
    private JTextField screen= new JTextField(30);
    private JTextField resultado= new JTextField(30);
    
    
    public Interfaz ()
    {        
        JFrame frame = new JFrame("Calculadora");
        Container contenedor = new Container();
        contenedor.setLayout(new BorderLayout());
        
        Container contenedorN = new Container();
        contenedorN.setLayout(new GridLayout(2,1));
        
        Container contCentro1 = new Container();
        contCentro1.setLayout(new GridLayout(4,5));
        
        Container contenedorD = new Container();
        contenedorD.setLayout(new GridLayout(4,1));
        
        Container contenedorI = new Container();
        contenedorI.setLayout(new GridLayout(4,1));

        
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
        screen.setFont(new Font("TimesRoman",2,40));
        
        resultado.setHorizontalAlignment(JTextField.RIGHT);
        resultado.setEditable(false);
        resultado.setBackground(Color.cyan);
        resultado.setFont(new Font("TimesRoman",2,40));
        
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
        
        //añadir elementos al contenedor izquierda
       /* contenedorI.add(this.btnBorrar1);
        contenedorI.add(this.btnBorrar);
        contenedorI.add(this.btnParentA);
        contenedorI.add(this.btnDiv);   
        
        //añadir elementos al contenedor derecha
        contenedorD.add(this.btnSuma);
        contenedorD.add(this.btnResta);
        contenedorD.add(this.btnMult);
        contenedorD.add(this.btnDiv);
        */
       
        //insercion de los gridlayouts en el borderLayout
        contenedor.add(contenedorN, BorderLayout.NORTH );
        contenedor.add(contCentro1, BorderLayout.CENTER);
        //contenedor.add(contenedorD, BorderLayout.EAST);
        //contenedor.add(contenedorI, BorderLayout.WEST);
        
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
        
        
        if (e.getSource() == btnNumero0){
            resultado.setText(resultado.getText()+"0");
            operador=false;
        }
        else if (e.getSource()==btnNumero1){
                resultado.setText(resultado.getText()+"1");
                operador=false;
        }else if (e.getSource()==btnNumero2){
                resultado.setText(resultado.getText()+"2");
                operador=false;
        }else if (e.getSource()==btnNumero3){
                resultado.setText(resultado.getText()+"3");
                operador=false;
        }else if (e.getSource()==btnNumero4){
                resultado.setText(resultado.getText()+"4");
                operador=false;
        }else if (e.getSource()==btnNumero5){
                resultado.setText(resultado.getText()+"5");
                operador=false;
        }else if (e.getSource()==btnNumero6){
                resultado.setText(resultado.getText()+"6");
                operador=false;
        }else if (e.getSource()==btnNumero7){
                resultado.setText(resultado.getText()+"7");
                operador=false;
        }else if (e.getSource()==btnNumero8){
                resultado.setText(resultado.getText()+"8");
                operador=false;
        }else if (e.getSource()==btnNumero9){
                resultado.setText(resultado.getText()+"9");
                operador=false;
        }else if (e.getSource()==btnParentA){
                resultado.setText(resultado.getText()+"(");
        }else if (e.getSource()==btnParentC){
                resultado.setText(resultado.getText()+")");
        }else if ((e.getSource()==btnPunto) && (contador!=true)){
                resultado.setText(resultado.getText()+".");
                contador=true;
                operador=true;
        }
        else if (e.getSource()==btnBorrar)
        {
                resultado.setText("");
                contador=false;
        }
        else if (e.getSource()==btnBorrar1)
        {
                d.setNum1(0);
                d.setNum2(0);
                resultado.setText("");
                contador=false;
        }
        
        else if (e.getSource()==btnSuma)
        {
            if(operador==false){    
                double dobleNum1 = Double.parseDouble(resultado.getText());
                d.addPilaNum(dobleNum1);
                screen.setText(screen.getText()+ resultado.getText()+'+');
                resultado.setText("");
                //d.setOper('+');
                d.addPilaOper('+');
                contador=false;
                operador=true;
            }
        }
        else if (e.getSource()==btnResta)
        {
            if (operador==false){               
                double dobleNum1 = Double.parseDouble(resultado.getText());
                d.addPilaNum(dobleNum1);
                screen.setText(resultado.getText()+'-');
                resultado.setText("");
                d.addPilaOper('-');
                contador=false;
                operador=true;
            }
        }
        else if (e.getSource()==btnMult)
        {
            if (operador==false){
                double dobleNum1 = Double.parseDouble(resultado.getText());
                d.addPilaNum(dobleNum1);
                screen.setText(resultado.getText()+'*');
                resultado.setText("");
                d.addPilaOper('*');
                contador=false;
                operador=true;
            }
        }
        else if (e.getSource()==btnDiv)
        {
            if (operador==false){    
                double dobleNum1 = Double.parseDouble(resultado.getText());
                d.addPilaNum(dobleNum1);
                screen.setText(resultado.getText()+'/');
                resultado.setText("");
                d.addPilaOper('/');
                contador=false;
                operador=true;
            }
        }
        else if (e.getSource()==btnIgual)
        {
                double dobleNum2 = Double.parseDouble(resultado.getText());
                d.addPilaNum(dobleNum2);
                screen.setText(screen.getText()+ resultado.getText());
                d.getNum1();
                d.getNum2();
                switch(d.getOper())
                {
                    case '+':   d.setTotal(d.suma());
                                String stringTotal = String.valueOf(d.getTotal());
                                resultado.setText(stringTotal);
                                break;
                    case '-':   d.setTotal(d.resta());
                                String stringTotal2 = String.valueOf(d.getTotal());
                                resultado.setText(stringTotal2);
                                break;
                        
                    case '*':   d.setTotal(d.mult());
                                String stringTotal3 = String.valueOf(d.getTotal());
                                resultado.setText(stringTotal3);
                                break;
                        
                    case '/':    d.setTotal(d.div());
                                String stringTotal4 = String.valueOf(d.getTotal());
                                resultado.setText(stringTotal4);
                                break;
                }
                contador=false;
                operador=false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
            
        //codigos de teclado         
        if (ke.getKeyCode()==10)
            btnIgual.doClick();
        else if (ke.getKeyCode()==48)
            btnNumero0.doClick();
        else if (ke.getKeyCode()==49)
            btnNumero1.doClick();
        else if (ke.getKeyCode()==50)
            btnNumero2.doClick();
        else if (ke.getKeyCode()==51)
            btnNumero3.doClick();
        else if (ke.getKeyCode()==52)
            btnNumero4.doClick();
        else if (ke.getKeyCode()==53)
            btnNumero5.doClick();
        else if (ke.getKeyCode()==54)
            btnNumero6.doClick();
        else if (ke.getKeyCode()==55)
            btnNumero7.doClick();
        else if (ke.getKeyCode()==56)
            btnNumero8.doClick();
        else if (ke.getKeyCode()==57)
            btnNumero9.doClick();
        else if (ke.getKeyCode()==127)//retroceso
            btnBorrar.doClick();
        else if (ke.getKeyCode()==8)//suprimir
            btnBorrar1.doClick();
        else if (ke.getKeyCode()==40)//parentesis Abierto
            btnParentA.doClick();
        else if (ke.getKeyCode()==41)//parentesis Cerrado
            btnParentC.doClick();
        
        //codigos de teclado numerico
        if (ke.getKeyCode()==96)
            btnNumero0.doClick();
        else if (ke.getKeyCode()==97)
            btnNumero1.doClick();
        else if (ke.getKeyCode()==98)
            btnNumero2.doClick();
        else if (ke.getKeyCode()==99)
            btnNumero3.doClick();
        else if (ke.getKeyCode()==100)
            btnNumero4.doClick();
        else if (ke.getKeyCode()==101)
            btnNumero5.doClick();
        else if (ke.getKeyCode()==102)
            btnNumero6.doClick();
        else if (ke.getKeyCode()==103)
            btnNumero7.doClick();
        else if (ke.getKeyCode()==104)
            btnNumero8.doClick();
        else if (ke.getKeyCode()==105)
            btnNumero9.doClick();
        else if (ke.getKeyCode()==106)
            btnMult.doClick();
        else if (ke.getKeyCode()==107)
            btnSuma.doClick();
        else if (ke.getKeyCode()==109)
            btnResta.doClick();
        else if (ke.getKeyCode()==111)
            btnDiv.doClick();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
