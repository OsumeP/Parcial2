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
public class Obj {
    public String id;
    public String nombre;
    
    public Obj(String id,String nombre){
        this.nombre = nombre;
        this.id = id;
    }
    
    public Obj(String nombre){
        this.nombre = nombre;
    }
    
    protected String ObtenerId(){
        return this.id;
    }
    
    protected String ObtenerNombre(){
        return this.nombre;
    }
}
