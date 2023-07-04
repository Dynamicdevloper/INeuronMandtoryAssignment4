package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2, 3,4 ,5,5,6};
		int n=arr.length;
		double sum= 0;
		do {
			sum+=arr[n-1];
			n--;
		}while(n>0);
		
		double avg= sum/arr.length;
		
		System.out.println(avg);
	}

}
