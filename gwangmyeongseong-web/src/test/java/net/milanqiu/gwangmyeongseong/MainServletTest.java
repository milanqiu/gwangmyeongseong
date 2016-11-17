package net.milanqiu.gwangmyeongseong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Creation Date: 2016-11-17
 * @author Milan Qiu
 */
public class MainServletTest {

    @Test
    public void test_addTwo() throws Exception {
        Assert.assertEquals(5, MainServlet.addTwo(3));
    }
}
