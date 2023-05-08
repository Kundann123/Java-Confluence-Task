package hellow;

class operate{
	int volume(int n) {
		return n*n*n;
	}
}

public class AggregationExample {
	operate op;
	double pi=3.14;
	
	double volumeOfSphere(int r){
		op=new operate();
		int vvolume=op.volume(r);
		return (4*pi*vvolume)/3;
	}
	
	public static void main(String[] args) {
		AggregationExample ag=new AggregationExample();
		double result=ag.volumeOfSphere(5);
		System.out.println(result);
	}

}
