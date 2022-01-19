// StringBuffer method implementation

public class Example4 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Durga");
		StringBuffer sb1 = sb.append("Software");
		StringBuffer sb2 = sb1.append("Solutions");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		
		StringBuffer sb3 = sb2.insert(14, "Limited");
		System.out.println(sb3);
		
		System.out.println(sb2.reverse());
		
		StringBuffer sb4 = sb2.delete(4, 10);
		System.out.println(sb4);
		
	    sb.setLength(4);
	    System.out.println(sb);

	}

}
