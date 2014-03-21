package com.springinaction.knights;

public class DamselRescuingKnight implements Knight {
    private final RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest(); // <co id="co_coupledToQuest"/>
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
