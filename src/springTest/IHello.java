package springTest;

public interface IHello {
    void sayHello(String name);

    void sayGoogBye(String name);

    static void testStatic(String name){
        System.out.println(name + " test static");
    }
}
