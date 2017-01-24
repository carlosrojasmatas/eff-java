package creation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by carlosrojasmatas on 1/20/17.
 *
 * Item 13: Minimize the accessibility of classes and members.
 *
 * -- Well designed classes hide implementation details.
 * -- Encapsulation is tone of the fundamentals in design.
 *    Decouples the module to make it testeable, optimized, understood and modified in isolation.
 *    Easy performance tuning.
 *    Increase software reuse --> modules aren't tightly coupled.
 *    Decrease risk in building large systems. Modules can be used individually.
 * -- Java provides access control mechanisms: modifiers protected, private, public.
 * -- Rule of thumb: make each class or member as inaccessible as possible.
 * -- Top level classes can be package-private(without modifier) or public.
 *    Classes and interfaces must be package-private as much as possible --> not exported in the api therefore can be
 *    changed without arm.
 * -- If the top level class is used by only one class consider making it nested and private to that class.
 * -- Members can be public, protected, private or package-private.
 * -- Once designed the public api
 *     1 - make all members private
 *     2 - if need arises, change some members to pakage private
 *     3 - lastly, only in extreme and well-justified cases, make it protected.
 * -- Only rule that restrict the ability to reduce the accessibility of methods.
 *    If a method overrides a superclass method, it's not permitted to have a lower access level in the subclass than
 *    it does in the superclass
 */
public class Item13 {

    //bad practices
    public static final StringBuffer BAD_BUFFER = new StringBuffer("this is gonna blow");
    private static final List<Integer> REALLY_BAD_INTEGER = Collections.emptyList();


    public void myMethod() {
        REALLY_BAD_INTEGER.add(1);
    }

    // good practice
    public static final String THE_STRING= "STRING";

    private static final String[] goodGuy = new String[]{"1","2"};

    public static final List<String> goodCopy = Collections.unmodifiableList(Arrays.asList(goodGuy));

    public static final String[] values = goodGuy.clone();
}
