package com.anand.restfuljersey.vo;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Transactions {

	private int transactionID;
	private Date transactionDate;
	private int activityId;
	private String activityName;
	private String activityDescription;
	private String firefighterRegistrationNumber;
	private String firefighterName;
	private String site;
	private String siteType;
	private String assetSupplierCode;
	private String assetDescription;
	private boolean assetActive;
	private String serialNumber;
	
	@JsonProperty("RFID")
	private String RFID;
	
	private String currentQueue;
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String userId;
	private Date firefighterCreatedDate;
	private int garmentID;
	private int firefighterId;
	private boolean garmentActive;
	private String currentDisposition;
	private String shipmentNumber;
	private Date postingDate;
	private String sellToCustomer;
	private String senderLocation;
	private String yourReference;
	private String siteName;
	private int queueID;
	private int siteId;

	@Override
	public String toString()
	{
		return "Transactions [transactionID=" + transactionID + ", transactionDate=" + transactionDate + ", activityId="
				+ activityId + ", activityName=" + activityName + ", activityDescription=" + activityDescription
				+ ", firefighterRegistrationNumber=" + firefighterRegistrationNumber + ", firefighterName="
				+ firefighterName + ", site=" + site + ", siteType=" + siteType + ", assetSupplierCode="
				+ assetSupplierCode + ", assetDescription=" + assetDescription + ", assetActive=" + assetActive
				+ ", serialNumber=" + serialNumber + ", RFID=" + RFID + ", currentQueue=" + currentQueue + ", userName="
				+ userName + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userId="
				+ userId + ", firefighterCreatedDate=" + firefighterCreatedDate + ", garmentID=" + garmentID
				+ ", firefighterId=" + firefighterId + ", garmentActive=" + garmentActive + ", currentDisposition="
				+ currentDisposition + ", shipmentNumber=" + shipmentNumber + ", postingDate=" + postingDate
				+ ", sellToCustomer=" + sellToCustomer + ", senderLocation=" + senderLocation + ", yourReference="
				+ yourReference + ", siteName=" + siteName + ", queueID=" + queueID + ", siteId=" + siteId + "]";
	}

	public int getTransactionID()
	{
		return transactionID;
	}

	public void setTransactionID(int transactionID)
	{
		this.transactionID = transactionID;
	}

	public Date getTransactionDate()
	{
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate)
	{
		this.transactionDate = transactionDate;
	}

	public int getActivityId()
	{
		return activityId;
	}

	public void setActivityId(int activityId)
	{
		this.activityId = activityId;
	}

	public String getActivityName()
	{
		return activityName;
	}

	public void setActivityName(String activityName)
	{
		this.activityName = activityName;
	}

	public String getActivityDescription()
	{
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription)
	{
		this.activityDescription = activityDescription;
	}

	public String getFirefighterRegistrationNumber()
	{
		return firefighterRegistrationNumber;
	}

	public void setFirefighterRegistrationNumber(String firefighterRegistrationNumber)
	{
		this.firefighterRegistrationNumber = firefighterRegistrationNumber;
	}

	public String getFirefighterName()
	{
		return firefighterName;
	}

	public void setFirefighterName(String firefighterName)
	{
		this.firefighterName = firefighterName;
	}

	public String getSite()
	{
		return site;
	}

	public void setSite(String site)
	{
		this.site = site;
	}

	public String getSiteType()
	{
		return siteType;
	}

	public void setSiteType(String siteType)
	{
		this.siteType = siteType;
	}

	public String getAssetSupplierCode()
	{
		return assetSupplierCode;
	}

	public void setAssetSupplierCode(String assetSupplierCode)
	{
		this.assetSupplierCode = assetSupplierCode;
	}

	public String getAssetDescription()
	{
		return assetDescription;
	}

	public void setAssetDescription(String assetDescription)
	{
		this.assetDescription = assetDescription;
	}

	public boolean isAssetActive()
	{
		return assetActive;
	}

	public void setAssetActive(boolean assetActive)
	{
		this.assetActive = assetActive;
	}

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public String getRFID()
	{
		return RFID;
	}

	public void setRFID(String rFID)
	{
		RFID = rFID;
	}

	public String getCurrentQueue()
	{
		return currentQueue;
	}

	public void setCurrentQueue(String currentQueue)
	{
		this.currentQueue = currentQueue;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserFirstName()
	{
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName)
	{
		this.userFirstName = userFirstName;
	}

	public String getUserLastName()
	{
		return userLastName;
	}

	public void setUserLastName(String userLastName)
	{
		this.userLastName = userLastName;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public Date getFirefighterCreatedDate()
	{
		return firefighterCreatedDate;
	}

	public void setFirefighterCreatedDate(Date firefighterCreatedDate)
	{
		this.firefighterCreatedDate = firefighterCreatedDate;
	}

	public int getGarmentID()
	{
		return garmentID;
	}

	public void setGarmentID(int garmentID)
	{
		this.garmentID = garmentID;
	}

	public int getFirefighterId()
	{
		return firefighterId;
	}

	public void setFirefighterId(int firefighterId)
	{
		this.firefighterId = firefighterId;
	}

	public boolean isGarmentActive()
	{
		return garmentActive;
	}

	public void setGarmentActive(boolean garmentActive)
	{
		this.garmentActive = garmentActive;
	}

	public String getCurrentDisposition()
	{
		return currentDisposition;
	}

	public void setCurrentDisposition(String currentDisposition)
	{
		this.currentDisposition = currentDisposition;
	}

	public String getShipmentNumber()
	{
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber)
	{
		this.shipmentNumber = shipmentNumber;
	}

	public Date getPostingDate()
	{
		return postingDate;
	}

	public void setPostingDate(Date postingDate)
	{
		this.postingDate = postingDate;
	}

	public String getSellToCustomer()
	{
		return sellToCustomer;
	}

	public void setSellToCustomer(String sellToCustomer)
	{
		this.sellToCustomer = sellToCustomer;
	}

	public String getSenderLocation()
	{
		return senderLocation;
	}

	public void setSenderLocation(String senderLocation)
	{
		this.senderLocation = senderLocation;
	}

	public String getYourReference()
	{
		return yourReference;
	}

	public void setYourReference(String yourReference)
	{
		this.yourReference = yourReference;
	}

	public String getSiteName()
	{
		return siteName;
	}

	public void setSiteName(String siteName)
	{
		this.siteName = siteName;
	}

	public int getQueueID()
	{
		return queueID;
	}

	public void setQueueID(int queueID)
	{
		this.queueID = queueID;
	}

	public int getSiteId()
	{
		return siteId;
	}

	public void setSiteId(int siteId)
	{
		this.siteId = siteId;
	}

}
