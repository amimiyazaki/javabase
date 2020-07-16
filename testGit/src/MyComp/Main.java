package MyComp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member(10,"たかはし"));
		list.add(new Member(20,"きのした"));
		list.add(new Member(30,"のざき"));
		list.add(new Member(40,"いのうえ"));

		MyComp comp = new MyComp();
		list.sort(comp);

		for(Member m : list) {
			System.out.println("ID:"+m.getId()+"名前"+m.getName());
		}
	}
}
