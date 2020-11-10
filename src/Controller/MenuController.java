/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import bouncingballs.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos
 */
public class MenuController implements ActionListener{
    int cantidadBolas;
    String estrategia;
    Menu view;
    Program program;

    public MenuController(Menu view) {
        this.view = view;
        __init__();
    }
    
    public void __init__(){
        view.btnEjecutar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.btnEjecutar)) {
            ejecutar();
        }
    }
    
    public void ejecutar() {
        int cant = Integer.parseInt(this.view.txtCantidad.getText());
        String algoritmo = (String) this.view.jcbAlgoritmo.getSelectedItem();
        System.out.println("Algortimo: " + algoritmo + " / Cantidad:" + cant);
        //program = new Program(cant, algoritmo);
        //program.run();
    }
    
}
