package JsonShcmaValidate;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonValidate {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("please input your json String: ");
	Scanner in = new Scanner(System.in);

	String jsonValue = in.nextLine();

	System.out.println("please input your json Schema: ");

	String jsonSchema = in.nextLine();

	Boolean isValidated = validate(jsonValue, jsonSchema);

	if (!isValidated) {
	    System.out.println("sorry,your jsonString failed");
	} else {
	    System.out.println("No errors found. JSON validates against the schema");
	}

    }

    public static boolean validate(String jsonValue, String jsonSchema) {

	boolean isPass = false;
	try {
	    InputStream is = new ByteArrayInputStream(jsonSchema.getBytes(StandardCharsets.UTF_8));
	    // toCheck whether the schema is right
	    JSONObject rawSchema = new JSONObject(new JSONTokener(is));
	    Schema schema = SchemaLoader.load(rawSchema);
	    schema.validate(new JSONObject(jsonValue));
	    isPass = true;
	} catch (JSONException e) {
	    System.out.println(e.getStackTrace() + e.getMessage());
	} catch (ValidationException e) {
	    e.getStackTrace();
	} finally {
	    return isPass;
	}

    }

}
