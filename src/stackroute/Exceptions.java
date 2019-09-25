package stackroute;

public class Exceptions {
	Exceptions(String s) throws Exception {
		throw new Exception("thrown_exception");
	}
 public static void main(String args[]) {
	 try {
		 Exceptions ex = new Exceptions("exception");
	 }catch(Exception e) {
		 System.out.print("Exception :"+e.toString()+" was caught");
	 }finally {
		 System.out.print(" finally was executed");
	 }
 }
}
