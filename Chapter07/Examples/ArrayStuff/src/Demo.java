/**
 * Created by nicholson on 5/25/2017.
 */
public class Demo {

    public static void main(String[] args) {

        double [] array = {23.4,2.1,-0.9,4.5,-1.5};

        // data structure
        // fixed size at creation
        // data (elements) are contiguous in memory
        // indexes/indices & elements
        // subscript
        /*
        [23.4][2.1][-0.98][4.5][-1.5]
         */
        // pros: simple and fast
        // cons: fixed size | don't grow and shring with size of data
        // have to be aware of bounds

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
