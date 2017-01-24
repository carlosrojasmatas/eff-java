package creation;

/**
 * Created by carlosrojasmatas on 1/9/17.
 */
public class Item4 {

    public static void main(String[] args) {
        ClassWithoutConstructor cwc = new ClassWithoutConstructor();

        cwc.sayHello();

        ClassNotInstantiable.sayHello();
    }
}
