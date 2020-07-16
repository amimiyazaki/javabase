package MyComp;

import java.util.Comparator;

public class MyComp implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}
}

