package hellow;

public class ContinueExample {
	public static void main(String[] args) {
		aa:
		for(int i=0;i<5;i++) {
				b:
				for(int j=0;j<5;j++) {
						if(i==2 && j==2) {
							continue aa;
						}
						System.out.println(i+" "+j);
					}
			}
	}

}
