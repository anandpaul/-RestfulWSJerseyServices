/**
 * 
 */
package com.anand.restfuljersey.rest;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anand.restfuljersey.vo.Track;

/**
 * @author Anand
 *
 */
@Path("/json/metallica")
public class JerseyService {

	@GET
	@Path("/logic")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLogic()
	{
		String output = "{\"timestamp\":\"2016-05-23T05:21:53Z\",\"startId\":1100,\"stopId\":11098,\"count\":11023,"
				+ "\"transactions\":[{\"transactionID\":1100,\"transactionDate\":\"2008-12-23T13:50:38\","
				+ "\"activityId\":5,\"activityName\":\"laundry_dispatch\",\"activityDescription\":"
				+ "\"Laundry Dispatch\",\"firefighterRegistrationNumber\":null,\"firefighterName\":null,"
				+ "\"site\":\"LAUNDRY\",\"siteType\":\"Laundry\",\"assetSupplierCode\":\"T320-OUTER\","
				+ "\"assetDescription\":\"O/Trouser CFA Structural-GOLD\",\"assetActive\":true,"
				+ "\"serialNumber\":\"SE00001964\",\"RFID\":\"E007C00557396870\","
				+ "\"currentQueue\":\"Customer Inbound\",\"userName\":null,\"userFirstName\":null,"
				+ "\"userLastName\":null,\"userId\":null,\"firefighterCreatedDate\":null,\"garmentID\":662,"
				+ "\"firefighterId\":null,\"garmentActive\":true,\"currentDisposition\":\"NEW\","
				+ "\"shipmentNumber\":null,\"postingDate\":null,\"sellToCustomer\":null,\"senderLocation\":null,"
				+ "\"yourReference\":null,\"siteName\":\"Alsco Footscray\",\"queueID\":7,\"siteId\":2}]}";

		return output;
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	// @RolesAllowed("member")
	// @PermitAll
	public Track getTrackInJSON()
	{
		Track track = new Track();
		track.setTitle("Anand");
		track.setSinger("New Singer");

		return track;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track)
	{
		String result = "Track saved :" + track;
		return Response.status(201).entity(result).build();
	}
}
