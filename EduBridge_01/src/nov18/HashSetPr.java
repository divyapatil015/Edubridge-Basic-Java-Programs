package nov18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hobj = new HashSet<Integer>();
		hobj.add(67);
		hobj.add(66);
		hobj.add(67);
		hobj.add(56);
		hobj.add(67);
		hobj.add(null);
		System.out.println("HashSet : ");
		System.out.println(hobj);
		
		System.out.println("LinkedHashSet :  ");
		LinkedHashSet<Integer> lobj = new LinkedHashSet<Integer>();
		lobj.add(67);
		lobj.add(66);
		lobj.add(67);
		lobj.add(56);
		lobj.add(67);
		lobj.add(null);
		System.out.println(lobj);
		
		TreeSet<Integer> tobj = new TreeSet<Integer>();
		tobj.add(67);
		tobj.add(66);
		tobj.add(67);
		tobj.add(56);
		tobj.add(67);
		//tobj.add(null); null is not allowed in TreeSet
		System.out.println("TreeSet : ");
		System.out.println(tobj);

	}

}
