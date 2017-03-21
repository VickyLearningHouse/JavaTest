package springSimulation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import springTest.Helloimplements;
import springTest.IHello;

public class DynaProxyHello implements InvocationHandler {
    private Object delegate;
    /**
     * 动态生成方法被处理过后的对象 (写法固定)
     * @param delegate
     * @param proxy
     * @return
     */
    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(), this.delegate
                        .getClass().getInterfaces(), this);
    }
//     * 要处理的对象中的每个方法会被此方法送去JVM调用,也就是说,要处理的对象的方法只能通过此方法调用 此方法是动态的,不是手动调用的
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        try {
            System.out.println("Jerry adds log before method call...");
            // JVM通过这条语句执行原来的方法(反射机制)
            result = method.invoke(this.delegate, args);
            // 执行原来的方法之后记录日志
            System.out.println("Jerry adds log after method call...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回方法返回值给调用者
        return result;
    }
    static public void main(String[] arg) {
        DynaProxyHello helloproxy = new DynaProxyHello();
        Helloimplements hello = new Helloimplements();
        IHello ihello = (IHello) helloproxy.bind(hello);
//        Helloimplements ihello =  (Helloimplements) helloproxy.bind(hello);
        ihello.sayHello("Jerry");
    }
}
