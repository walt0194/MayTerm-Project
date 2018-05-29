import java.net.*;
import java.io.*;
 
public class EchoServer {
    public static void main(String[] args) throws IOException {       
         
        int portNumber = 443;
        
        String inputLine = "";
        while(true)
        {
	        try (
	            ServerSocket serverSocket =
	                new ServerSocket(portNumber);
	            Socket clientSocket = serverSocket.accept();     
	            PrintWriter out =
	                new PrintWriter(clientSocket.getOutputStream(), true);                   
	            BufferedReader in = new BufferedReader(
	                new InputStreamReader(clientSocket.getInputStream()));
	        )
	        {
	        	inputLine = in.readLine();
	            while (inputLine != null) 
	            {
	                out.println(inputLine);
	                inputLine = in.readLine();
	            }
	        }
	        catch (IOException e) 
	        {
	            System.out.println("Exception caught when trying to listen on port "
	                + portNumber + " or listening for a connection");
	            System.out.println(e.getMessage());
	        }
        }
    }
}