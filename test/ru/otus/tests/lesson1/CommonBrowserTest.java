package ru.otus.tests.lesson1;

import org.testng.annotations.Test;
import ru.otus.base.TestBase;

public class CommonBrowserTest extends TestBase {

    void doTest() {
        mainPage.openPage()
                .clickRandomLesson();
        System.out.println(driver.getCurrentUrl());
        System.out.println(Thread.currentThread().getId());
        System.out.println();
    }

    @Test
    public void test_1() {
        doTest();
    }

    @Test
    public void test_2() {
        doTest();
    }

    @Test
    public void test_3() {
        doTest();
    }

    @Test
    public void test_4() {
        doTest();
    }

    @Test
    public void test_5() {
        doTest();
    }

    @Test
    public void test_6() {
        doTest();
    }

    @Test
    public void test_7() {
        doTest();
    }

    @Test
    public void test_8() {
        doTest();
    }

    @Test
    public void test_9() {
        doTest();
    }

    @Test
    public void test_10() {
        doTest();
    }

    @Test
    public void test_11() {
        doTest();
    }

    @Test
    public void test_12() {
        doTest();
    }

    @Test
    public void test_13() {
        doTest();
    }

    @Test
    public void test_14() {
        doTest();
    }

    @Test
    public void test_15() {
        doTest();
    }
}
