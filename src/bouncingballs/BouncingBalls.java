/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import Controller.MenuController;
import View.Menu;

/**
 *
 * @author Carlos
 */
public class BouncingBalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Program program = new Program(1000,"Prototype");
        //Program program = new Program(1000,"Flyweight");
        /*Menu pantalla = new Menu();
        MenuController controlador = new MenuController(pantalla);
        pantalla.setVisible(true);*/
        
        System.out.println("Memoria Total: "+Runtime.getRuntime().totalMemory()); 
        Program program = new Program(1000,"Flyweight");
        program.run();
        
        /*Program program = new Program(1000,"Prototype");
        program.run();*/
        
        /*Program program1 = new Program(1000,"Flyweight");
        program1.run();
        
        Program program2 = new Program(1000,"Sin Patron");
        program2.run();*/
        
        
    }
    
}
