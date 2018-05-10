package ru.cs.ifmo;

public class Author {

    public void startNewChapter(String curChapter) {
        System.out.print("Глава " + curChapter + ".");
    }
    public void newLine() {
        System.out.println();
    }

    public void sluh(Dragon dragon){
        System.out.print("Разнесся слух, что " + dragon.getName()
            + dragon.kill(Citizens.Type.BABYF.description, true)
        );
    }

    public void then(){
        System.out.print(", а потом ");
    }

    public void greed(Pin pin) {
        pin.curState = State.TOPRAISE;
        pin.reaction();
    }

    public String time(Dragon dragon){
        return " Время шло, но " + dragon.getName()
                + " не появлялся ";
    }

    public void greed(){}

    public void change(Citizens.Type type, Place place) {
        System.out.print(" , а вместо него  " +
            "в одно прекрасное утро в " + place.getDescription()
                + appear(type) );
    }

    private String appear(Citizens.Type type){
        return " появился совсем незнакомый " + type.description;
    }

    public void reveal(Citizens.Type type, Znaika znaika){
        System.out.print("Некоторые, самые догадливые, читатели уже, наверно, догадались, что этот незнакомый "
            + type.description + " был не кто иной, как " + znaika.getName());
    }

}
