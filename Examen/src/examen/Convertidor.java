/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.ActionEvent;

/**
 *
 * @author Alumno
 */
public class Convertidor extends JFrame implements ActionListener {
    
    public JTextField cajapesos, cajaresultado;
    public JButton b1, b2, b3, b4, b5, b6, b7, b8,b9,b0, bp, bconvertir, blimpiar;
    public JLabel texpeso, texdolar;
    String valor="";
    double res;
    
    public Convertidor (){
        setSize (800,800);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        cajapesos = new JTextField();
        cajaresultado =new JTextField();
        texpeso = new JLabel("Inserte su cantidad en pesos: ");
        texdolar = new JLabel("Su cantidad en dolares: ");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bp = new JButton(".");
        bconvertir = new JButton("Convertir");
        blimpiar = new JButton("Limpiar");
        
        texpeso.setBounds(50, 50, 200, 50);
        cajapesos.setBounds(50, 100, 500,50);
        cajapesos.setEditable(false);
        
        b1.setBounds(50, 210, 70, 70);
        b4.setBounds(50, 300, 70, 70);
        b7.setBounds(50, 390, 70, 70);
        b0.setBounds(50, 480, 70, 70);
        
        b2.setBounds(150, 210, 70, 70);
        b5.setBounds(150, 300, 70, 70);
        b8.setBounds(150, 390, 70, 70);
        bp.setBounds(150, 480, 70, 70);
        
        b3.setBounds(250, 210, 70, 70);
        b6.setBounds(250, 300, 70, 70);
        b9.setBounds(250, 390, 70, 70);
        
        bconvertir.setBounds(400, 210, 150, 70);
        blimpiar.setBounds(400, 300, 150, 70);
        
        texdolar.setBounds(400, 500, 200, 50);
        cajaresultado.setBounds(400, 550, 200,50 );
        cajaresultado.setEditable(false);
        
        add(texpeso);
        add(cajapesos);
        add(b1);
        add(b4);
        add(b7);
        add(b0);
        add(b2);
        add(b5);
        add(b8);
        add(bp);
        add(b3);
        add(b6);
        add(b9);
        add(bconvertir);
        add(blimpiar);
        add(texdolar);
        add(cajaresultado);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + ("1");
                
                cajapesos.setText(valor);
            } 
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor = valor + ("2");
                
                cajapesos.setText(valor);
            } 
        });
        
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + ("3");
                
                cajapesos.setText(valor);
            } 
        });
        
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor = valor + ("4");
                
                cajapesos.setText(valor);
            } 
        });
        
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + ("5");
                
                cajapesos.setText(valor);
            } 
        });
        
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor = valor + ("6");
                
                cajapesos.setText(valor);
            } 
        });
        
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + ("7");
                
                cajapesos.setText(valor);
            } 
        });
        
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor = valor + ("8");
                
                cajapesos.setText(valor);
            } 
        });
        
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + ("9");
                
                cajapesos.setText(valor);
            } 
        });
        
        b0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor = valor + ("0");
                
                cajapesos.setText(valor);
            } 
        });
        
        bp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor=valor + (".");
                
                cajapesos.setText(valor);
            } 
        });
        
        bconvertir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                convertir();
            } 
        });
        
        blimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                valor="";
                cajapesos.setText("");
            } 
        });
    }
    
    public void convertir(){
        res=(Double.parseDouble(cajapesos.getText())) / 17;
        
        cajaresultado.setText(Double.toString(res));
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


