/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class Program {

    private JFrame mainFrame;
    private DrawPanel drawPanel;
    private java.util.List<Ball> balls;

    private int windowWidth = 1000;
    private int windowHeight = 800;
    private String windowLabel = "Bounce Program";
    private CreacionBolas context;
    private int cantidadBolas;
    private String estrategia;
    Runtime runtime;
    

    public Program(int cantidadBolas, String estrategia) {
        this.cantidadBolas = cantidadBolas;
        this.estrategia = estrategia;
 
    }

    public void run() {
        
        balls = new ArrayList<>();
        switch (estrategia) {
            case "Prototype":
                System.out.println("Elegido: Prototype");
                context = new CreacionBolas( new CreacionPrototype());
                balls = context.crearBolas(this.cantidadBolas);
                break;
            case "Flyweight":
                System.out.println("Elegido: Flyweight");
                context = new CreacionBolas( new CreacionFlyweight());
                balls = context.crearBolas(this.cantidadBolas);
                break;
            case "Sin Patron":
                System.out.println("Elegido: Sin Patron");
                context = new CreacionBolas( new CrecionSinPatron());
                balls = context.crearBolas(this.cantidadBolas);
                break;
            default:
                break;
        }
        
        /* Generar balls */
        /*for (int i = 0; i < 1000; i++) {
            Ball ball = new Ball(15,new Color(43,0,255),null);
            balls.add(ball);
        }*/
        
        /* Initialize program */
        mainFrame = new JFrame();
        drawPanel = new DrawPanel(balls);
        mainFrame.getContentPane().add(drawPanel);
        mainFrame.setTitle(windowLabel);
        mainFrame.setSize(windowWidth, windowHeight);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        balls.forEach((b) -> {
                b.setPosX((int) Math.floor(Math.random() * windowWidth));
                b.setPosY((int) Math.floor(Math.random() * windowHeight));
        });
        
        System.out.println("Memoria Utilizada: "+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())); 
        
        while (true) {
            balls.forEach((b) -> {
                b.update(windowWidth, windowHeight);
            });

            /* Give Swing 10 milliseconds to see the update! */
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mainFrame.repaint();
        }
    }
}