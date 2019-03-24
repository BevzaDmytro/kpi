package labs;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeProxy implements InvocationHandler {
    private Object obj;

    public TimeProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get"))
            return method.invoke(this.obj);
        else if(method.getName().startsWith("set"))
            throw new Exception("setter");
        return method.invoke(this.obj);
    }
}
