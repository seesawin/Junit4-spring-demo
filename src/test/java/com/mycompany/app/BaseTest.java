package com.mycompany.app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/application-context.xml" })
public class BaseTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass in BaseTest");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@BeforeClass in AfterClass");
	}
}
