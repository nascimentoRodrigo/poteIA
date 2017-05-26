/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principais;

import aima.core.search.framework.problem.GoalTest;

/**
 *
 * @author jcarlos
 */
public class JugsGoalTest implements GoalTest {
    //objetivo, pote de 5L armazenar 3L
    int goalA = 5;   //especificar objetois
    int goalB = 0;
    
    
    @Override
    public boolean isGoalState(Object state) {
		JugsState currentState = (JugsState) state;
		return (currentState.state[0]==goalA) && (currentState.state[1]==goalB);
    }
    
}
