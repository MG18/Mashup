package ch.bbw.mashup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author  Mehmet Gül
 * @version 1.0
 *
 */

public class APICall {
	
	private BufferedReader      input;
	private String				inputLine;
	private StringBuilder 		response;
	private URL					url;
	private HttpURLConnection 	connection;
	
	public String getResponse(String url) {
		try {
			this.url = new URL(url);
			connection = (HttpURLConnection) this.url.openConnection();
			connection.setRequestMethod("GET");

			input = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			this.response = new StringBuilder();
			inputLine = "";

			while ((inputLine = input.readLine()) != null) {

				response.append(inputLine);

			}

			input.close();
			
			return response.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
