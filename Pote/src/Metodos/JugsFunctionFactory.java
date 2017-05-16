/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import aima.core.agent.Action;
import aima.core.search.framework.problem.ActionsFunction;
import aima.core.search.framework.problem.ResultFunction;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author jcarlos
 */
public class JugsFunctionFactory {
	private static ActionsFunction _actionsFunction = null;
	private static ResultFunction _resultFunction = null;

	public static ActionsFunction getActionsFunction() {
		if (null == _actionsFunction) {
			_actionsFunction = new JugsActionsFunction();
		}
		return _actionsFunction;
	}

	public static ResultFunction getResultFunction() {
		if (null == _resultFunction) {
			_resultFunction = new JugsResultFunction();
		}
		return _resultFunction;
	}

	private static class JugsActionsFunction implements ActionsFunction {
		public Set<Action> actions(Object state) {
			JugsState board = (JugsState) state;

			Set<Action> actions = new LinkedHashSet<Action>();

			if (board.state[0]>0) { // pote de 5L esta cheio
                            actions.add(board.ESVASIAR_5L);
			}
                        if (board.state[1]>0) { // pote de 3L esta cheio
                            actions.add(board.ESVASIAR_3L);
			}
                        
                        if (board.state[0]<5)
                            actions.add(board.COMPLETAR_5L);
			

			return actions;
		}
	}

	private static class JugsResultFunction implements ResultFunction {
		public Object result(Object s, Action a) {
			JugsState board = (JugsState) s;

			if (board.ESVASIAR_3L.equals(a)) {
				JugsState newBoard = new JugsState();
                                newBoard.state[0]=board.state[0];
				newBoard.state[1]=0; //esvazir 3L
				return newBoard;
			} else if (board.ESVASIAR_5L.equals(a)) {
				JugsState newBoard = new JugsState();
                                newBoard.state[0]=0;
				newBoard.state[1]=board.state[1]; //esvazir 3L
				return newBoard;
                        }

			// The Action is not understood or is a NoOp
			// the result will be the current state.
			return s;
		}
	}
}