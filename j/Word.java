package Java_Basic;

public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}
	
	private String letters;
	
	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	// i 번째 글자가 모음인지 ( a, i, u, e, o )
	public boolean isVowel(int i) {
		String str_i = letters.substring(i, i + 1);
		
		if (str_i.equals("a") || str_i.equals("i") || str_i.equals("u") || str_i.equals("e") || str_i.equals("o")) {
			return true;
		} else {
			return false;
		}
	}
}
