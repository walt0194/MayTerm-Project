import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) throws IOException {

		//String hostName = "73.94.99.15";
		String hostName = "10.0.0.34";
		int portNumber = 6374;

		try (	Socket echoSocket = new Socket(hostName, portNumber);
				PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
				BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		) 
		{
			String input = "";
			while (!input.equals("close")) {
				
				input = userInput.readLine();
				out.println(input);
				
			}

		} 
		catch (UnknownHostException e) {
			System.err.println("Don't know about host " + hostName);
			System.exit(1);
		} 
		catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection to " +
					hostName);
			System.exit(1);
		} 
	}
}