/**
 * 
 */
package com.ppcse.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import sun.misc.BASE64Encoder;

/**
 * @author Anand
 *
 */
public class JerseyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JerseyClient client = new JerseyClient();
		client.basicAuthentication();

	}

	public void basicAuthentication()
	{
		String url = "http://localhost:8080/RestfulWSJerseyServices/rest/json/metallica/get";
		String name = "anand";
		String password = "anand";
		String authString = name + ":" + password;
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json").header("Authorization", "Basic " + authStringEnc)
				.get(ClientResponse.class);
		if (resp.getStatus() != 200) {
			System.err.println("Unable to connect to the server");
		}
		String output = resp.getEntity(String.class);
		System.out.println("response: " + output);
		// - See more at:
		//
	}
}
