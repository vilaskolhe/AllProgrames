public class addTheNumberFromTheString {

	public static void main1(String[] args) {
		String mixString = "abc1abc2abc3xyz11abc3";

		String strArr[] = mixString.split("[^0-9]");
		int sum = 0;

		for (String string : strArr) {
			try {
				sum = sum + Integer.parseInt(string);
			} catch (NumberFormatException e) {
			}

		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		String mixString = "abc1abc2abc3xyz11abc3";
		
	}
		
}
