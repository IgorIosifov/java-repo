package TestTask;

import TestTask.Annotations.AfterSuite;
import TestTask.Annotations.BeforeSuite;
import TestTask.Annotations.Test;

public class Tests {

    @BeforeSuite
    void before() {
        //any action here. SOUT is for demonstration
        System.out.println("before");
    }

    @Test(priority = 1)
    void test1() {
        //any action here. SOUT is for demonstration
        System.out.println("test1");
    }

    @Test()
    void test2() {
        //any action here. SOUT is for demonstration
        System.out.println("test5");
    }

    @Test(priority = 10)
    void test3() {
        //any action here. SOUT is for demonstration
        System.out.println("test10");
    }

    @AfterSuite
    void after() {
        //any action here. SOUT is for demonstration
        System.out.println("after");
    }
}