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
    private int goalA = 2;   //especificar objetos
    private int goalB = 3;

    @Override
    public boolean isGoalState(Object state) {
        JugsState currentState = (JugsState) state;
        return (currentState.state[0]==goalA) && (currentState.state[1]==goalB);
    }

    public int getGoalA() {
        return goalA;
    }

    public void setGoalA(int goalA) {
        this.goalA = goalA;
    }

    public int getGoalB() {
        return goalB;
    }

    public void setGoalB(int goalB) {
        this.goalB = goalB;
    }
    
}