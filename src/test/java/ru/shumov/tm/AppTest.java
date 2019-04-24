package ru.shumov.tm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
//
//@Test
//    public void testEcho() {
//
//    App.echo("ping");

@Test(timeout =2000)
    public void generation(){
    final List<String> ids =new ArrayList<>();
    for (int i=0;i<1300000;i++)
        ids.add((UUID.randomUUID().toString())

        );






//    @Test
//    public void helloWorld2( {
//
//        App.helloWorld();
//    }
}}
