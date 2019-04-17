

import org.junit.Assert;

import com.gstgroup.cn.App;

import org.junit.*;

public class AppTest {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}
}
