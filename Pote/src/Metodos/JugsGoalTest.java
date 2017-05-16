/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Main.JugsState;
import aima.core.search.framework.problem.GoalTest;

/**
 *
 * @author jcarlos
 */
public class JugsGoalTest implements GoalTest {
    //objetivo, pote de 5L armazenar 3L
    int goalA = 5;   //especificar objetois
    int goalB = 0;
    
    
    public boolean isGoalState(Object state) {
		JugsState currentState = (JugsState) state;
                if ((currentState.state[0]==goalA) && (currentState.state[1]==goalB))
                    return true;
		return false;
    }
    
}
