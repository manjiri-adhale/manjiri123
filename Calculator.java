// File 1: calculator/Calculator.java
package calculator;
public class Calculator {
 public int add(int a, int b) { return a + b; }
 public int multiply(int a, int b) { return a * b; }
}
// File 2: Main.java
import calculator.Calculator;
public class Main {
 public static void main(String[] args) {
 Calculator calc = new Calculator();
 int a = 10, b = 5;
 System.out.println("Addition: " + calc.add(a, b));
 System.out.println("Multiplication: " + calc.multiply(a, b));
 }
}