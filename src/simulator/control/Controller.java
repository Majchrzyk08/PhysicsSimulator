package simulator.control;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
	
	public void loadBodies(InputStream in) {
		JSONObject jsonInput = new JSONObject(new JSONTokener(in));
		JSONArray a = jsonInput.getJSONArray("bodies");
		for(int i=0; i<a.length(); i++) {
			p.addBody(f.createInstance(a.getJSONObject(i)));
		}
		
	}

	//3rd, 4th argument pass NULL and try to implement main firstly
	//finish it at the end
	
	public void run(int n, OutputStream out, InputStream expOut, StateComparator cmp) {
		
			
		PrintStream s = new PrintStream(out);
		s.println("{");
		s.println("\"states\": [");
		s.println(p.getState());
		for(int i=0; i<n; i++) {
			p.advance();
			s.println(",");
			s.println(p.getState());
		}
		s.println("]");
		s.println("}");
		
		
		
		
		
	}
	
}
