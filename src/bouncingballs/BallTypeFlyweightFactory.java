/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public class BallTypeFlyweightFactory {
    
    private static Map<String, BallType> ballType = new HashMap<>();
    
    public static BallType getBallType(String name,int size, Color color,IEstrategia algoritmo) {
        BallType result = ballType.get(name);
        if (result == null) {
            System.out.println("Entro Fly una vez");
            result = new BallType(name,color,size,algoritmo);
            ballType.put(name, result);
        }
        return result;
        //return new Ball(result.getName(),result.getSize(),result.getColor(), result.getAlgoritmo());
    }
}
