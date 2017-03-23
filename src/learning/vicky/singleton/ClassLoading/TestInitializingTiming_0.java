package learning.vicky.singleton.ClassLoading;

/**
 * this class is used to test Initialize timing
 * When will class be initialized immediately.
 *
 * test case: passively using Class field
 *            access parent class's static field via child class would not initial child class
 * @author I332445
 *
 */
public class TestInitializingTiming_0 {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}
