package com.ppcse.rest.client;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;

//import com.cfa.ppcese.util.PPCSEUtility;

public class CFADigestGeneration {

	private static String digest;
	private static String finalDigest;
	private static String username = "logicAcc";
	private static String password = "l0g1C@cc";
	// private static String nonce =
	// "635985308534552908-4e00df18c097d135ea59fccf3d95ab2945b1f253";
	private static String nonce = "aLlutHiSvWEwMakExAySurEzCovEnANt";
	private static final String iv = "eMp-cFaO-iVPArAm";
	private static final String key = "eMp-cFaO-EncRyPt";
	private static final String algo = "AES/CBC/NoPADDING";

	/**
	 * 
	 * @param map
	 * @return
	 */
	public static String createDigest(String userName, String pwd, String tmStr)
	{
		try {
			tmStr = getCurrentTimeStamp();
			digest = new String(Base64.encode(getAuthenticationDigest(username, password, tmStr, nonce)));
			finalDigest = encryptBase64(digest, "eMp-cFaO-EncRyPt", "eMp-cFaO-iVPArAm").trim();
			finalDigest=digest;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalDigest;
	}

	public static byte[] hexToBytes(String str)
	{
		if (str == null) {
			return null;
		} else if (str.length() < 2) {
			return null;
		} else {
			int len = str.length() / 2;
			byte[] buffer = new byte[len];
			for (int i = 0; i < len; i++) {
				buffer[i] = (byte) Integer.parseInt(str.substring(i * 2, i * 2 + 2), 16);
			}
			return buffer;
		}
	}

	public static String encryptBase64(String plaintext, String key, String iv) throws Exception
	{
		return new String(
				org.bouncycastle.util.encoders.Base64.encode(hexToBytes(encrypt(plaintext, key, iv).toString())),
				"ISO-8859-1");
	}

	public static String encrypt(String plaintext, String key, String iv) throws Exception
	{

		SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
		IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
		cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
		byte[] encrypted = cipher.doFinal(addPadding(plaintext).getBytes());

		String encryptedCode = new String(bytesToHex(encrypted));
		return encryptedCode;
	}

	private static String bytesToHex(byte[] encrypted)
	{
		String hexString = new String(Hex.encode(encrypted));
		return hexString;
	}

	public static String addPadding(String plainTxt)
	{
		int len = plainTxt.length() % 16;
		char padding[] = new char[16 - len];
		for (int i = 0; i < (16 - len); i++) {
			padding[i] = 32;
		}
		return plainTxt + String.valueOf(padding);
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public static byte[] getAuthenticationDigest(String username, String password, String strTm, String nonce)
			throws Exception
	{
		System.out.println("Time - " + strTm);
		StringBuilder stbMsg = new StringBuilder();
		stbMsg.append(nonce);
		stbMsg.append(strTm);
		stbMsg.append(username);
		stbMsg.append(password);
		// MessageDigest sha = MessageDigest.getInstance("SHA-1");
		MessageDigest sha = MessageDigest.getInstance("MD5");
		sha.update(stbMsg.toString().getBytes());
		byte[] digest = sha.digest();

		return digest;
	}

	public static String getCurrentTimeStamp()
	{
		long time = System.currentTimeMillis();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ss.SSS", Locale.US);
		format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
		return format.format(timestamp);
	}
}
