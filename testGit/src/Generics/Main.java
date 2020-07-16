package Generics;

public class Main {

	public static void main(String[] args) {
		Thing<String> strThing = new Thing<>("Hello");
		System.out.println(strThing.getObj());

		Thing<Integer> intThing = new Thing<>(128);
		System.out.println(intThing.getObj() + 10);

		Pc pc = new Pc("モバイルPC",1080);
		Thing<Pc> pcThing = new Thing<>(pc);
		System.out.println(pcThing.getObj());
	}

}
