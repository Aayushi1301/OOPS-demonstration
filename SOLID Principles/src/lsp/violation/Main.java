package lsp.violation;
import java.util.*;
public class Main {
    public static void main(String args[]){
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());
        birds.add(new Raven());
        birds.add(new Ostrich());
        for (Bird b : birds) { b.fly(); }

        // The above code throws exception when an Ostrich instance is passed.
        // The sub type Ostrich is not replaceable for the super type Bird.
    }
}
