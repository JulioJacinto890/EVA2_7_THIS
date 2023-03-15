/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_this;

/**
 *
 * @author hp
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a qui no se usa this por que es statico
        
        imprimir();
        //no se puede usar en un contexto estatico
    }
    public void imprimir (){
        //aqui tambien es una this 
    }
}
//this es una referencia a una instacia de la clase
//todos los objetos tienen this
//puedo usa this en cualquier classe
//this solo funciona internamete en la case
class persona{
    private String nombre;
   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
        //this.nombre es el aritibuto de la clase
        //nombre es la variable (parametro) delcarado en el metodo
    } 
    public void imprimirDatos(){
        System.out.println("El nombre es:"+this.nombre);
    }
}