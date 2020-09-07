import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromString {

	public String removeDuplicateCharacters(String str) {
		String result="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= result.length(); j++) {
				if(!result.contains(str.charAt(i)+"")) {
					result=result+str.charAt(i)+"";
				}
				
			}
			
		}
		return result;
	}
	
	public String removeDuplicateByUsingSet(String str) {
		
		String result="";
		Set<String> setOfString=new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			setOfString.add(Character.toString(str.charAt(i)));
		}
		for (String string : setOfString) {
			result=result+string;
		}
		//System.out.println(result);
		return result;
	}
}
