package CheckingHomeworkTask;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tests {
    void test1(Object obj, Method m) {
        try {
            int a = 10;
            int b = 10;
            int c = 10;
            int d = 10;
            Object [] args = new Object[] {a,b,c,d};
            int result = a * (b + (c / d));
            m.setAccessible(true);
            int checkingResult = (Integer)m.invoke(obj,args);
            if (checkingResult==result) {
                System.out.println("test1 passed");
            } else {
                System.out.println("test1 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test2 (Object obj, Method m) {
        try {
            float a = 10.0f;
            float b = 10.0f;
            float c = 10.0f;
            float d = 10.0f;
            Object [] args = new Object[] {a,b,c,d};
            float result = a * (b + (c / d));
            m.setAccessible(true);
            float checkingResult = (Float)m.invoke(obj,args);
            if (checkingResult==result) {
                System.out.println("test2 passed");
            } else {
                System.out.println("test2 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test3 (Object obj, Method m) {
        try {
            int first = 5;
            int second = 10;
            Object [] args = new Object[] {first,second};
            m.setAccessible(true);
            boolean checkingResult = (Boolean)m.invoke(obj,args);
            if (checkingResult) {
                System.out.println("test3 passed");
            } else {
                System.out.println("test3 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test4 (Object obj, Method m) {
        try {
            int variable = 10;
            Object [] args = new Object[] {variable};
            m.setAccessible(true);
            ByteArrayOutputStream output;
            PrintStream old = System.out;
            output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));
            String asd = output.toString();
            String checkingResult = (String) m.invoke(obj,args);
            if (asd.equalsIgnoreCase("Your number is positive!")) {
                System.out.println("test4 passed");
            } else {
                System.out.println("test4 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test5 (Object obj, Method m) {
        try {
            int variable = -10;
            Object [] args = new Object[] {variable};
            m.setAccessible(true);
            boolean checkingResult = (Boolean) m.invoke(obj,args);
            if (checkingResult) {
                System.out.println("test5 passed");
            } else {
                System.out.println("test5 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test6 (Object obj, Method m) {
        try {
            String name = "Bob";
            Object [] args = new Object[] {name};
            m.setAccessible(true);
            String checkingResult = (String) m.invoke(obj,args);
            if (checkingResult.equalsIgnoreCase("Привет, Bob!")) {
                System.out.println("test6 passed");
            } else {
                System.out.println("test6 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    void test7 (Object obj, Method m) {
        try {
            int year = 2000;
            Object [] args = new Object[] {year};
            m.setAccessible(true);
            boolean checkingResult = (Boolean) m.invoke(obj,args);
            if (checkingResult) {
                System.out.println("test7 passed");
            } else {
                System.out.println("test7 not passed");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
