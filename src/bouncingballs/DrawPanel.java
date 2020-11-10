/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class DrawPanel extends JPanel{
    
    java.util.List<Ball> balls;

    public DrawPanel(List<Ball> balls) {
        this.balls = balls;
    }
    
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        balls.forEach((b) -> {
            b.draw(graphics);
        });

    }
}
