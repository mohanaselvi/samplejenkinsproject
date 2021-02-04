

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=555; //sum of cube of each digit should be equal to the number
        int rem=0;
        int sum = 0;
       int armstrong=n;
        for(int i=0;i<3;i++)
        {
        	rem=n%10;
        	n=n/10;
        	sum=sum+rem*rem*rem;
        }
        if(sum ==armstrong)
        {
        	System.out.println("armstrong number");
        }else
        {
        	System.out.println("not a armstrong number");
        }
	}

}
