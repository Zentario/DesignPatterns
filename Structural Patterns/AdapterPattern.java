class Adaptee {
  public void specificRequest() {
    System.out.println("Adaptee request called");
  }
}

interface IInput {
  public void request();
}

class Adapter implements IInput {

  Adaptee adaptee = new Adaptee();

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    this.adaptee.specificRequest();
  }
}

class Main {
  public static void main(String[] args) {
    // Client side - call request from adapter
    IInput input = new Adapter(new Adaptee());
    System.out.println("Calling Iinput's request using adapter");
    input.request();
  }
}