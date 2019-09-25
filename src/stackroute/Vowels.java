package stackroute;

public class Vowels {
	public static String[] removeVowels(String[] names) {
		String[] removed = new String[names.length];
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(String s:names) {
			sb = new StringBuilder("");
			for(Character c:s.toCharArray()) {
				switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':break;
				default:sb.append(c);
				}
			}
			removed[count++] = sb.toString();
		}
		return removed;
	}
}
