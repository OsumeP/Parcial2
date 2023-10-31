/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.RealTimeDataBase;
import ModelView.Calcular;
import ModelView.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Juan David Patarroyo
 */
public class Agregar {
    
    public static JFrame root; 
    public static JComboBox cbFuncion;
    public static JTextField id;
    public static JTextField nombre;
    public static JTextField marca;
    public static JTextField precio;
    public static ActionListener calculo;
    public static ActionListener historial;
    public static Producto product;
    
    public static void Iniciar(){
        root = Procesos.CreacionFrame();
        GenerarListener();
        DibujarCalculadora();
    }
    
    public static void DibujarCalculadora(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
                
        
        JLabel lbNumero = new JLabel("Id:");
        lbNumero.setBounds(20, 20, 100, 20);
        panel.add(lbNumero);
        
        id = new JTextField();
        id.setBounds(200, 20, 100, 20);
        panel.add(id);
        
        JButton btnCalcular = new JButton("Guardar");
        btnCalcular.setBounds(350, 155, 100, 20);
        btnCalcular.addActionListener(calculo);
        panel.add(btnCalcular);
        
        JLabel lbResul = new JLabel("Nombre:");
        lbResul.setBounds(20, 80, 100, 20);
        panel.add(lbResul);
        
        nombre = new JTextField();
        nombre.setBounds(200, 80, 300, 20);
        panel.add(nombre);
        
        JLabel lbMarca = new JLabel("Marca:");
        lbMarca.setBounds(20, 105, 100, 20);
        panel.add(lbMarca);
        
        marca = new JTextField();
        marca.setBounds(200, 105, 300, 20);
        panel.add(marca);
        
        JLabel lbPrecio = new JLabel("Precio:");
        lbPrecio.setBounds(20, 135, 100, 20);
        panel.add(lbPrecio);
        
        precio = new JTextField();
        precio.setBounds(200, 135, 300, 20);
        panel.add(precio);
        
        JButton btnHistorial = new JButton("Bodega");
        btnHistorial.setBounds(20, 155, 100, 20);
        btnHistorial.addActionListener(historial);
        panel.add(btnHistorial);
        
        
        RealTimeDataBase.conectarBase();
        
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
    }
    
    public static void GenerarListener(){
        calculo = new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num = Integer.parseInt(Agregar.precio.getText());
                    product = new Producto(Agregar.id.getText(), Agregar.nombre.getText(), num, Agregar.marca.getText());
                    product.ingresarNuevo();
                } catch(NumberFormatException ex){
                    //Agregar.lbResultado.setText("Ingresa un valor válido.");
                }
            }
        };
        
        historial = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Bodega.DibujarHistorial(Procesos.CreacionFrame());
            }
        };
    }
}
