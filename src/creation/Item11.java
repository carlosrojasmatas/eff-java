package creation;

/**
 * Created by carlosrojasmatas on 1/18/17.
 *
 * Item 11: Override clone judiciously
 *
 * -- Cloneable fails to provide a method to clone objects --> it lacks a clone method
 * ------Is intended to determine the behavior of the clone implementation --> if implemented returns a field-by-field
 *       copy of the object, CloneNotSupportedException otherwise.
 * -- If implemented, the classes and the subclasses must obey a complex and poor documented
 * -- According to j6, clone contract:
 * ----- x.clone() != x
 * ----- x.clone().getClass() == x.getClass()
 * ----- x.clone().equals(x)
 * -- If you override the clone method in a nonfinal class, you should return an object obtained by invoking super.clone.
 *       If all of a class's superclasses obey this rule, invoking super.clone eventually will call Object.clone() method,
 *       creating an instance of the right class.
 * -- In practice, a class implementing Cloneable must provide a properly functioning public clone method.
 * -- If you need access to all fields just as it is, then super.clone() is fine.
 * -- When overriding clone, because of covariance of generics, is legal and desireable to override the "object" type
 * returned by the Object.clone() method.
 * -- If you have references fields, the super.clone does not work. You must implement a clone fore every field.
 * -- Clone is not compatible with normal use of final fields.
 * -- If an array field is made of references (i.e Entry[]), each instance must provide a deepCopy object.
 * -- Fine approach --> copy constructor or copy factory <<- prefer this over cloneable interface.
 *

 */
public class Item11 implements Cloneable{



    @Override
    public Item11 clone() throws CloneNotSupportedException {
        return (Item11)super.clone();
    }


    public Object clone2() throws CloneNotSupportedException {
        return new Item11();
    }

    public static void main(String[] args) {
        Item11 i11 = new Item11();
    }
}
