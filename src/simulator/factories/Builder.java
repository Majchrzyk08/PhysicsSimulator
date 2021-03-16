package simulator.factories;

import org.json.JSONObject;

public abstract class Builder<T> {
	
	protected String type;

	//??? #3 illegalargexception
	public T createInstance(JSONObject info) {
		if (this.type.equals(info.getString("type")))
			return createTheInstance(info.getJSONObject("data"));
		else 
			return null;
	}

	abstract T createTheInstance(JSONObject data);
	
		JSONObject getInfo() {
			
			JSONObject x = new JSONObject();
			x.put("type", this.type);
			
			x.put("data", createDate());
			return x;
			
		}
		
		//??? abstract too? #2
		protected JSONObject createDate() {
			return new JSONObject();
		}
		
		
		//??? #1 whats her
		public JSONObject getBuilderInfo() {
			return null;
		}
	
	

	

}

