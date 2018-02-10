package com.springinaction.knights;

public class BraveKnight implements Knight{
	private Quest quest;

	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}
