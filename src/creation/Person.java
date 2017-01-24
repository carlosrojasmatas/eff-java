package creation;

/**
 * Created by carlosrojasmatas on 1/9/17.
 */
class Person {

    private String name;

    public Person(String name) {

        this.name = name;
        System.out.println(String.format("Creating a person %s", name));
    }

    public static Person valueOf(String name) {
        return new Person(name);
    }
}
