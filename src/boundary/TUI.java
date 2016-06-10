package boundary;

import java.io,BufferedReader;
import java.io.InputStreamReader;


public class TUI implements ITUI {
	private BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	int inputInt;
	
		@Override
		public void printInput(string input){
		 System.out.println(input);
		}
		
		@Override
		public String getInput(){
			return userInput.readLine();
		}
		
		@Override
		public int getIntInput();{
			inputInt = Intefer.parseInt(userInput.readLine());
			return inputInt;
		}
	}
