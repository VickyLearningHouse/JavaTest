package JsonShcmaValidate;

public class jsonString {
	
	private String jsonString;
	private String schemaString;
	
	public jsonString() {
		super();
	}
	public jsonString(String jsonString, String schemaString) {
		super();
		this.jsonString = jsonString;
		this.schemaString = schemaString;
	}
	public String getJsonString() {
		return jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	public String getSchemaString() {
		return schemaString;
	}
	public void setSchemaString(String schemaString) {
		this.schemaString = schemaString;
	}
}
