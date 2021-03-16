package simulator.factories;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import simulator.misc.Vector2D;
import simulator.model.Body;

public class BasicBodyBuilder extends Builder<Body> {

	//getstring id????
	//vectors v and p problem
	
	@Override
	Body createTheInstance(JSONObject data) {
		return new Body(data.getString("id"), data.get("v"), data.get("p"), data.getDouble("m"));
	}

}
