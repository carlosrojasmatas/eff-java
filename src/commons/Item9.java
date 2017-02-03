package commons;

/**
 * Created by carlosrojasmatas on 1/11/17.
 *
 * Always override hashCode when override equals
 * -- Hashcode alwahs returns the same integer in the same object.
 * -- If two objects are equals(), hashcode returns the same int.
 * -- Not required but recommended that if two objects are unequals return distinct int.
 * -- If returning the same hashcode (i.e 42) the hashtable degenerates in linked list. (check this)
 * -- Recipe for good hashcode:
 *    1 - Store some number x, better if primus, in a var ex. result.
 *    2 - For each field:
 *        a - compute an int
 *           -- if a field is a boolean, 1 or 0
 *           -- if byte,char,short or int compute (int)f.
 *           -- if long compute (int) (f ^(f >>> 32))
 *           -- if float, Float.floatToIntBits(f)
 *           -- if double, Double.double.ToLongBits(d) and hash as step 2.3
 *           -- if object reference, invoke haschde on every field. If null return 0.
 *           -- if an array, apply these rules recursively on every element and combine according to 2-b
 *        b - combine the hashcode result = 31 * result + c;
 *        c - return result.
 */
public class Item9 {

    //constructed by the principles of item8

    class PhoneNumber {
        private final short areaCode;
        private final short prefix;
        private final short lineNumber;

        public PhoneNumber(short areaCode, short prefix, short lineNumber) {
            rangeCheck(areaCode, 999, "area code");
            rangeCheck(prefix, 999, "prefix");
            rangeCheck(lineNumber, 9999, "line number");
            this.areaCode = areaCode;
            this.prefix = prefix;
            this.lineNumber = lineNumber;
        }
        private  void rangeCheck(int arg, int max,
                                       String name) {
            if (arg < 0 || arg > max)
                throw new IllegalArgumentException(name +": " + arg);
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) return true;
            if(!(o instanceof PhoneNumber)) return false;
            PhoneNumber n = (PhoneNumber)o;

            return n.areaCode == areaCode && n.lineNumber == lineNumber && n.prefix == prefix;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + lineNumber;
            result = 31 * result + prefix;

            return result;

        }
    }
}
