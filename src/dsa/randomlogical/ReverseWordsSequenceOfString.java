package dsa.randomlogical;

public class ReverseWordsSequenceOfString {

	public static void main(String[] args) {

		reverseWords("Me love Java");
	}

	static void reverseWords(String s) {

		StringBuffer word = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				word.append(s.charAt(i));
			}
			if(s.charAt(i) == ' ' || i == s.length()-1) {
				System.out.print(word.toString()+ " ");
				word = new StringBuffer();
			}
		}
		//second logic
		System.out.println("\n"+"----------");
		for(int i = s.length()-1; i >=0; i--) {
			int end = i, j = i;
			while(j > 0 && s.charAt(j-1) != ' ') {
				j--;
				end--;
			}
			while(j <= i) {
				System.out.print(s.charAt(j));
				j++;
			}
			if(end !=0 && s.charAt(end-1) == ' ')
			System.out.print(" ");
			i = end-1;
		}
	}

}
