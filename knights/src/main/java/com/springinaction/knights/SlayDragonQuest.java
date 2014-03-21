package com.springinaction.knights;

public class SlayDragonQuest implements Quest {
    public void foo() throws Exception {
        System.out.println("hi world");
    }

    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }
}
