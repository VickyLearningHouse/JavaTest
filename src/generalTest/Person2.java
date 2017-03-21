package generalTest;

public class Person2 {
	private String mName;  
	public Person2(String name){  
	  this.mName = name;  
	}  
	public String getName(){  
	  return this.mName;  
	}  
	public void finalize(){
		System.out.println("finalize called: "+ this.mName);
	}
	public String toString(){
		return "Hello, I am "+ this.mName;
	}

}
