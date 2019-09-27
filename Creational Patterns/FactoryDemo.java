interface Type {
  public void foo();
}

class Type1 implements Type {
  @Override
  public void foo() {
    System.out.println("This is object of type1 class");
  }
}

class Type2 implements Type {
  @Override
  public void foo() {
    System.out.println("This is object of type2 class");
  }
}

class FactoryHandler {
  public Type create(String name) {
    if(name == "type1")
    {
      return new Type1();
    }
    else if(name == "type2") {
      return new Type2();
    }
    else {
      return null;
    }
  }
}

public class FactoryDemo {
  public static void main(String[] args) {
    // Client side - can create objects of type Type
    FactoryHandler handler = new FactoryHandler();
    Type t1 = handler.create("type1");
    if(t1 != null) {
      t1.foo();
    }
    Type t2 = handler.create("type2");
    if(t2 != null) {
      t2.foo();
    }
    Type t3 = handler.create("type3");
    if(t3 != null) {
      t3.foo();
    }
    else {
      System.out.println("Cannot create such object...Class doesn't exist");
    }
  }
}