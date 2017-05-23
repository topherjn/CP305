/**
 * Created by nicholson on 5/17/2017.
 */
public class Methods {


    public static void main(String[] args) {

        int num = 4;

        System.out.println(greeting("Jack", "Nicholson"));

        System.out.println(greeting("sadlfjs sadlfjds flkdsaj lsjflsajfsafsaj salfjlsajfdsajfdsajf"));

        greeting();

        String firstName = "MiKe";


        if(firstName.toLowerCase().equals("mike"))
        {
            System.out.println("Match");
        }

    }


    // overloaded methods

    public static String greeting() {
        System.out.println("sup");

        return "Sup";
    }

    public static String greeting(String first, String last)
    {
        return new String("hello" + first + " " + last);
    }

    public static String greeting(String name)
    {
        return new String("Hi" + name);
    }
}
