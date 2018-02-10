package com.springinaction.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		super();
		this.stream = stream;
	}

	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}
	
}
