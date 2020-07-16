package Noname;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member(10,"たかはし"));
		list.add(new Member(20,"きのした"));
		list.add(new Member(30,"のざき"));
		list.add(new Member(40,"いのうえ"));

		Comparator<Member> comp = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			String s1 = o1.getName();
			String s2 = o2.getName();
			return s1.compareTo(s2);
			}
		};

		list.sort(comp);

		for(Member m : list) {
			System.out.println("ID:"+m.getId()+"名前"+m.getName());
		}
	}
}
