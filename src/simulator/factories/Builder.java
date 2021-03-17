package simulator.factories;

import org.json.JSONObject;

public abstract class Builder<T> {

	protected String type;

	// ??? #3 illegalargexception
	public T createInstance(JSONObject info) {

		// ??? T x
		T x;
		if (this.type.equals(info.getString("type"))) {
			x = createTheInstance(info.getJSONObject("data"));
			if (x == null) {
				throw new IllegalArgumentException("invalid data");
			} else {

				return x;
			}

		} else
			return null;
	}

	abstract T createTheInstance(JSONObject data);

	protected JSONObject createData() {
		return new JSONObject();
	}

	// ??? is that good?
	public JSONObject getBuilderInfo() {
		JSONObject info = new JSONObject();
		info.put("type", type);
		info.put("data", createData());
		return info;

	}

}
