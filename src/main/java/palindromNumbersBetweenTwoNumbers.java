import java.util.Scanner;

public class palindromNumbersBetweenTwoNumbers {
	
	public void palindrom() {
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println(num1);
		int num2 = sc.nextInt();
		System.out.println(num2);
		//sc.close();
		int numberOfPalindromsAre=0;
		for(int i=num1; i<=num2; i++) {
		
			int temp=i;
			int rem=0;
			int sum=0;
			while(temp>0) {
				
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/10;
			}
			
			if(i==sum)
			{
				numberOfPalindromsAre=numberOfPalindromsAre+1;
				System.out.println("PAlindrom no : " +sum);
			}
		}
		System.out.println(numberOfPalindromsAre);
	}

}
