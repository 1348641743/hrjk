

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.gstgroup.cn.DemoServlet;

public class DemoServletTest {

	@Before
	public void setUp() throws Exception {
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testCheckuser() {
		
		DemoServlet demo = new DemoServlet();
		//System.out.println(demo.checkuser("admin", "1234"));
		Assert.assertEquals(true,demo.checkuser("admin", "123"));
	}

	@Test
	public void testStringTolow() {

		DemoServlet demo = new DemoServlet();
		//System.out.println(demo.stringTolow("abccde"));
		Assert.assertEquals("abccde",demo.stringTolow("abccde"));
	}

	@Test
	public void testPlus() {

		DemoServlet demo = new DemoServlet();
		//System.out.println(demo.plus(3, 4));
		Assert.assertEquals(7,demo.plus(3, 4));
	}

}
