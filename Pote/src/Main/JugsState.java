/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;

/**
 *
 * @author jcarlos
 */
public class JugsState {
    
    public int state[];  //vetor com 2 inteiros - pote de 5 e de 3
    
    
    public Action ESVAZIAR_5L    = new DynamicAction("ESVAZIAR_5L");
    public Action ESVAZIAR_3L    = new DynamicAction("ESVAZIAR_3L");
    public Action COMPLETAR_3L   = new DynamicAction("COMPLETAR_3L");
    public Action COMPLETAR_5L   = new DynamicAction("COMPLETAR_5L");
    // despeja 3l em 5l até 3l esvaziar 
    public Action DESPEJAR_3L_5L = new DynamicAction("DESPEJAR_3L_5L");
    // despeja 5l em 3l até 3l completar (5l fica com 2l)
    public Action DESPEJAR_5L_3L = new DynamicAction("DESPEJAR_5L_3L");
    
    
    
    public JugsState() {
        state = new int[2];
        state[0] = 5;
        state[1] = 3;
    }
    
    
    public void setState(int j5, int j3) {
        state[0] = j5;
        state[1] = j3;
    }
    
    public int[] getState() {
        return state;
    }
    //set que muda o estado
    
}
