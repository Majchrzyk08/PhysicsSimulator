package simulator.factories;

import org.json.JSONObject;

import simulator.model.ForceLaws;
import simulator.model.MovingTowardsFixedPoint;

public class MovingTowardsFixedPointBuilder extends Builder<ForceLaws> {

	// Keys “c” and “g” are optional, with
	//default values (0, 0) and 9.81 respectively
	
	@Override
	ForceLaws createTheInstance(JSONObject data) {
		return new MovingTowardsFixedPoint(null, data.getDouble("g"));
	}

}
