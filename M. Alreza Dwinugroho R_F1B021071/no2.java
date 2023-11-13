import java.util.Scanner;
abstract class AbstractShape {
public abstract int calculateArea(int
length, int width);
}
class Rectangle extends AbstractShape {
@Override
public int calculateArea(int length, int
width) {
return length * width;
}
}
public class no2 {
public static void main(String[] args) {
Scanner scanner = new
Scanner(System.in);
System.out.println("Masukkan panjang: ");
int length = scanner.nextInt();
System.out.println("Masukkan lebar:");
int width = scanner.nextInt();
AbstractShape rectangle = new
Rectangle();
int area =
rectangle.calculateArea(length, width);
System.out.println("Luas persegipanjang: " + area);
}
}