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
public class BallFactory {
    public static Ball crearBall(String name,int size, Color color,IEstrategia estrategia){
        
        return new Ball(BallTypeFlyweightFactory.getBallType( name, size,  color, estrategia));
    
    }
}
