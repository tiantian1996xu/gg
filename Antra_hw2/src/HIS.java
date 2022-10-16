
/*


his
 */

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HIS {
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface Component{

    }
    interface AInterface{

    }
    @Component
    class A implements AInterface{
    }
    @Component
    class B{
        @Inject
        private A a;

    }
    class DynamicProxy{
        public static void main(String[] args) {
            AInterface proxy = (AInterface) Proxy.newProxyInstance(
                    DynamicProxy.class.getClassLoader(),
                    new Class[]{AInterface.class},
                    new AInterfaceInvocationHandler(new A())
            );
        }
    }
    class AInterfaceInvocationHandler implements InvocationHandler {
        private final AInterface A;
        AInterfaceInvocationHandler(AInterface a) {
            A = a;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
        }
    }
}
