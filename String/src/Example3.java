// Implementation of 19 String class methods


public class Example3 {

	public static void main(String[] args) {
		
		String s = "Durga Software solutions";
		String s1 = "DURGA SOFTWARE SOLUTIONS";
		String s3 = "Heydrabad";
		String s4 = "Ameerpet";
		
		System.out.println(s.length());
		System.out.println(s.concat("Atul"));
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s3));
		
		System.out.println(s4.compareTo(s3));
		System.out.println(s.startsWith("Durga"));
		System.out.println(s.endsWith("solutions"));
		
		System.out.println(s.contains("Software"));
		System.out.println(s.replace('s','r'));
		System.out.println(s.indexOf("So"));
		
		System.out.println(s.lastIndexOf("so"));
		System.out.println(s.substring(6));
		System.out.println(s.substring(6, 14));
		
		byte[] b = s3.getBytes();
		for(int i=0;i<s3.length();i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		char[] ch = s4.toCharArray();
		for(int i=0;i<s4.length();i++)
			System.out.print(ch[i]+" ");
		System.out.println();
		
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		String[] s7 = s.split(" "); 
		for(int i=0; i<s.length(); i++) 
		{ 
		 System.out.println(s7[i]); 
		} 
		
		

	}

}
