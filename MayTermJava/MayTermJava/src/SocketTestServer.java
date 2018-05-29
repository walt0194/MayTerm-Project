import java.net.*;
import java.io.*;

public class SocketTestServer 
{
	public static void main(String[] args) throws IOException
	{
		int port = 6374;
		
		System.out.println("1");
		try
		(
			ServerSocket testServer = new ServerSocket(port);
			Socket clientSocket = testServer.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		)
		{
			System.out.println("2");
			BufferedReader BRInput = new BufferedReader(new InputStreamReader(System.in));
			String fromUser = "Connection Established";
			String fromClient = "Connection Established";
			
			out.println(fromUser);
			
			while(true)
			{
				System.out.println("3");
				
				do
				{
					fromClient = in.readLine();
				}while(fromClient == null);
				
				System.out.println("Client: " + fromClient);
				
				fromUser = BRInput.readLine();
				
				if(fromUser != null)
				{
					out.println(fromUser);
				}
			}
		}
		catch (IOException e)
		{
			System.err.println("IO error");
			System.exit(1);
		}
	}
}
