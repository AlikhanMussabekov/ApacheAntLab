
public class Pin implements Creature{

    private String name = new String();
    private int age;
    public Place curPlace = Place.ISNOTATHOME;
    private int curWorkingSpeed = 0;
    public State curState;


    Pin(String name){
        this.name = name;
    }

    public void returning (){
        System.out.print(" ВОЗВРАЩЕНИЕ ГВОЗДИКА");
    }

    public void returning(Place place){
        if (place == Place.ISNOTATHOME){
            System.out.print(" Гвоздик не вернулся домой");
        }
    }

    public void reaction(){
        if (curState == State.TOPRAISE) {
            System.out.print("А Гвоздик, довольный тем, что его " + curState.getDescription());
            curWorkingSpeed++;
            checkCurWorkingSpeed();
        }
    }

    private void checkCurWorkingSpeed(){
        if (curWorkingSpeed > 0){
            System.out.print(" стал работать еще старательнее.");
        }
    }

    public void whereIsPin(){
        if (curPlace == Place.ISNOTATHOME){
            System.out.print("Гвоздик" + curPlace.getDescription() + " ");

        }
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
