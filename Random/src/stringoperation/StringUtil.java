package stringoperation;

public class StringUtil {

	public static void main(String args[]) {
		String line = "Hello Java! Hello World of Java Hello world hello";
		String matchedWith ="Hello World";
		String[] result = reverseMatchingString(line, matchedWith);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ' ');
		}
	}
	
	public static String[] reverseMatchingString(String line, String matchedWith) {
		String[] lineArray = line.split(" ");
		String[] matchedWithArray = matchedWith.split(" ");
		String result = "";
		
		for (int i = 0; i < lineArray.length;) {
			int j = matchedWithArray.length;
			if (isMatched(lineArray, i,i+ j-1, matchedWithArray)) {
				
				// reverse substring
				for (int k = i, l = matchedWithArray.length - 1; l>=0; k ++, l--) {
					System.out.println(k + "::"+ l);
					lineArray[k] = matchedWithArray[l];
				}
				i += j;
			}
			else {
				i++;
			}
		}
		
		return lineArray;
	}
	
	public static boolean isMatched(String[] lineArray, int startIndex, int endIndex, String[] matchedWithArray) {
		int j = 0;
		for (int i = startIndex; i <= endIndex && i < lineArray.length; i++, j++) {
			if (!lineArray[i].equalsIgnoreCase(matchedWithArray[j])) {
				return false;
			}
		}
		if (j==matchedWithArray.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
