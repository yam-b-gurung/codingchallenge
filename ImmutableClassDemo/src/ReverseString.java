package codingchallenge;

public class ReverseString {
	
	public static void main(String[] args) {
		String testStr="bbc";
		String resultStr = reverseString2(testStr);
		System.out.println(resultStr);
		
	}

	private static String reverseString2(String str) {
		int left=0,right=str.length()-1;
		StringBuilder res=new StringBuilder(str);
		while(left<right) {
			char temp = str.charAt(left);
			res.setCharAt(left, str.charAt(right));
			res.setCharAt(right, temp);
			left++;
			right--;
		}
		return res.toString();
	}

	private static String reverseString(String str) {
		StringBuilder res=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			res.append(str.charAt(i));
		}
		
		return res.toString();
	}
		

}
