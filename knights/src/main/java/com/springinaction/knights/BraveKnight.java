package com.springinaction.knights;

public class BraveKnight implements Knight {
    private final Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest; // <co id="co_injectedQuest"/>
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
