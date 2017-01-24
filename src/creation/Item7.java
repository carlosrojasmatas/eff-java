package creation;

/**
 * Created by carlosrojasmatas on 1/11/17.
 *
 * Item 7 : Avoid finalizers
 *
 * Never do anything critical on a finalizer
 *          -- there's no guarantee they'll be executed promptly.
 *          -- grave error: close files
 *          -- Depends on the JVM implementation
 *          -- Can be executed in any thread, including one with low priority
 *          -- Any exception is ignored.
 *          -- One solution --> provide an explicit termination method.
 *                              the state must be saved in a private field.
 *                              must be checked for the other methods of the object.
 *          -- Finalizers good for closing resources that the client forgot
 *              No guarantee but better late than never.
 *              This must be logged as a warning because it's a client side usage bug.
 *          -- They are also good with native peers??? ==> objects that delegate to other objects with native methods.
 *          -- Finalizers can't be chained. Subclasses must call super's finalizers.
 *          -- In public, non final class, use a finalizer guardian object to avoid missing super.finalize invocation on
 *             subclasses.
 */
public class Item7 {

    static class Finalizer1{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Don't do this!!!");
        }
    }

    static class Finalizer2 {
        private Object guardian = new Object(){
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Better, but still a shit");
            }
        };
    }

    public static void main(String[] args) {
        Finalizer1 f1 = new Finalizer1();
        Finalizer2 f2 = new Finalizer2();
    }

    @Override
    protected void finalize() throws Throwable {
        Thread.sleep(1000);
    }
}



