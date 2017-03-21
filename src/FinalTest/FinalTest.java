package FinalTest;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "hello2";  

	        final String b = "hello"; 	 
		 	//final String b = getHello();

	        String d = "hello";
	        String c = b + 2;  
	        String e = d + 2;

	        System.out.println((a == c));

	        System.out.println((a == e));
	        
	        System.out.println(a.equals(e));

	}	
	static String getHello(){
		return "hello";
	}

}
