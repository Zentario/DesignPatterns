class Singleton {
  private static Singleton instance = null;
  
  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if(Singleton.instance == null)
    {
     Singleton.instance = new Singleton();
    }
    return Singleton.instance;
  }

  public void callFun() {
    System.out.println("This is singleton");
  }
}

public class SingletonDemo {
  public static void main(String[] args) {
    // Client side - can create only one instance of Singleton class statically
    Singleton instance = Singleton.getInstance();
    instance.callFun();
  }
}