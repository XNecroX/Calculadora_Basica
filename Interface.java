
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener; 
import java.awt.Dimension;
//Bordes
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;



public class Interface implements ActionListener
{
    C4lculadora calcu = new C4lculadora();
    JFrame frame;
    JPanel panelSuperior, panelInferior;
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btRT, btCE, btCL, btMas, btMenos, btMul, btDiv, btIgual, btRaiz, btPunto;
    JTextField pantalla;
   

    public Interface(){
        construyePanelSuperior();
        construyePanelInferior();
        construyeVentana();
    }

    void construyePanelSuperior(){
        //Color
        //Color Blanco=new Color(242, 242, 242);
        panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.setBackground(new java.awt.Color(255,255,245));
        pantalla = new JTextField("");
        pantalla.setText("0");
        pantalla.setPreferredSize(new Dimension(200, 30)); //tamaño 
        pantalla.setHorizontalAlignment(JTextField.RIGHT); //horientazion 
        panelSuperior.add(pantalla);
    }

    void construyePanelInferior(){
        panelInferior= new JPanel();
        Color claro = new java.awt.Color(255, 255, 255);
       // raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
       // Border raised = new SynthBorder(SynthBorder());
        panelInferior.setBackground(new java.awt.Color(255,255,245));
        panelInferior.setLayout(new GridLayout(5,4,8,8));
       
        //bt1.setBorder(raised);
        //bt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)); 
        //bt1.setBorderPainted(false); //Borde
       /* bt1.setContentAreaFilled(true);
        bt1.setFocusable(true);
        bt1.setRolloverEnabled(true);  */
        //Intanciado de Botones 
        bt1=new JButton("1");
        bt2=new JButton("2");
        bt3=new JButton("3");
        bt4=new JButton("4");
        bt5=new JButton("5");
        bt6=new JButton("6");
        bt7=new JButton("7");
        bt8=new JButton("8");
        bt9=new JButton("9");
        bt0=new JButton("0");
        btRT=new JButton("M+"); 
        btCE=new JButton("CE"); //para eliminar un digito no todo
        btCL=new JButton("MC"); //Limpiar todo
        btMas=new JButton("+");
        btMenos=new JButton("-");
        btMul=new JButton("x");
        btDiv=new JButton("/");
        btIgual=new JButton("=");
        btRaiz=new JButton("√");    
        btPunto=new JButton(".");
        //Cambio de color de Botones 
        bt1.setBackground(claro);
        bt2.setBackground(claro);
        bt3.setBackground(claro);
        bt4.setBackground(claro);
        bt5.setBackground(claro);
        bt6.setBackground(claro);
        bt7.setBackground(claro);
        bt8.setBackground(claro);
        bt9.setBackground(claro);
        bt0.setBackground(claro);
        btRT.setBackground(claro); 
        btCE.setBackground(claro); //para eliminar un digito no todo
        btCL.setBackground(claro); //Limpiar todo
        btMas.setBackground(claro);
        btMenos.setBackground(claro);
        btMul.setBackground(claro);
        btDiv.setBackground(claro);
        //resalto del Boton Igual 
        btIgual.setBackground(new java.awt.Color(139, 156, 252));
        btIgual.setForeground(new java.awt.Color(255,255,255));
        btRaiz.setBackground(claro);    
        btPunto.setBackground(claro);
        //Escuha de Botones 
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        btPunto.addActionListener(this);
        btMas.addActionListener(this);
        btMenos.addActionListener(this);
        btMul.addActionListener(this);
        btDiv.addActionListener(this);
        btIgual.addActionListener(this);
        btCE.addActionListener(this);
        btRaiz.addActionListener(this);
        btCE.addActionListener(this);
        //añadir Botones a la Ventana (panel)
        panelInferior.add(btRT);
        panelInferior.add(btCE);
        panelInferior.add(btCL);
        panelInferior.add(btRaiz);
        panelInferior.add(bt7);
        panelInferior.add(bt8);
        panelInferior.add(bt9);
        panelInferior.add(btDiv);
        panelInferior.add(bt4);
        panelInferior.add(bt5);
        panelInferior.add(bt6);
        panelInferior.add(btMul);
        panelInferior.add(bt1);
          panelInferior.add(bt2);
        panelInferior.add(bt3);
        panelInferior.add(btMenos);
        panelInferior.add(bt0);
        panelInferior.add(btPunto);
        panelInferior.add(btIgual);
        panelInferior.add(btMas);
    }

    void construyeVentana(){
        frame = new JFrame("Calculadora");
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        frame.setResizable(false);
        frame.add(panelSuperior);
        frame.add(panelInferior);
        frame.pack();//este pack es necesario 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //edit = new
    }
                //implementamos el metodo
    
                  //otro Metodo necesario
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            if(evt.getSource() == bt0)
            {
                  calcu.agregarNum(0);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt1)
            {
                  calcu.agregarNum(1);
                  pantalla.setText(calcu.getDigito());
            }
            
             if(evt.getSource() == bt2)
            {
                  calcu.agregarNum(2);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt3)
            {
                  calcu.agregarNum(3);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt4)
            {
                  calcu.agregarNum(4);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt5)
            {
                  calcu.agregarNum(5);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt6)
            {
                  calcu.agregarNum(6);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt7)
            {
                  calcu.agregarNum(7);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt8)
            {
                  calcu.agregarNum(8);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == bt9)
            {
                  calcu.agregarNum(9);
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == btPunto)
            {
                  calcu.agregarNum(',');
                  pantalla.setText(calcu.getDigito());
            }
            
            if(evt.getSource() == btMas)
            {
                  calcu.suma(pantalla.getText());
                  pantalla.setText("");
            }
            
            if(evt.getSource() == btMenos)
            {
                  calcu.resta(pantalla.getText());
                  pantalla.setText("");
            }
            
            if(evt.getSource() == btMul)
            {
                  calcu.multiplicacion(pantalla.getText());
                  pantalla.setText("");
            }
            
            if(evt.getSource() == btDiv)
            {
                  calcu.divicion(pantalla.getText());
                  pantalla.setText("");;
            }
            
            if(evt.getSource() == btRaiz)
            {
                  calcu.raiz(pantalla.getText());
                  //pantalla.setText("");
            }
            
            if(evt.getSource() == btIgual)
            {
                pantalla.setText(""+ calcu.producto(pantalla.getText()));
            }
            
            if(evt.getSource() == btCE)
            {
                calcu.CE(pantalla.getText());
                pantalla.setText("0");
            }
            
            /* Para poder poner los datos que ingrese el usuario es necesario concatenar las varaibles 
                                Variable.concate*/
            
           
        }
        
    
   
   /* private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Boton 1 
        calcu.agregarNum(1);
        pantalla.setText(calcu.getDigito());
    }
    
      public void bt2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        //Boton 1 = bt2
        calcu.agregarNum(2);
       pantalla.setText(calcu.getDigito());
    }
    */
      
    

  public static void main(String args [] ){ //inforux
      
      
        //new Interface();
        
       
        
    }
}