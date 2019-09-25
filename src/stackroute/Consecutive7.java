package stackroute;

public class Consecutive7 {
	public static boolean isConsecutive7(String input) {
		String[] s_numbers = input.split(",");
		int[] numbers = new int[s_numbers.length];
		int count = 0;
		for(String s:s_numbers) {
			numbers[count++] = Integer.parseInt(s);
		}
		for(int i = 1;i < 6;i++) {
			if(!(numbers[i+1]-numbers[i]==1)) {
				return false;
			}
		}
		return true;
	}
}
