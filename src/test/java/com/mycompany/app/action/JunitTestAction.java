package com.mycompany.app.action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.BaseTest;

public class JunitTestAction extends BaseTest{

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void test() {
		System.out.println("@Test");
	}

}
