package five;

import java.util.List;
import java.util.Set;

public class Box<E, X extends List<E>, Y extends Set<E>>{
    private E field;
    private X length;
    private Y width;
}
