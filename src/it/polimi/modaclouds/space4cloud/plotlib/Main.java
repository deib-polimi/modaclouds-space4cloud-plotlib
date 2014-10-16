package it.polimi.modaclouds.space4cloud.plotlib;

public class Main {

	public static void main(String[] args) {
		String result = "{\n" + "\"filename\": \"plot from api\",\n"
				+ "\"url\": \"https://plot.ly/~chris/1459\",\n"
				+ "\"error\": \"\",\n" + "\"warning\": \"\",\n"
				+ "\"message\": \"\"\n" + "}";

		Plot.parseResult(result);
	}

}
