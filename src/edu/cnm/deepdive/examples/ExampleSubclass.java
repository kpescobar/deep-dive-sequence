/**
 * 
 */
package edu.cnm.deepdive.examples;

/**
 * @author Kelly Escobar
 *
 */
public class ExampleSubclass extends ExampleClass {

  static {
    System.out.println("Static initialization of ExampleSubclass");
  }
  
  {
  System.out.println("Instance initialization of ExampleSubclass object");
  }  
  
  /**
   * 
   */
  public ExampleSubclass() {
    this(ExampleClass.DEFAULT_VALUE);
    System.out.println("ExampleSubclass()");
  }

  /**
   * @param value
   */
  public ExampleSubclass(int value) {
    super(value);
    System.out.println("ExampleSubclass(int)");
  }

}
