package JdomReadXml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import FinalTest.FinalTest;

public class ReadXMLFile {
	public static void main(String[] args) {

	  SAXBuilder builder = new SAXBuilder();
	  //File xmlFile = new File("c:\\file.xml");

	  try {

		//Document document = (Document) builder.build(xmlFile);
		//InputStream is = ReadXMLFile.class.getClassLoader().getResourceAsStream("test.xml");
		InputStream is = FinalTest.class.getClassLoader().getResourceAsStream("test.xml");
		Document document = builder.build(is);
		Element rootNode = document.getRootElement();
		List list = rootNode.getChildren("staff");

		for (int i = 0; i < list.size(); i++) {

		   Element node = (Element) list.get(i);

		   System.out.println("First Name : " + node.getChildText("firstname"));
		   System.out.println("Last Name : " + node.getChildText("lastname"));
		   System.out.println("Nick Name : " + node.getChildText("nickname"));
		   System.out.println("Salary : " + node.getChildText("salary"));

		}

	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
	}
}