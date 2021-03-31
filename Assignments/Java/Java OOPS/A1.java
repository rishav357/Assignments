public class A1 {
    private static A1 INSTANCE = null;
    private A1() {}
    public static A1 getInstance() {
        if (INSTANCE == null) {  
          synchronized(A1.class) {
              INSTANCE = new A1();
          }
        }
        return INSTANCE;
    }
}