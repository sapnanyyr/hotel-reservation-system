//testing
import java.util.ArrayList;

import javax.swing.*;

public class ReservationTester {

	public static void main(String args[]){
		ArrayList<Guest> guestList = new ArrayList<Guest>();
		guestList.add(new Guest("John Smith", "tester"));
		guestList.add(new Guest("Jane Smith", "tester2"));
		
		LoginView frame = new LoginView();
		frame.setGuestList(guestList);
	}
}