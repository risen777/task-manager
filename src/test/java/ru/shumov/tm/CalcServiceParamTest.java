package ru.shumov.tm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcServiceParamTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[]{

                        1, 2, 3
                }, new Object[]

                        {
                                2, 3, 5

                        }, new Object[]

                        {
                                0, 0, 0
                        }, new Object[]

                        {
                                1, -1, 0
                        }

        );
    }

    final CalcService service = new CalcService();
    private int a, b, c;

    public CalcServiceParamTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Test
    public void test() {
        Assert.assertEquals(service.sum(a, b).intValue(), c);


    }


}





