public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();
    private Singleton1()  {
        if (singleton1 != null)
            throw new RuntimeException("Can not create the object");
    }

    public Singleton1 getInstance() {
        return singleton1;
    }

}
