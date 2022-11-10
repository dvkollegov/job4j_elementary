package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1000RblThen16dot6666Dlr() {
        float in = 1000;
        float expected = 16.6666f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        float in = 0;
        float expected = 0;
        float eps = 0.0001f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Evr() {
        float in = 140;
        float expected = 2;
        float eps = 0.0001f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1000RblThen14dot2857Evr() {
        float in = 1000;
        float expected = 14.2857f;
        float eps = 0.0001f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Evr() {
        float in = 0;
        float expected = 0;
        float eps = 0.0001f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, eps);
    }
}