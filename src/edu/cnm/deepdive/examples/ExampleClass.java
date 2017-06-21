/**
 * 
 */
package edu.cnm.deepdive.examples;

/**
 * @author Kelly Escobar
 *
 */
public class ExampleClass {

 
  public static final int DEFAULT_VALUE = -1;
  
  public final int value;
  public int anotherValue = getAnotherValue();
  
  static {
    System.out.println("Static Initialization block");
  }
  
  {
    value = 1;
    System.out.println("Instance initialization block");
  }
   
  public ExampleClass() {
    this(DEFAULT_VALUE);
    System.out.println("ExampleClass()");
  }
  
  public ExampleClass(int value) {
    System.out.println("ExampleClass(int)");
    //this.value = value;
  }
  
  private static int getAnotherValue() {
    System.out.println("getAnotherValue()");
    return 2;
  }
  
  
}
