package CheckingHomeworkTask;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


public class CheckingHomework {
    String pathname;

    public CheckingHomework(String pathname) {
        this.pathname = pathname;
    }

    private void isFormatCorrect() {
        File file = new File(pathname);
        String [] str = file.list();
        for (String o: str) {
            String [] mass = o.split("\\.");
            if (!mass[1].equalsIgnoreCase("class")) {
                throw new RuntimeException(o,new Exception());
            }
        }
    }
    public void checkingResults(String name) {
        try {
            Class Homework = URLClassLoader.newInstance(new URL[]{new File
                    (pathname).toURL()}).loadClass(name);
            System.out.println("Checking homework of " + Homework.getName());

            Method [] methods = Homework.getDeclaredMethods();
            Tests tests = new Tests();
            for (int i = 0; i < methods.length; i++) {
                if (methods[i].toString().contains("calculate(int")) {
                    tests.test1(Homework, methods[i]);
                } else if (methods[i].toString().contains("calculate(float")) {
                    tests.test2(Homework, methods[i]);
                } else if (methods[i].toString().contains("checkTwoNumbers")) {
                    tests.test3(Homework, methods[i]);
//                } else if (methods[i].toString().contains("printIsPositive")) {
//                    tests.test4(Homework, methods[i]);
                } else if (methods[i].toString().contains("isNegative")) {
                    tests.test5(Homework, methods[i]);
//                } else if (methods[i].toString().contains("printWelocome")) {
//                    tests.test6(Homework, methods[i]);
                } else if (methods[i].toString().contains("isLeapYear")) {
                    tests.test7(Homework, methods[i]);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        CheckingHomework checkingHomework = new CheckingHomework("D:/java/java 3/Lesson_7/Homework");
        checkingHomework.isFormatCorrect();
        checkingHomework.checkingResults("Ivanov");
        checkingHomework.checkingResults("Petrov");
    }
}
