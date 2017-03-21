package generalTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.xhtmlrenderer.pdf.ITextRenderer;

public class FlyingSoucer {

    public static void main(String[] args) throws Exception {
	ITextRenderer renderer = new ITextRenderer();

	//File file = new File("src/headerfooter.html");
	String url = new File("src/hello.html").toURI().toURL().toString();

	renderer.setDocument(url);
	// renderer.setDocumentFromString(html.toString());

	// renderer.getSharedContext().setBaseURL("file:/" + path + "/images");
	renderer.layout();
	OutputStream os = new FileOutputStream("fsoutput.pdf");
	renderer.createPDF(os);
	os.close();
    }

}
