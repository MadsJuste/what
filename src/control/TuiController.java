package control;

public class TuiController {
	TUI tui = new TUI();
	String tempString;
	
	
	public void printInput(String input){
		tui.printInput(input);
	}
	
	public String getUserInput(){
		tempString = tui.getInput();
		return tempString;
	}
	
	public void OKMessage(string message )
}
