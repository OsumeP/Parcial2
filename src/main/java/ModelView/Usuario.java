/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

/**
 *
 * @author Estudiante
 */
public class Usuario extends Obj implements interfaz {
    private String contrasena;
    
    public Usuario(String nombre, String contraseña){
        super(nombre);
        this.contrasena = contraseña;      
    }
    
    @Override
    public void ingresarNuevo(){
    
    }
}
