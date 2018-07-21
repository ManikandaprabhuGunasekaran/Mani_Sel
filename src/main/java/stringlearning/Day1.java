package stringlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Day1 {

	public static void main(String[] args) {
		/*		
		 * //StringBuilder
		StringBuilder build=new StringBuilder("Mani");
		System.out.println(build.reverse());
		//String
		String Name="Mani";

		char[] charArray = Name.toCharArray();
		for(int i=Name.length()-1;i>=0;i--) {

			System.out.println(charArray[i]);
		}
//StringBu
		StringBuffer buffer=new StringBuffer("Mani");
		System.out.println("\n"+buffer.reverse());
StringBuilder reverseBuild = build.reverse();

		for (char c :reverseBuild.toString().toCharArray()) {

			System.out.println(c);

		}

		String b=Name.replace("ni", "ss");
		System.out.println(b);

		//Name.



		 */	
		//using list
		List<Character> b=new ArrayList<Character>();

		String comp="google";
		char[] charArray = comp.toCharArray();
		for (Character c : charArray) {
			if(!b.contains(c))
			{
				b.add(c);
			}
		}
		System.out.println(b);



		List<Character> m=new LinkedList<Character>();


		for (Character l: charArray) {
			if(!m.contains(l))
			{
				m.add(l);
			}
		}
		System.out.println(m);

		//using set
		Set<Character> b1=new HashSet<Character>();
		for (Character d : charArray) {

			b1.add(d);

		}

		System.out.println(b1);

		Set<Character> b2=new LinkedHashSet<Character>();
		for (Character e : charArray) {

			b2.add(e);

		}

		System.out.println(b2);

		Set<Character> b3=new TreeSet<Character>();
		for (Character f : charArray) {

			b3.add(f);

		}

		System.out.println(b3);


		
		ArrayList<Character> arr=new ArrayList<Character>();
		for (int j = 0; j < charArray.length; j++) {
			arr.add(charArray[j]);
		}
		System.out.println(arr);
		Arrays.sort(charArray);
		System.out.println(charArray);
	
		
	}



}
