package generalTest;

public class MethodArgValueReferTest {

    public static void main(String[] args) {
        //simple type
        int i =1, j=3;
        System.out.println("i: "+i+" j: "+j);
        updateValue(i,j);
        System.out.println("i: "+i+" j: "+j);

        Integer p = new Integer(1);
        Integer q = new Integer(3);
        System.out.println("p: "+p+" q: "+q);
        updateValue(p,q);
        System.out.println("p: "+p+" q: "+q);

        //object
        FloatTest folatTest = new FloatTest(4,5);
        System.out.println("folatTest.x: "+folatTest.x+" folatTest.y: "+folatTest.y);
        updateValue(folatTest.x,folatTest.y);
        System.out.println("folatTest.x: "+folatTest.x+" folatTest.y: "+folatTest.y);
    }

    public static void updateValue(int arg1, int arg2){
        arg1 = 2;
        arg2 = 32;
    }

    public static void updateValue(Integer arg1, Integer arg2){
        arg1 = 2;
        arg2 = 32;
    }
}
