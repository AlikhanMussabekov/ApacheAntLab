
public class Znaika implements Creature{

    private String name = "";
    private int age;

    public Znaika(String name){
        this.name = name;
    }


    public void say(){
        class Local{
            public void printMessage(){
                System.out.print(" Он рассказывал ");
            }
        }

        Local local = new Local();
        local.printMessage();
    }

    public void goHome(){
        System.out.print("Вместо того чтобы преспокойно вернуться" + Place.HOME.getDescription());
    }

    public void decidedToFind(Citizens.Type type){
        System.out.print(getName() + " решил разыскать своих " + type.description);
    }

    public void fly(Citizens.Type type){
        System.out.print("что " + State.FLYED.getDescription() +
            "на воздушном шаре вместе со своими" + type.description);
    }

    public void jumped(String s){
        System.out.print(" и " + State.JUMPEDOUT.getDescription() + s +
            "когда шар стал падать");
    }

    public void landed(State state, Place place){
        System.out.print("Он " + state.getDescription() +
            " в " + place.getDescription());
    }

    public void walked(Place firstPlace, Place secondPlace){
        System.out.print(" и с тех пор скитался "
         + "по " + firstPlace.getDescription() + " и по " + secondPlace.getDescription());

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

    public void search(Citizens.Type friends) {
        System.out.print(", разыскивая своих " + friends.description
         + "которые улетели дальше на воздушном шаре.");
    }
}
