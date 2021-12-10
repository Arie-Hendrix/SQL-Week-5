package main;

import java.util.NoSuchElementException;
import java.util.Optional;

public class ConsoleOptional {

	public static void main(String[] args) {
		new ConsoleOptional().run();

	}

	private void run() {
		Console console = optCon(Optional.of(new Console("Nintendo Gamecube")));
		System.out.println(console);
		
		try {
			optCon(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Console optCon(Optional<Console> conOpt){
		return conOpt.orElseThrow(() -> new NoSuchElementException("No consoles to list"));
	}

}
