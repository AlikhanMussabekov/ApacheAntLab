
public class lab4 {
    public static void labText() throws NewError, MyException {

        Author author = new Author();
        Pin pin = new Pin("Гвоздик");
        Dragon dragon = new Dragon("Стоголовый Дракон");
        Znaika znaika = new Znaika("Знайка");
        Citizens citizens = new Citizens();

        String[] chapter = new String[1];
        chapter[0] = "двадцать шестая";
        author.greed(pin);

        method(new Author(){
            public void greed(){
                System.out.print("Каждому ведь нравится, когда его хвалят.");
            }
        });

        author.newLine();
        author.startNewChapter(chapter[0]);
        pin.returning();
        author.newLine();

        Citizens.AfterMove.write();
        //citizens.getGoTo();
        treeInsert();
        pin.returning(Place.ISNOTATHOME);

        citizens.go(pin, Place.GREENCITY, true);

        author.newLine();
        author.sluh(dragon);
        author.then();
        dragon.goTo(Place.ZMEEVKA);
        System.out.print( dragon.kill(Citizens.Type.BABYF.description, false) );

        System.out.print( author.time(dragon) );
        author.newLine();
        author.change(Citizens.Type.BABYM, Place.ZMEEVKA);

        znaika.say();
        znaika.fly(Citizens.Type.FRIENDS);
        znaika.jumped(" с парашютом ");

        author.newLine();
        znaika.landed(State.LANDED, Place.FOREST);
        znaika.walked(Place.FIELD, Place.FOREST );
        znaika.search(Citizens.Type.FRIENDS);

        author.newLine();
        author.reveal(Citizens.Type.BABYM, znaika);

        znaika.goHome();
        znaika.decidedToFind(Citizens.Type.FRIENDS);
    }

    static void method(Author newAuthor){
        newAuthor.greed();
    }

    static void treeInsert(){

    }
}
