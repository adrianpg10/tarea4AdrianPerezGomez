/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrip
 */
public class Animal {

    private String nombre;
    private int numPatas;

    public Animal(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public Animal() {
        this.nombre="Sin nombre";
        this.numPatas=4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", numPatas=" + numPatas + '}';
    }
    

  
 

    
    

}
