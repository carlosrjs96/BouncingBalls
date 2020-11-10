/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class Ball implements IPrototype{
    
    private int posX, posY;
    private int vx ;
    private int vy ;
    public BallType ballType;
    
   /* public Ball(int posX, int posY, int size, Color color, int vx, int vy) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.color = color;
        this.vx = vx;
        this.vy = vy;
    }*/
    
    public Ball(String name,int size, Color color,IEstrategia estrategia) {
        ballType = new BallType(name,color,size, estrategia);
        this.vx = (int) Math.floor((Math.random() * 10) - 5);
        this.vy = (int) Math.floor((Math.random() * 10) - 5);
    }
    
    public Ball(BallType ballType) {
        this.ballType=ballType;
        this.vx = (int) Math.floor((Math.random() * 10) - 5);
        this.vy = (int) Math.floor((Math.random() * 10) - 5);
    }
    
    
    
    public void update(int windowWidth,int windowHeight) {
        
        if (posX > windowWidth || posX < 0) {
            vx *= -1;
        }

        if (posY > windowHeight || posY < 0) {
            vy *= -1;
        }

        if (posX > windowWidth) {
            posX = windowWidth;
        }

        if (posX < 0) {
            posX = 0;
        }

        if (posY > windowHeight) {
            posY = windowHeight;
        }

        if (posY < 0) {
            posY = 0;
        }

        this.posX += vx;
        this.posY += vy;

    }
    
    public void draw(Graphics g) {
        g.setColor(ballType.getColor());
        g.fillOval(posX, posY, ballType.getSize(), ballType.getSize());
    }
    
    @Override
    public Ball clonar(){
        return new Ball(ballType.getName(),ballType.getSize(),ballType.getColor(),ballType.getAlgoritmo());
    };

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }
    
    
}
