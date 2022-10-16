

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;


public class homework2 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Component {


    }
    @interface Ainterface{


    }

    @Component
    class A implements Ainterface{

    }
    @Component
    class B{
        @Inject private A a;
        public B(A a){
  
        }
    }


    class AinterInvocationHandler implements InvocationHandler{
        private final Ainterface A;
        AinterInvocationHandler(Ainterface a) {
            A = a;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
        }
    }


    class DynamicProxy{
        public static void main(String[] args) {
            Ainterface proxy = (Ainterface) Proxy.newProxyInstance(
                    DynamicProxy.class.getClassLoader(),
                    new Class[]{Ainterface.class},
                    new AinterInvocationHandler(new A())
                    );
        }
    }




}
