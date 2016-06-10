package functionality;

import java.io.*;
import java.net.*;

public class WeightConnecter {
		
	private String ip;
	private int port;
	private Socket socket;
	private BufferedReader inStream;
	private DataOutputStream outStream;
	
	public WeightConnecter(String ip, int port){
		this.ip = ip;
		this.port = port
	}
	
	public ConnectToWeight(){
			socket = new Socket(ip,port);
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream());
			outStream = new DataOutputStream(socket.getOutputStream());
		
	}
	
	public String WriteSocket(string input){
		outStream.writeBytes(input);
		return inStream.readLine();
	}
	
	public String ReadSocket(){
		String readSocket = "";
		readSocket = inStream.readLine();
	}
}
