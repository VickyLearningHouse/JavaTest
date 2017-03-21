package generalTest;

import java.lang.ref.WeakReference;

public class weakReferenceTest {
	public static void check(Person person){
		if(person==null){
			System.out.println("Reference invalid");
		}else
		{
			System.out.println("Reference still avialable");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person vicky = null;
		WeakReference<Person> person = new WeakReference<Person>(new Person("wPerson"));
		vicky = new Person("vicky");
		//System.gc();
		//person.clear();
		Person restore = person.get();
		
		check(restore);
	}

}
