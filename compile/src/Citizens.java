package ru.cs.ifmo;

public class Citizens implements Creature{

    private String name = "";
    private int age;

    public Citizens(){}

    public Citizens(String name, String age) {
        this.name = name;
        this.age = Integer.parseInt(age);
    }

    enum Type{
            CITIZENS("жители"), BABYM("малыш"), BABYF("малышка"), FRIENDS("товарищи");

            public String description;
            private boolean enumType = false;

            Type (String description){
                this.description = description;
            }

            public void getDescription(){
                System.out.print(this.description);
            }
    }

    void go(Pin pin, Place place, boolean all) throws MyException {

        String goTo = "";

        if (pin.curPlace !=Place.HOME && place == Place.GREENCITY && !all){
            goTo = " никто из " + Type.CITIZENS.description + " "
                    + Place.ZMEEVKA.getDescription() + " не осмелится пойти в "
                    + place.getDescription();
        }
        else if(pin.curPlace !=Place.HOME && place == Place.GREENCITY && all) {



            goTo = " не осмелились пойти в "
                    + place.getDescription();
        }
        else {
            goTo = "пошли в " + place.getDescription();
        }
        System.out.print(goTo);
    }

    public static class AfterMove{
        public static void write(){
            System.out.print("После того как");
        }
    }


    @Override
    public void live() {

    }

    @Override
    public void toDo() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
