/**
 * 
 */
package com.anand.restfuljersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

/**
 * @author Anand
 *
 */
@Service
@Path("/prime")
public class ProbablyPrimeService {

	@GET
	@Path("/{number}")
	@Produces({ "text/plain" })
	public String isPrime(@PathParam("number") int number)
	{
		System.out.println("Inside the method to check prime");
		return "Jersey project - Entered number is " + number;
	}
}
