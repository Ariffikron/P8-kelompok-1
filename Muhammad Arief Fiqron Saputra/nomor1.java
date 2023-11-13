
package percobaan8;

import java.util.Scanner;
abstract class AbstractClass {
 public abstract void info();
}
class CustomClass extends AbstractClass {
 @Override
 public void info() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Masukkan informasi:");
 String info = scanner.nextLine();
 System.out.println("Informasi yang dimasukkan: " + info);
 }
}
public class nomor1 {
 public static void main(String[] args) {
 CustomClass customObj = new CustomClass();
 customObj.info();
 }
}