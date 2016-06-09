/**
 * 
 */
package com.ppcse.rest.client;

import java.util.List;
import java.util.concurrent.SynchronousQueue;

import javax.ws.rs.core.MediaType;

import com.anand.restfuljersey.vo.GeoNamesResponse;
import com.anand.restfuljersey.vo.Geonames;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * @author Anand
 *
 */
public class GeoRestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		new GeoRestClient().getGeoNames();

	}

	public void getGeoNames()
	{
		ClientConfig config = new DefaultClientConfig();
		config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(config);

		WebResource ws = client.resource(
				"http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo");
		ClientResponse res = ws.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		if (res.getStatus() != 200) {
			throw new RuntimeException("Failed and code is " + res.getStatus());
		}
		// List<Geonames> gList = res.getEntity(new
		// GenericType<List<Geonames>>() {});
		GeoNamesResponse namesResp = res.getEntity(GeoNamesResponse.class);
		List<Object> gList = namesResp.getGeoNames();
		// String output = res.getEntity(String.class);
		//
		// System.out.println("output - ");
		// System.out.println(output);
		System.out.println("*****************************");
		for (Object g : gList) {

			System.out.println(g.toString());
		}

		// {"result":[{"employeeNo":900505,"volunteerNo":0,"surname":"CASTILLO","prefferedName":"ROLANDO","givenName1":"ROLANDO","givenName2":null,"gender":"M","email":"cfa@tohotmail.com","postalStreet":"
		// ","postalSuburb":" ","postalPostcode":" ","residentialStreet":"
		// ","residentialSuburb":" ","residentialPostcode":"
		// ","currentEmployee":"Y","currentVolunteer":"N","operationalEmploye":"N","operationalVolunteer":"N","operateBAQualified":"N","turnoutCount":0,"roleList":[],"wf_LSF_Qualified":"N"}],"errors":[]}

	}
}
