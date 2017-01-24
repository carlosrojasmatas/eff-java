package creation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by carlosrojasmatas on 1/9/17.
 */
public class Item5 {

    private class WrongClass {
        private final Date someDate;


        public WrongClass(Date d){
            this.someDate = d;
        }

        public void wrongComputation() {
            Calendar c= Calendar.getInstance();
            Date c1 = c.getTime();

            //do something else
        }

    }

    private class GoodClass{

        private final Date internalDate;
//        private static final Date someDate;
//
//        static{
//            someDate = GregorianCalendar.getInstance().getTime();
//        }
        public GoodClass(Date internalDate) {
            this.internalDate = internalDate;
        }

        public void doSomething(){

        }
    }


}
