/**
 * 
 */
package com.ppcse.rest.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.anand.restfuljersey.vo.LogicTransctions;
import com.anand.restfuljersey.vo.Transactions;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPDigestAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

import sun.misc.BASE64Encoder;

/**
 * @author Anand
 *
 */
public class LogicWS {
	String name = "logicAcc";
	String password = "l0g1C@cc";
	String url = "http://cfa.log.rpt.shcc.com.au/Service/ActivityCSV?startId=1";

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LogicWS l = new LogicWS();
		// l.basicAuthentication();
		// l.digestAuthentication();
		// l.basicLocalhost();

		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("utilDate:" + utilDate);
		System.out.println("sqlDate:" + sqlDate);

		// java.util.Date utilDate = new java.util.Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(utilDate);
		cal.set(Calendar.MILLISECOND, 0);
		System.out.println(new java.sql.Timestamp(utilDate.getTime()));
		System.out.println(new java.sql.Timestamp(cal.getTimeInMillis()));

		List<String> strList = new ArrayList<String>();
		strList.add("23");
		strList.add("24");
		strList.add("25");
		strList.add("26");

		int a = 23;

		if (strList.contains(String.valueOf(a))) {
			System.out.println("I got you...");
		} else {
			System.out.println("You are not here...");
		}
	}

	public void basicLocalhost()
	{
		String url = "http://localhost:8080/RestfulWSJerseyServices/rest/json/metallica/logic";
		String name = "anand";
		String password = "anand";
		String authString = name + ":" + password;
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json").header("Authorization", "Basic " + authStringEnc)
				.get(ClientResponse.class);
		webResource.getProperties();
		if (resp.getStatus() != 200) {
			System.err.println("Unable to connect to the server");
		}
		String output = resp.getEntity(String.class);
		// LogicTransctions output = resp.getEntity(LogicTransctions.class);
		System.out.println("response: " + output);
	}

	public void digestAuthentication()
	{
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		client.addFilter(new HTTPDigestAuthFilter(name, password));
		ClientResponse resp = client.resource(url).accept("application/json").type("application/json")
				.get(ClientResponse.class);

		System.out.println("Response - " + resp.toString());
		// String out = resp.getEntity(String.class);
		// System.out.println(out);
		LogicTransctions log = resp.getEntity(LogicTransctions.class);

		System.out.println("Time - " + log.getTimestamp());
		System.out.println("Start - " + log.getStartId());

		Transactions trans = log.getTransactions().get(10);
		System.out.println(trans.toString());

	}

	public void basicAuthentication()
	{
		String url = "http://cfa.log.rpt.shcc.com.au/Service/ActivityCSV?startId=1";
		String name = "logicAcc";
		String password = "l0g1C@cc";
		String authString = name + ":" + password;
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
		System.out.println("Base64 encoded auth string: " + authStringEnc);
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json").header("Authorization", "Basic " + authStringEnc)
				.get(ClientResponse.class);
		webResource.getProperties();
		if (resp.getStatus() != 200) {
			System.err.println("Unable to connect to the server");
		}
		String output = resp.getEntity(String.class);
		System.out.println("response: " + output);
		// - See more at:
		// http://java2novice.com/restful-web-services/http-basic-authentication/#sthash.gGwdXPU6.dpuf
	}
}
