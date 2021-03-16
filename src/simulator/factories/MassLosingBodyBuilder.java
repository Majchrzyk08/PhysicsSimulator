package simulator.factories;

import org.json.JSONObject;

import simulator.model.Body;
import simulator.model.MassLossingBody;

public class MassLosingBodyBuilder extends Builder<Body> {

	//the same as with body builder
	//All builders should throw corresponding exceptions if the input data is not valid
	
	@Override
	Body createTheInstance(JSONObject data) {
		return new MassLossingBody(data.getString("id"), data.get("v"), data.get("p"), data.getDouble("m"),
				data.getDouble("freq"), data.getDouble("factor") );
	}

}
