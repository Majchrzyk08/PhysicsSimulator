package simulator.control;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import simulator.factories.Factory;
import simulator.model.Body;
import simulator.model.PhysicsSimulator;

public class Controller {
	
	PhysicsSimulator p;
	Factory<Body> f;
	
	public Controller(PhysicsSimulator p, Factory<Body> f) {
		this.p = p;
		this.f = f;
	}
	
	//question :D
	public void loadBodies(InputStream in) {
		JSONObject jsonInput = new JSONObject(new JSONTokener(in));
		JSONArray a = jsonInput.getJSONArray("bodies");
		for(int i=0; i<a.length(); i++) {
			p.addBody(f.createInstance(a.getJSONObject(i)));
		}
		
	}

	//after comparators
	public void run(int n, OutputStream out, InputStream expOut, StateComparator cmp) {
		
		
	}
	
}
