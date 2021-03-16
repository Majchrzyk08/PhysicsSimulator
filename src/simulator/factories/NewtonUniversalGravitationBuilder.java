package simulator.factories;

import org.json.JSONObject;

import simulator.model.ForceLaws;
import simulator.model.NewtonUniversalGravitation;

public class NewtonUniversalGravitationBuilder extends Builder<ForceLaws> {

	//Key “G” is optional, with default value 6.67E-11 ???
	
	@Override
	ForceLaws createTheInstance(JSONObject data) {
		return new NewtonUniversalGravitation(data.getDouble("G"));
	}

}
