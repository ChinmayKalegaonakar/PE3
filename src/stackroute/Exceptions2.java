package stackroute;

public class Exceptions2 {
	Exceptions2(){
		n_size();
		index();
		nullp();
	}
	public static void n_size() {
		throw new NegativeArraySizeException();
	}
	public static void index() {
		throw new IndexOutOfBoundsException();
	}
	public static void nullp() {
		throw new NullPointerException();
	}
	
}
