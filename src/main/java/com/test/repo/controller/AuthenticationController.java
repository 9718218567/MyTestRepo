package com.test.repo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

/**
 * Validate the request, if succeeded forward the request to intended microservice, reject otherwise.
 * @author CPundhir
 *
 */
@RestController
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/**")
public class AuthenticationController {

	//Constructor used by AuthenticationControllerTest
	public AuthenticationController()
	{
		//Default Constructor
	}
	
	/**
	 * Verify the request, if succeeded forward the request to intended microservice, reject otherwise.
	 * @param request
	 * @param response
	 * @return
	 * @throws HashGenerationException
	 */
	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
	public String verifyRestRequest(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			System.out.println("controller called");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Hello";
  	}
}
