package main;

import java.util.List;

public class ConsoleSorter {

	public static void main(String[] args) {
		
		new ConsoleSorter().run();

	}

	private void run() {
		List<Console> lc = lambdaSort();
		System.out.println(lc);
		
		List<Console> mc = methodSort();
		System.out.println(mc);
	}

	private List<Console> methodSort() {
		List<Console> mc = Console.getConsoles();
		mc.sort(Console::compare);
		return mc;
	}

	private List<Console> lambdaSort() {
		List<Console> lc = Console.getConsoles();
		lc.sort((c1,c2) -> Console.compare(c1,c2));
		return lc;
	}

}
