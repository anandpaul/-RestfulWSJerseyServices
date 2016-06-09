/**
 * 
 */
package com.anand.restfuljersey.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Anand
 *
 */
// @JsonIgnoreProperties(ignoreUnknown = true)
public class LogicTransctions {

	// "2016-05-23T05:21:53Z"
	// @JsonIgnore
	// @JsonProperty("timeStamp")
	// @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-ddTHH:mm:ssZ")
	private Date timestamp;
	private int startId;
	private int stopId;
	private int count;
	private List<Transactions> transactions = new ArrayList<Transactions>();

	@JsonProperty("error")
	private LogicError error;

	public LogicError getError()
	{
		return error;
	}

	public void setError(LogicError error)
	{
		this.error = error;
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	public int getStartId()
	{
		return startId;
	}

	public void setStartId(int startId)
	{
		this.startId = startId;
	}

	public int getStopId()
	{
		return stopId;
	}

	public void setStopId(int stopId)
	{
		this.stopId = stopId;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public List<Transactions> getTransactions()
	{
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions)
	{
		this.transactions = transactions;
	}

}
