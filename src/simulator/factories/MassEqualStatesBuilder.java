package simulator.factories;

import org.json.JSONObject;

import simulator.control.MassEqualStates;
import simulator.control.StateComparator;

public class MassEqualStatesBuilder extends Builder<StateComparator> {
	
	
	@Override
	StateComparator createTheInstance(JSONObject data) {
		return new MassEqualStates();
	}

}
