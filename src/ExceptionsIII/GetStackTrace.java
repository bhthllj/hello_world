package ExceptionsIII;

/**
 * Created by behat on 19/02/2017.
 */
public class GetStackTrace {
    public static void showTrace() {
        for(StackTraceElement trace : Thread.currentThread().getStackTrace()) {
            System.out.println(trace);
        }
    }

    public static void recM(int n) {
        if( n == 0) {
            showTrace();
        } else {
            recM(n-1);
        }
    }

}
