/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Álvaro
 */
public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal("Adrián", 4);
        Animal a2 = new Animal();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
