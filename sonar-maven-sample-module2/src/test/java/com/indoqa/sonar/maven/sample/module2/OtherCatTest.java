package com.indoqa.sonar.maven.sample.module2;

import com.indoqa.sonar.maven.sample.module1.Cat;
import org.junit.Assert;
import org.junit.Test;

public class OtherCatTest {

    @Test
    public void color() {
        Cat django = new Cat("django");
        django.setColor("white");
        Assert.assertEquals("django", django.getName());
        Assert.assertEquals("white", django.getColor());
    }

}
