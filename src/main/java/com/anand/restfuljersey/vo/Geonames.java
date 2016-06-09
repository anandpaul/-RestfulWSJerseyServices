/**
 * 
 */
package com.anand.restfuljersey.vo;

/**
 * @author Anand
 *
 */
public class Geonames {
	private int lng;
	private int geonameId;
	private String countryCode;
	private String name;
	private String fclName;
	private String toponymName;
	private String fcodeName;
	private String wikipedia;
	private int lat;
	private String fcl;
	private int population;
	private String fcode;

	
	@Override
	public String toString()
	{
		return "Geonames [lng=" + lng + ", geonameId=" + geonameId + ", countryCode=" + countryCode + ", name=" + name
				+ ", fclName=" + fclName + ", toponymName=" + toponymName + ", fcodeName=" + fcodeName + ", wikipedia="
				+ wikipedia + ", lat=" + lat + ", fcl=" + fcl + ", population=" + population + ", fcode=" + fcode + "]";
	}

	public int getLng()
	{
		return lng;
	}

	public void setLng(int lng)
	{
		this.lng = lng;
	}

	public int getGeonameId()
	{
		return geonameId;
	}

	public void setGeonameId(int geonameId)
	{
		this.geonameId = geonameId;
	}

	public String getCountryCode()
	{
		return countryCode;
	}

	public void setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getFclName()
	{
		return fclName;
	}

	public void setFclName(String fclName)
	{
		this.fclName = fclName;
	}

	public String getToponymName()
	{
		return toponymName;
	}

	public void setToponymName(String toponymName)
	{
		this.toponymName = toponymName;
	}

	public String getFcodeName()
	{
		return fcodeName;
	}

	public void setFcodeName(String fcodeName)
	{
		this.fcodeName = fcodeName;
	}

	public String getWikipedia()
	{
		return wikipedia;
	}

	public void setWikipedia(String wikipedia)
	{
		this.wikipedia = wikipedia;
	}

	public int getLat()
	{
		return lat;
	}

	public void setLat(int lat)
	{
		this.lat = lat;
	}

	public String getFcl()
	{
		return fcl;
	}

	public void setFcl(String fcl)
	{
		this.fcl = fcl;
	}

	public int getPopulation()
	{
		return population;
	}

	public void setPopulation(int population)
	{
		this.population = population;
	}

	public String getFcode()
	{
		return fcode;
	}

	public void setFcode(String fcode)
	{
		this.fcode = fcode;
	}

}
