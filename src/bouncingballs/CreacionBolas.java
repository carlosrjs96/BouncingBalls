/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import java.util.List;

/**
 *
 * @author Carlos
 */
public class CreacionBolas {
    private IEstrategia strategy;
    // ----------------------------------
    public CreacionBolas(IEstrategia strategy) {
        this.strategy = strategy;
    }
    // ----------------------------------
     public List<Ball> crearBolas(int cantidad) {
         return strategy.crearBolas(cantidad);
    }
}
