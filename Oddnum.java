package pack;

public class Oddnum {
	static void m1() {
		int sum=0;
		System.out.println("sum of odd no b/w 7 to 21");
		for(int i=7;i<=21;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("sum="+sum);
	
		
	}

		
	public static void main(String[] args) {
		m1();
	}

	

	
}
