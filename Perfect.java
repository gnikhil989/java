package Number_theory;

public class Perfect {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int sum=0;
			int a=6;
			for(int i=1;i<a; i++) {
				if(a%i==0) {
					sum=sum+i;
				}	
			}
	if (sum==a) {
		System.out.println("no is perfect");
	}else
		System.out.println("no is not perfect");
		}

	}

