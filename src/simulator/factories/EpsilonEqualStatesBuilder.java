package simulator.factories;

import org.json.JSONObject;

import simulator.control.StateComparator;

public class EpsilonEqualStatesBuilder extends Builder<StateComparator> {
	
	//Key “eps” is optional, with default value 0.0.
	//TODO after implementing statecomparators
	
	@Override
	StateComparator createTheInstance(JSONObject data) {
		return null;
	}

}
