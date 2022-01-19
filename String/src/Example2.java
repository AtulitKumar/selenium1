// .equals method

public class Example2 {

	public static void main(String[] args) {
		Example2 a = new Example2();
		Example2 b = new Example2();
		
		int i=10;
		int j=10;
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(a==b);
		System.out.println(i==j);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(a.equals(b));
		

	}

}
