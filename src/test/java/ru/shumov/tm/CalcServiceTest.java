package ru.shumov.tm;

import org.junit.*;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CalcServiceTest {

    final CalcService service = new CalcService();
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void before() {
        System.out.println("before");
    }



    @Test
    public void testSum() {
        Assert.assertNull(service.sum(1, null));
        Assert.assertNull(service.sum(null, 1));
        Assert.assertNull(service.sum(1, null));
        Assert.assertNull(service.sum(null, null));
        // Assert.assertNull(service.sum(1,2));

        Assert.assertEquals(service.sum(1, 2).intValue(), 3);
        Assert.assertEquals(service.sum(2, 2).intValue(), 4);
        System.out.println("test1");

    }

    @Test
    public void testIsPositive() {
        Assert.assertTrue(service.isPositive(1));
        Assert.assertFalse(service.isPositive(0));
        System.out.println("test2");

    }


    @After
    public void after() {
        System.out.println("after");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }


}
