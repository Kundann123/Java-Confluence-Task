//Collection Q15
import java.util.*;
public class ParkingSlots {
	
	public static int allocateSlot(String[] basement) {
		for(int i=0;i<30;i++) {
			if(basement[i].equals("")) {
				basement[i]="Occupied";
				return i+1;
			}
		}
		System.out.println("No slots Available");
		return -1;
	}
	
	public static String makeReceipt(String vehicleType,int slot) {
		String Receipt="Vehicle Type: "+ vehicleType+"\n";
		Receipt+="Slot Number: "+slot+"\n";
		return Receipt;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] b1=new String[30];
		String[] b2=new String[30];
		
		for(int i=0;i<30;i++) {
			b1[i]="";
			b2[i]="";
		}
		
		while(true) {
			System.out.print("Enter Vehicle type(Bike / Car) or Exit: ");
			String vehicleType=sc.next();
			if(vehicleType.equals("Exit") || vehicleType.equals("exit")) {
				break;
			}
			int slot;
			if(vehicleType.equals("Bike") || vehicleType.equals("bike")) {
				slot=allocateSlot(b1);
			}
			else if(vehicleType.equals("Car") || vehicleType.equals("car"))  {
				slot=allocateSlot(b2);
			}
			else {
				System.out.println("Enter valid Vehicle type");
				continue;
			}
			String Receipt=makeReceipt(vehicleType, slot);
			System.out.println(Receipt);
		}
	}
	

}
