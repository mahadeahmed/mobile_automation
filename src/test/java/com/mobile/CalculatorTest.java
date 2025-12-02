package com.mobile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{
    @Test
    public void additionTest() throws InterruptedException {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("_0p_2")).click();
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("btn_9")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("plus")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("btn_9")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(3000);

//        driver.findElement(By.id("btn_clear")).click();
//        Thread.sleep(3000);
        String result = driver.findElement(By.id("formula")).getText().replaceAll(",","");
        Assert.assertEquals(result,"96198");
    }

    @Test
    public void additionTest2() throws InterruptedException {
        driver.findElement(By.id("btn_8")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("plus")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btn_7")).click();
        driver.findElement(By.id("_0p_2")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(3000);

    }
}
