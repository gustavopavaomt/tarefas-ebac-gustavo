package br.com.gpavao;

import org.junit.Assert;
import org.junit.Test;

public class Exemplo1 {

    @Test
    public void test(){
        String name = "Gustavo";
        Assert.assertEquals("Gustavo", name);
    }

    @Test
    public void test2(){
        String name = "Gustavo";
        Assert.assertNotEquals("Gstv", name);
    }
}
