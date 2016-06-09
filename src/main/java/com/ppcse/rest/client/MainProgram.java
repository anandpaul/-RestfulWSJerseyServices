package com.ppcse.rest.client;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainProgram {

	public static void main(String[] args)
	{
		new MainProgram().dateUtils();

	}

	public void dateUtils()
	{
		convertStringToDate("10/06/2016 11:25 PM");
		convertDate("2016-05-15 19:30");
	}

	private Timestamp convertStringToDate(String dat)
	{
		java.util.Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(dat);
			String newDate = sdf.format(date);
			date = sdf.parse(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new java.sql.Timestamp(date.getTime());
	}

	private String convertDate(String dat)
	{
		java.util.Date date = null;
		String finalDate = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		try {
			if (dat != null) {
				date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dat);
				finalDate = sdf.format(date);
				System.out.println("sdf - " + sdf.format(date));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return finalDate;
	}
}
