import java.util.Scanner;

public class numerOfDaysToReachTerrace {
	public void numberOfDaysToReachTerrace() {
		Scanner sc= new Scanner(System.in);
		int stepUp= sc.nextInt();
		int stepDown=sc.nextInt();
		int totalStairs= sc.nextInt();
		int numberOfDays=0;
		int stepsClimbedAre=0;
		
		do {
			stepsClimbedAre=stepsClimbedAre+(stepUp-stepDown);
			numberOfDays=numberOfDays+1;
			System.out.println("numberOfDays" + numberOfDays);
		}while(stepsClimbedAre<totalStairs);
		
		System.out.println("numberOfDays" + numberOfDays);
	}

}
