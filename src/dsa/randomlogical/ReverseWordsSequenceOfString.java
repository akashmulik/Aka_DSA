package dsa.randomlogical;

public class ReverseWordsSequenceOfString {

	public static void main(String[] args) {

		reverseWords("I love Java");
	}

	static void reverseWords(String s) {

		String[] res = new String[s.length()];
		int arrCnt = 0;
		StringBuffer word = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				word.append(s.charAt(i));
			} 
			if(s.charAt(i) == ' ' || i == s.length()-1) {
				res[arrCnt] = word.toString();
				arrCnt++;
				word = new StringBuffer();
			}
		}
		for(String re : res)
			System.out.println(re);
	}

}
