/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import Model.RealTimeDataBase;

/**
 *
 * @author Estudiante
 */
public class Producto extends Obj implements interfaz{
    public int precio;
    public String marca;
    
    public Producto(String id, String nombre, int precio, String Marca){
        super(id, nombre);
        this.precio = precio;
        this.marca = Marca;
    }
 
    
    @Override
    public void ingresarNuevo(){
        RealTimeDataBase.AgregarDatos(this);
    }
}
