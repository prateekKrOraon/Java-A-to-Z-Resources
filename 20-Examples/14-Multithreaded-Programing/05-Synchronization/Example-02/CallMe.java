/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}