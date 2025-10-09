package codingchallenge;

public class StringContainsVowel {

	public static void main(String[] args) {
		System.out.println(stringContainsVowel("bbc"));
	}

	private static boolean stringContainsVowel(String str) {
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			return true;
		}
			return false;
		
	}

}
