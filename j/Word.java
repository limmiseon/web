package algorithm;

public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
		System.out.println(word.isVowel(2));
		System.out.println(word.isVowel(3));
		System.out.println(word.isVowel(4));
		System.out.println();
		System.out.println(word.isConsonant(0));
		System.out.println(word.isConsonant(1));
		System.out.println(word.isConsonant(2));
		System.out.println(word.isConsonant(3));
		System.out.println(word.isConsonant(4));
		
	}
	
	private String letters;
	
	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	// i 번째 글자가 모음인지 ( a, i, u, e, o )
	public boolean isVowel(int i) {
		String strIndex = letters.substring(i, i + 1);
		String vowel = "aiueo";
		
		return vowel.contains(strIndex);
	}
	
	// i 번째 글자가 자음인지 ( a, i, u, e, o 제외한 나머지)
	public boolean isConsonant(int i) {
		return !isVowel(i);
	}
}