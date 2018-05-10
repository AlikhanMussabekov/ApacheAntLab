package ru.cs.ifmo;

public enum State {
    TOPRAISE(" похвалили ") , WILLNOTDARE("не осмелится "), DIDNOTAPPEAR("не появлялся "), APPEAR("появился"), TOLD("рассказывал"),
    FLYED("летeл"), JUMPEDOUT("спрыгнул"), LANDED("приземлился");

    private String description;

    State (String description) {
        this.description = description;
    }

    String getDescription(){
        return description;
    }
}
