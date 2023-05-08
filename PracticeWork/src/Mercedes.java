//Collection Q14
//mercedesShowroom()
import java.util.*;

public class Mercedes {
	static ArrayList<String> det=new ArrayList<>();
	
	
	//mercedes
	public static void mercedesShowroom(){
		System.out.println("Welecome to Mercedes Showroom...");
		System.out.println("Choose Mercedes Model: ");
		
		ArrayList<String> Al=new ArrayList<>();
		Al.add("SUV");
		Al.add("HatchBack");
		System.out.println(Al);
		
		System.out.print("Enter your Choice: ");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		det.add(2, n);
		switch(n){
		case "SUV":
			System.out.println("Choose SUV SubModel: ");
			
			Map<String,Integer> lm=new LinkedHashMap<>();
			lm.put("GLC330D",10);
			lm.put("GLE220D",7);
			lm.put("GLD4500D",8);
			System.out.println(lm);
			
			System.out.print("Enter your Choice: ");
			String k=sc.next();
			det.add(3, k);
			
			for(Map.Entry<String, Integer> map:lm.entrySet()) {
				if(map.getKey().equals(k)) {
					map.setValue(map.getValue()-1);
					System.out.println("Congratulations!!! You are successfully brought a "+n+" "+k);
				}
			}
			System.out.print("Do you want to Continue: ");
			String yes=sc.next();
			if(yes.equals("Yes")) {
				mercedesShowroom();
			}
			break;
			
//			ArrayList<String> Al1=new ArrayList<>();
//			Al1.add("GLC330D");
//			Al1.add("GLE220D");
//			Al1.add("GLD4500D");
//			System.out.println(Al1);
			
			
//			for(int i=0;i<Al1.size();i++) {
//				if(Al1.get(i).equals(k)) {
//					System.out.print("Congratulations!!! You are successfully brought a SUV "+k);
//				}
//				else {
//					System.out.print("Please Enter valid Choice !");
//					break;
//				}
//			}
//			break;
			
		case "HatchBack":
			System.out.println("Choose HatchBack SubModel: ");
			
			Map<String,Integer> lm1=new LinkedHashMap<>();
			lm1.put("GLC330D",10);
			lm1.put("GLE220D",7);
			lm1.put("GLD4500D",8);
			System.out.println(lm1);
			
			System.out.print("Enter your Choice: ");
			String p=sc.next();
			det.add(3, p);
			
			for(Map.Entry<String, Integer> map:lm1.entrySet()) {
				if(map.getKey().equals(p)) {
					map.setValue(map.getValue()-1);
					System.out.println("Congratulations!!! You are successfully brought a "+n+" "+p);
				}
			}
			System.out.print("Do you want to Continue: ");
			String ye=sc.next();
			if(ye.equals("Yes")) {
				mercedesShowroom();
			}
			break;
			
//			ArrayList<String> Al2=new ArrayList<>();
//			Al2.add("GLC450");
//			Al2.add("C-Class");
//			Al2.add("E-Class");
//			System.out.println(Al2);
//			
//			System.out.print("Enter your Choice: ");
//			String p=sc.next();
//			
//			for(int i=0;i<Al2.size();i++) {
//				if(Al2.get(i).equals(p)) {
//					System.out.print("Congratulations!!! You are successfully brought a HatchBack "+p);
//				}
//				else {
//					System.out.print("Please Enter valid Choice !");
//					break;
//				}
//			}
//			break;
			
			
			
		default :
			System.out.print("||Thank you for Visit||");
		}
	}
	
	//BMW...
	public static void bmwShowroom() {
		System.out.println("Welcome to BMW Showroom...");
		System.out.println("Choose BMW Model: ");
		
		ArrayList<String> Al=new ArrayList<>();
		Al.add("BMW1");
		Al.add("BMW2");
		System.out.println(Al);
		
		System.out.print("Enter your Choice: ");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		det.add(2, n);
		
		switch(n){
		case "BMW1":
			System.out.println("Choose BMW1 SubModel: ");
			Map<String,Integer> lm2=new LinkedHashMap<>();
			lm2.put("XL0",11);
			lm2.put("XL0",5);
			lm2.put("GT23D",20);
			System.out.println(lm2);
			
			System.out.print("Enter your Choice: ");
			String ch1=sc.next();
			det.add(3, ch1);
			
			for(Map.Entry<String, Integer> map:lm2.entrySet()) {
				if(map.getKey().equals(ch1)) {
					map.setValue(map.getValue()-1);
					System.out.println("Congratulations!!! You are successfully brought a "+n+" "+ch1);
				}
			}
			System.out.print("Do you want to Continue: ");
			String yes=sc.next();
			if(yes.equals("Yes")) {
				bmwShowroom();
			}
			break;
			
			
		case "BMW2":
			System.out.println("Choose BMW2 SubModel: ");
			
			Map<String,Integer> lm3=new LinkedHashMap<>();
			lm3.put("GV8",1);
			lm3.put("GRT56",5);
			lm3.put("X456U",7);
			System.out.println(lm3);
			
			System.out.print("Enter your Choice: ");
			String ch2=sc.next();
			det.add(3, ch2);
			
			for(Map.Entry<String, Integer> map:lm3.entrySet()) {
				if(map.getKey().equals(ch2)) {
					map.setValue(map.getValue()-1);
					System.out.println("Congratulations!!! You are successfully brought a "+n+" "+ch2);
				}
			}
			System.out.print("Do you want to Continue: ");
			String ys=sc.next();
			if(ys.equals("Yes")) {
				bmwShowroom();
			}
			break;
			
		default :
			System.out.print("||Thank you for Visit||");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Please Enter your name: ");
		String name=sc.next();
		det.add(0, name);
		System.out.println(name+" Welcome to our Car Company..");
		
		System.out.print("Which car you looking: ");
		ArrayList<String>Al=new ArrayList<>();
		Al.add("Mercedes");
		Al.add("BMW");
		System.out.println(Al);
		System.out.print("Enter your Choice: ");
		String choice=sc.next();
		det.add(1, choice);
		switch(choice) {
		case "Mercedes":
			mercedesShowroom();
			break;
			
		case "BMW":
			bmwShowroom();
			break;
			
		default:
			System.out.print("Visit next Time");
		}
		
		System.out.println("");
		System.out.println("Client Name: "+det.get(0));
		System.out.println("Brand  Name: "+det.get(1));
		System.out.println("Model  Name: "+det.get(2));
		System.out.println("SubModel Name: "+det.get(3));
		
		
		
	}
}
