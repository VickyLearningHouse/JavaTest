package generalTest;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class softReferenceTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftReference<Person2> person = new SoftReference<Person2>(new Person2("vicky"));
//		SoftReference person1 = new SoftReference(new Person("person1"));
//		SoftReference<Person> person3 = new SoftReference(new Person("perosn3"));
		System.gc();
//		person1 = person;
		//person3 = person;
//		System.out.println(person1.get());
		System.out.println(person.get());
		ArrayList<Person2> big = new ArrayList<Person2>();
		for(int i = 0; i<1000; i++){
			big.add(new Person2(String.valueOf(i)));
		}
//		System.gc();
		System.out.println("End: "+ person.get());
	}

}
