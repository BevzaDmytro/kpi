package lab;

import java.lang.reflect.*;

public class Main {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Hello World!");

        Schedule schedule = new Schedule("Math", 214, new Time("11","12"));

        System.out.println("======annotations=========");
        Class clazz = schedule.getClass();
        for(Method method: clazz.getDeclaredMethods()) {
            if( method.isAnnotationPresent(TestAnnotation.class) ){
                System.out.println("invocation of method "+method.getName());
                Object result = method.invoke(schedule);
                System.out.println("result " + result);
            }
        }
        System.out.println("======class=========");
        System.out.println("Simple name: " + clazz.getSimpleName());
        System.out.println("Package name: " + clazz.getPackage());

        System.out.println("======methods=========");
        for(Method method: clazz.getDeclaredMethods()) {
            System.out.println("Method "+method.getName());
            if( method.isAnnotationPresent(TestAnnotation.class) ){
                System.out.println("Annotation: "+method.getAnnotation(TestAnnotation.class));
            }
            for( Class param : method.getParameterTypes() ){
                System.out.println("Parameter: "+param.getTypeName());
            }

            System.out.println("--------------------------");
        }


        System.out.println("======Proxy==========");



        Time time = new Time();
        ITime timeProxy = (ITime) Proxy.newProxyInstance(
                Time.class.getClassLoader(),
                Time.class.getInterfaces(),
                new TimeProxy(time)
        );

//            timeProxy.setTime("01", "11");


        System.out.println( timeProxy.getTime());
    }
}
