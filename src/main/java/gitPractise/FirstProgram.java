package gitPractise;

public class FirstProgram {

	public static void main(String[] args) {
		
		int num=152;
		int sum=0;
		int rem;
		int temp = num;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("given number is palindrame");
		}
		else
		{
			System.out.println("given number is not palindrame");
		}

	}

}
