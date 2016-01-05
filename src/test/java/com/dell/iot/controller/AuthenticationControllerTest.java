package com.dell.iot.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.test.repo.controller.AuthenticationController;

/**
 * The class <code>AuthenticationControllerTest</code> contains tests for the class <code>{@link AuthenticationController}</code> in ProductionHarness mode.
 *
 * @author CPundhir
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticationControllerTest {
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 */
	@Before
	public void setUp()
		throws Exception {
		System.out.println("Set Up test called");
	}

	@After
	public void cleanup() 
		throws Exception {
	}

	@Test
	public void testAVerifyRestRequestForGet()
		throws Exception {
		AuthenticationController authenticationControllerObj = new AuthenticationController();
		MockHttpServletResponse response = new MockHttpServletResponse();
		MockHttpServletRequest request = new MockHttpServletRequest();
		String testResult = authenticationControllerObj.verifyRestRequest(request, response);
		assertEquals("Hello", testResult);
	}
	
   /*********************************** ENABLE THIS TO RUN THIS FILE STANDALONE ***********************************************************************************/
//	/**
//	 * Launch the test.
//	 *
//	 * @param args the command line arguments
//	 *
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(AuthenticationControllerTest.class);
//	}
   /***************************************************************************************************************************************************************/
}