package creation;

/**
 * Created by carlosrojasmatas on 1/18/17.
 * Item 12: Consider implementing comparable.
 *
 * -- Is advisable to implement this interface.
 * -- No used only for order, but to compute extreme values, search and automatically maintain sorted collections.
 * -- Wrong implementations can break classes that depends on comparison, like TreeSet, TreeMap, Collections, Arrays, etc.
 * -- Provisions:
 *      sgn(x.compareTo(y)) == -sgn(y.compareTo(x))
 *      (x.compareTo(y) > 0 && y.compareTo(z)>0) implies x.compareTo(z)>0
 *      x.compareTo(y) == 0 implies sgn(x.compareTo(z)) == sgn(y.compareTo(z))
 *      (x.compareTo(y) == 0 ) == (x.equals(y))
 *-- The same warnings than equals applies
 *-- If the last provision applies, then equals is consistent with ordering, otherwise is not.
 *
 *
 */
public class Item12 implements Comparable<Integer> {


    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
