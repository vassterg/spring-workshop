/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.er.springworkshop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasilis
 */
public class CalculatorControllerTest {
    
    private CalculatorController calculator = new CalculatorController();

    @Test
    public void sumTwoElements() {
        // given
        int a = 1;
        int b = 2;

        // when
        String result = calculator.sum(a, b);

        // then
        assertEquals("3", result);
    }

    
}
