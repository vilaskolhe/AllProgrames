public class reverseTheNumber {

	public static void main1(String[] args) {
		int num=12345;
		int revNum=0;
		while(num>0) {
			
			int reminder=num%10;
			revNum=reminder+10*revNum;
			num=num/10;
		}
		System.out.println(revNum);
	}

	public static void main(String[] args) {
		int num=12345;
		String str=String.valueOf(num);
		String revStrin = "";
		for (int i = str.length()-1; i >0 ; i--) {
			revStrin=revStrin+str.charAt(i);
		}
		
		System.out.println(Integer.parseInt(revStrin));
	}
}
