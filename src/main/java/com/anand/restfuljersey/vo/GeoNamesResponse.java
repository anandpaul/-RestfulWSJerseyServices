/**
 * 
 */
package com.anand.restfuljersey.vo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Anand
 *
 */
public class GeoNamesResponse {

	@JsonProperty("geonames")
	private List<Object> geoNames;

	public List<Object> getGeoNames()
	{
		return geoNames;
	}

	public void setGeoNames(List<Object> geoNames)
	{
		this.geoNames = geoNames;
	}

}
