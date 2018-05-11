
public enum Place {

    ZMEEVKA("Змеевка"), GREENCITY("Зеленый город"), HOME("Домой"), ISNOTATHOME("не дома"),
    FOREST("дремучем лесу"), FIELD("поле");

    private String description;

    Place (String description) {
        this.description = description;
    }

    String getDescription(){
        return description;
    }

}
