package creation;

import java.util.Arrays;

/**
 * Created by carlosrojasmatas on 1/9/17.
 */
public class Item6 {

    private Object[] elements;
    private  int INITIAL_CAPACITY=16;
    private int size=0;

    public Item6() {
        elements = new Object[this.INITIAL_CAPACITY];
    }

    public void stack(Object o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if(size == 0) throw new RuntimeException("emtpy stack");
        Object o = elements[--size];
        elements[size] = null;
        return o;
    }

    private void ensureCapacity(){
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
