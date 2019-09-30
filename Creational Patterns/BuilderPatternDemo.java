
class Example {
  // Should only have getters and not setters
  private int a;
  private int b;
  private boolean isTrue;

  // Private condtructor, because creation only through Builder class
  private Example(Builder builder) {
    this.a = builder.a;
    this.b = builder.b;
    this.isTrue = builder.isTrue;
  }

  // Builder must be statically used in client
  static class Builder {
    // Required Parameters
    private int a;
    private int b;
    // Optional parameter
    private boolean isTrue = false;

    public Builder(int a, int b) {
      this.a = a;
      this.b = b;
    }

    // Provider setter for optional parameters
    public Builder setTrue(boolean val)
    {
      this.isTrue = val;
      return this;
    }

    public Example build() {
      return new Example(this);
    }
  }

  public void tostring() {
    System.out.println(this.a + " " + this.b + " " + this.isTrue);
  }
}


public class Main {
  public static void main(String[] args) {
    Example e1 = new Example.Builder(10, 20).build();
    Example e2 = new Example.Builder(30, 40).setTrue(true).build();

    e1.tostring();
    e2.tostring();
  }
}