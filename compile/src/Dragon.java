package ru.cs.ifmo;

public class Dragon implements Creature{

    private int age;
    private String name = "";

    public Dragon(String name){
        this.name = name;
    }

    public String kill(String s, boolean bool){
        if (bool)
            return " скоро прикончит всех " + s;
        else
            return " глотать " + s;
    }

    public void goTo(Place place){
        System.out.print(" явится в " + place.getDescription());
    }

    @Override
    public void live() {

    }

    @Override
    public void toDo() {

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
