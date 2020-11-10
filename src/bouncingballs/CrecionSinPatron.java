/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class CrecionSinPatron implements IEstrategia{
    @Override
    public List<Ball> crearBolas(int cantBolas) {
        List<Ball> listaBolas = new ArrayList<Ball>();
        for (int i = 0; i < cantBolas; i++) {
            Ball ball = new Ball(/*Name*/"Bola Simple",/* Tamaño */ 10,/* Color */new Color(43,0,255),this);
            //new Ball(/* Tamaño */ (int) Math.floor(Math.random() * 20) + 10,/* Color */new Color((int) Math.floor((Math.random() * 256)),(int) Math.floor((Math.random() * 256)),(int) Math.floor((Math.random() * 256))),this);
            listaBolas.add(ball);
        }
        return listaBolas; 
    }
}
