package generalTest;

import org.apache.commons.lang.ObjectUtils;

public class NullTest {

    public NullTest() {

    }

    public static void main(String[] args){
	NullTestFit ntf = new NullTestFit();
	String str = ntf.getNstr();
	if(ObjectUtils.equals(str, null)){
	    System.out.println(false);
	}
    }

}
