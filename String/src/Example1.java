//perform StringTokenization 

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Durga software solution");
		System.out.println("No of Tokens: "+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
