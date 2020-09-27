/*
 -----------------------------------
 Programa creado por Gustavo Vasquez
 -----------------------------------
 */
package editor;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Editor extends JFrame{
    
    public Editor(){
        
        JFrame form = new JFrame();
        
        JLabel titulo = new JLabel("Texto");
        titulo.setForeground(Color.blue);
        titulo.setFont(new Font("Serif", Font.BOLD, 30));
        
        JLabel fuente = new JLabel("Fuente", JLabel.LEFT);
        fuente.setForeground(Color.RED);
        fuente.setFont(new Font("Serif", Font.BOLD, 14));
        
        JLabel tamaño = new JLabel("Tamaño", JLabel.LEFT);
        tamaño.setForeground(Color.RED);
        tamaño.setFont(new Font("Serif", Font.BOLD, 14));
        
        JLabel color = new JLabel("Color", JLabel.LEFT);
        color.setForeground(Color.RED);
        color.setFont(new Font("Serif", Font.BOLD, 14));
        
        JLabel estilo = new JLabel("Estilo", JLabel.LEFT);
        estilo.setForeground(Color.RED);
        estilo.setFont(new Font("Serif", Font.BOLD, 14));
        
        final JTextField texto = new JTextField ("", JTextField.CENTER);
        texto.setHorizontalAlignment(JTextField.CENTER); 
        
        
        /*Fuente de letra*/
        JRadioButton radio1 = new JRadioButton("Arial", false);
        JRadioButton radio2 = new JRadioButton("Arial black", false);
        JRadioButton radio3 = new JRadioButton ("Serif", false);
        JRadioButton radio4 = new JRadioButton ("algerian", false);
        
        /*Tamaño de letra*/
        JRadioButton radio5 = new JRadioButton ("10", false);
        JRadioButton radio6 = new JRadioButton ("12", false);
        JRadioButton radio7 = new JRadioButton ("20", false);
        JRadioButton radio8 = new JRadioButton ("45", false);
        
        /*Color de letra*/
        JRadioButton radio9 = new JRadioButton ("Rojo", false);
        radio9.setForeground(Color.RED);
        
        JRadioButton radio10 = new JRadioButton ("Azul", false);
        radio10.setForeground(Color.BLUE);
        
        JRadioButton radio11 = new JRadioButton ("Verde", false);
        radio11.setForeground(Color.GREEN);
        
        JRadioButton radio12 = new JRadioButton ("Magenta", false);
        radio12.setForeground(Color.MAGENTA);
        
        /*Estilo*/
        JRadioButton radio13 = new JRadioButton ("negrita", false);
        JRadioButton radio14 = new JRadioButton ("subrayado", false);
        JRadioButton radio15 = new JRadioButton ("cursiva", false);
        JRadioButton radio16 = new JRadioButton ("negrita cursiva", false);
        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(radio1);
        grupo1.add(radio2);
        grupo1.add(radio3);
        grupo1.add(radio4);
        
        ButtonGroup grupo2 = new ButtonGroup();
        grupo1.add(radio5);
        grupo1.add(radio6);
        grupo1.add(radio7);
        grupo1.add(radio8);
        
        ButtonGroup grupo3 = new ButtonGroup();
        grupo1.add(radio9);
        grupo1.add(radio10);
        grupo1.add(radio11);
        grupo1.add(radio12);
        
        ButtonGroup grupo4 = new ButtonGroup();
        grupo1.add(radio13);
        grupo1.add(radio14);
        grupo1.add(radio15);
        grupo1.add(radio16);
        
        form.setLayout(null);
        
        titulo.setBounds(270, 1, 150, 50);
        form.add(titulo);
        
        texto.setBounds(230, 50, 150, 50);
        form.add(texto);
        
        fuente.setBounds(30, 100, 150, 50);
        form.add(fuente);
        
        radio1.setBounds(25, 128, 150, 50);
        form.add(radio1);
        
        radio2.setBounds(25, 158, 150, 50);
        form.add(radio2);
        
        radio3.setBounds(25, 188, 150, 50);
        form.add(radio3);
        
        radio4.setBounds(25, 218, 150, 50);
        form.add(radio4);
        
        tamaño.setBounds(180, 100, 150, 50);
        form.add(tamaño);
        
        radio5.setBounds(180, 128, 150, 50);
        form.add(radio5);
        
        radio6.setBounds(180, 158, 150, 50);
        form.add(radio6);
        
        radio7.setBounds(180, 188, 150, 50);
        form.add(radio7);
        
        radio8.setBounds(180, 218, 150, 50);
        form.add(radio8);
       
        color.setBounds(330, 100, 150, 50);
        form.add(color);
        
        radio9.setBounds(330, 128, 150, 50);
        form.add(radio9);
        
        radio10.setBounds(330, 158, 150, 50);
        form.add(radio10);
        
        radio11.setBounds(330, 188, 150, 50);
        form.add(radio11);
        
        radio12.setBounds(330, 218, 150, 50);
        form.add(radio12);
        
        estilo.setBounds(480, 100, 150, 50);
        form.add(estilo);
        
        radio13.setBounds(480, 128, 150, 50);
        form.add(radio13);
        
        radio14.setBounds(480, 158, 150, 50);
        form.add(radio14);
        
        radio15.setBounds(480, 188, 150, 50);
        form.add(radio15);
        
        radio16.setBounds(480, 218, 150, 50);
        form.add(radio16);
        
        radio1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("calibri", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, "El texto ahora es CALIBRI");
            }
        });
        
        radio2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("arial black", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, "El texto ahora es ARIAL BLACK");
            }
        });
        
        radio3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, "El texto ahora es SERIF");
            }
        });
        
        radio4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("algerian", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, "El texto ahora es ALGERIAN");
            }
        });
        
        radio5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 10));
                JOptionPane.showMessageDialog(null, "El texto ahora es de tamaño 10");
            }
        });
        
        radio6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, "El texto ahora es de tamaño 12");
            }
        });
        
        radio7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 20));
                JOptionPane.showMessageDialog(null, "El texto ahora es de tamaño 20");
            }
        });
        
        radio8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 45));
                JOptionPane.showMessageDialog(null, "El texto ahora es de tamaño 45");
            }
        });
        
        radio9.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent evt) {
                 texto.setFont(new Font("", Font.PLAIN, 12));
                 texto.setForeground(Color.RED);
                 JOptionPane.showMessageDialog(null, "El texto ahora es de color ROJO");
             }
         });
        
        radio10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 12));
                texto.setForeground(Color.BLUE);
                JOptionPane.showMessageDialog(null, "El texto ahora es de color AZUL");
            }
        });
        
        radio11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 12));
                texto.setForeground(Color.GREEN);
                JOptionPane.showMessageDialog(null, "El texto ahora es de color VERDE");
            }
        });
        
        radio12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                texto.setFont(new Font("", Font.PLAIN, 12));
                texto.setForeground(Color.MAGENTA);
                JOptionPane.showMessageDialog(null, "El texto ahora es de color MAGENTA");
            }
        });
        
        radio13.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent evt) {
                 texto.setFont(new Font("", Font.BOLD, 12));
                 texto.setForeground(Color.black);
                 JOptionPane.showMessageDialog(null, "El texto ahora esTA en NEGRITAS");
             }
         });
        
        radio14.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent evt) {
                 texto.setFont(new Font("", Font.PLAIN, 12));
                 texto.setForeground(Color.black);
                 JOptionPane.showMessageDialog(null, "El texto ahora esta SUBRAYADO");
             }
         });
        
        radio15.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent evt) {
                 texto.setFont(new Font("", Font.ITALIC, 12));
                 texto.setForeground(Color.black);
                 JOptionPane.showMessageDialog(null, "El texto ahora esta en CURSIVA ");
             }
         });
        
        radio16.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent evt) {
                 texto.setForeground(Color.black);
                 texto.setFont(new Font("", Font.ITALIC | Font.BOLD, 12));
                 JOptionPane.showMessageDialog(null, "El texto ahora esta en NEGRITA CURSIVA");
             }
         });

        form.setTitle("Editor");
        form.setSize(630, 350);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
       Editor edit = new Editor();
    }
    
}
