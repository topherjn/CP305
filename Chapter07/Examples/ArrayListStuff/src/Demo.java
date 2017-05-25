import java.util.ArrayList;

/**
 * Created by nicholson on 5/25/2017.
 */
public class Demo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Jeff");
        names.add("Tandy");
        names.add("Carol");
        names.add("Phil");


        if(names.contains("Biff")) {
            System.out.printf("Yes");
        }

        for(String name : names) {
            System.out.println(name);
        }
    }
}
