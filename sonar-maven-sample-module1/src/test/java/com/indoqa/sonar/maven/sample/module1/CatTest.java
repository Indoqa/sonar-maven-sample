package com.indoqa.sonar.maven.sample.module1;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void name() {
        Cat django = new Cat("django");
        Assert.assertEquals("django", django.getName());
    }
}
