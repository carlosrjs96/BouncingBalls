/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.awt.Color;

/**
 *
 * @author Carlos
 */
public class BallType {
    private String name;
    private Color color;
    private int size;
    private IEstrategia algoritmo;

    public BallType(String name, Color color, int size, IEstrategia algoritmo) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.algoritmo = algoritmo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public IEstrategia getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(IEstrategia algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    
}
