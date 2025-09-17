package codingchallenge2025sep;

public class ReverseString {

	public static void main(String[] args) {
		String res = reverseString("apple");
		
		System.out.println(res);
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		StringBuilder res=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			res.append(str.charAt(i));
		}
		
		return res.toString();
		
	}

}
