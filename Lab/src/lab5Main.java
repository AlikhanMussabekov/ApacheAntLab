
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class lab5Main {
    public static void main(String[] args) throws MyException, IOException, ParseException {

        TreeSetCollection mainTree = new TreeSetCollection();
        JsonCommandParser cmdParse = new JsonCommandParser();
        Scanner cmdIn = new Scanner(System.in);

        Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                mainTree.save();
                //System.out.println(11111111);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        Scanner path = new Scanner(System.getenv("LAB"));

        /*path.useDelimiter(":");

        String pathStr;
        String check = null;

        while(path.hasNext()){

            pathStr = path.next();

            if (pathStr.substring(pathStr.length()-4,pathStr.length()).equals("lab5"))
                check = pathStr;

        }
        path.close();
        */

        String pathStr = path.next();

        mainTree.setPath(pathStr);
        mainTree.readElements();

        mainTree.writeElements();

        //System.out.println(System.getenv("LAB"));

        while(true){
            System.out.println("Enter command:");

            String curCmd = cmdIn.next();

            if (Objects.equals(curCmd, "stop_app")){
                mainTree.save();
                System.out.println("Application stopped...");
                break;
            }
            else
                cmdParse.nextCommand(curCmd,mainTree);
        }
    }


}
