package it.polimi.modaclouds.space4cloud.plotlib;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Plot {
	
	

	public static void parseResult(String result) {
		JsonReader reader = Json.createReader(new StringReader(result));
		JsonObject obj = reader.readObject();

		String fileName = obj.getString("filename");
		String url = obj.getString("url");
		String error = obj.getString("error");
		String warning = obj.getString("warning");
		String message = obj.getString("message");

		System.out.printf(
				"filename: %s\nurl: %s\nerror: %s\nwarning: %s\nmessage: %s\n",
				fileName, url, error, warning, message);
	}
}
