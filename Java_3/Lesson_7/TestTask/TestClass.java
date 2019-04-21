package TestTask;

import TestTask.Annotations.AfterSuite;
import TestTask.Annotations.BeforeSuite;
import TestTask.Annotations.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// this class works correct with several tests
public class TestClass {
    static void start(Class clazz) {
        Class c = Tests.class;
        Tests tests = new Tests();
        Method[] methods = c.getDeclaredMethods();
        isAnnotationSingle(methods, BeforeSuite.class);
        isAnnotationSingle(methods, AfterSuite.class);
        runAnnotationMethod(tests, methods, BeforeSuite.class);
        runAnnotationMethod(tests, methods, Test.class);
        runAnnotationMethod(tests, methods, AfterSuite.class);
    }

    private static void runAnnotationMethod(Tests tests, Method[] methods, Class annotation) {
        for (Method o : methods) {
            if (o.isAnnotationPresent(annotation)) {
                try {
                    o.invoke(tests);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void isAnnotationSingle(Method[] methods, Class annotation) {
        int counter = 0;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(annotation)) {
                counter++;
            }
        }
        if (counter > 1) {
            throw new RuntimeException();
        }
    }
}



