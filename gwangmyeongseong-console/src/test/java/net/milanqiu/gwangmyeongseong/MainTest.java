package net.milanqiu.gwangmyeongseong;

import net.milanqiu.mimas.junit.AssertExt;
import org.junit.Assert;
import org.junit.Test;

/**
 * Creation Date: 2015-08-20
 * @author Milan Qiu
 */
public class MainTest {

    @Test
    public void test_addOne() throws Exception {
        Assert.assertEquals(4, Main.addOne(3));
    }

    @Test
    public void test_main() throws Exception {
        AssertExt.assertEmpty("");
    }
}
