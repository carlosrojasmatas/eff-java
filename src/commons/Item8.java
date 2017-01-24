package commons;

import java.awt.*;

/**
 * Created by carlosrojasmatas on 1/11/17.
 *
 * Item 8: Obey the general contract when overriding equals
 *  -- If possible, don't override equals. This is true when:
 *     * Each instance of the class is inherently unique, i.e threads.
 *     * Don't care about logical equality: i.e. random
 *     * A superclass has already implemented equals and is ok.
 *     * The class is private or package-private and equals will never be invoked --> need to implements to throw
 *     exception thought.
 *  -- Overrides when logical equality needs arises
 *  -- Not required if you use instance control, i.e. enums
 *  -- Must be reflexive, symmetric, transitive,consistent and non-nulleable.
 *  -- Extend a class and add value properties breaks transitivity and reflexivity --> workaround: composition.
 *  -- Timestamp and date violates Liskov principle and can be unstable.
 *  -- Don't write equals implementations that depends on external resources.
 *  -- o.equals(null) should return false, not throw a NPE<-- wrong, use instanceof, which is intented to return false
 *  if the first operator is null.
 *  -- Checklist for a good implementation:
 *      - Use == for references
 *      - Use instance of
 *      - Cast object to correct type
 *      - Check every significant field
 *      - Afterwards, unit-test symmetry, transitivity, consistence.
 *
 */
public class Item8 {

    //transitivity brokey
    public class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if(!(o instanceof Point)) return false;
            Point p  = (Point)o;
            return this.x == p.x && p.y == this.y;
        }
    }

     public class ColorPoint extends Point {
        private final Color color;


         public ColorPoint(int x, int y, Color color) {
             super(x, y);
             this.color = color;
         }


         //wrong
         @Override
         public boolean equals(Object o) {
             if(! (o instanceof ColorPoint)) return false;
             else return super.equals(o) && ((ColorPoint)o).color == color;
         }
     }

}
