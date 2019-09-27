class ExampleClass implements Cloneable {

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public void info() {
    System.out.println(this);
  }
}

public class PrototypeDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
    // Client side - can clone objects of ExampleClass
    ExampleClass e1 = new ExampleClass();
    e1.info();

    // e2 is a deep cpoy of e1
    ExampleClass e2 = (ExampleClass) e1.clone();
    e2.info();    
  }
}