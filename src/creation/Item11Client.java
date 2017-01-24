package creation;

import com.sun.tools.javac.util.Assert;

/**
 * Created by carlosrojasmatas on 1/18/17.
 */
public class Item11Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Item11 i11 = new Item11();
        Object i2 = i11.clone();
        Object i3 = i11.clone2();
        Assert.check( i2.getClass() == i3.getClass());

    }
}
