public class Singleton3 {
    private static volatile Singleton3 singleton3 = null;
    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if(singleton3 != null) return singleton3;
        synchronized (Singleton3.class) {
            if(singleton3 == null) {
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }

}
