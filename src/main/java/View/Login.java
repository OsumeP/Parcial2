/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.Agregar.GenerarListener;
import static View.Agregar.calculo;
import static View.Agregar.id;
import static View.Agregar.nombre;
import static View.Agregar.root;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Login {
    
    public static JTextField contraseña;
    public static JTextField usuario;
    public static JFrame root;
    public static ActionListener ingresar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (Login.contraseña.getText().equals("123") && Login.usuario.getText().equals("JuanDavid")){
                    Login.root.setVisible(false);
                    Agregar.Iniciar();
                }
                else{
                    Login.lbAviso.setText("La contraseña o usurio son incorrectas");
                }
            }
        };
    
    public static JLabel lbAviso;
    
    
    public static void DibujarLogin(){
        root = Procesos.CreacionFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
                
        
        JLabel lbNumero = new JLabel("Usuario:");
        lbNumero.setBounds(20, 20, 100, 20);
        panel.add(lbNumero);
        
        usuario = new JTextField();
        id.setBounds(200, 20, 100, 20);
        panel.add(id);
        
        JButton btnCalcular = new JButton("Ingresar");
        btnCalcular.setBounds(20, 125, 100, 20);
        btnCalcular.addActionListener(ingresar);
        panel.add(btnCalcular);
        
        JLabel lbResul = new JLabel("Contraseña:");
        lbResul.setBounds(20, 80, 100, 20);
        panel.add(lbResul);
        
        contraseña = new JTextField();
        contraseña.setBounds(200, 80, 300, 20);
        panel.add(contraseña);
        
        lbAviso = new JLabel("");
        lbAviso.setBounds(20, 120, 100, 20);
        panel.add(lbAviso);
    }
}
