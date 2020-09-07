public class additionOfTheNumberIntheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1asd2ade3asd11asdw3";
		
		String[] strArr=str.split("[a-zA-z]");
		int add=0;
		
			for (int i = 0; i < strArr.length; i++) {
				//System.out.println(strArr[i]);
				try {
				int temp1=Integer.parseInt(strArr[i]);
				add=add+temp1;
				} catch (NumberFormatException e) {
				
			}
		
			// TODO: handle exception
		}
		
		System.out.println(add);
	}

}
