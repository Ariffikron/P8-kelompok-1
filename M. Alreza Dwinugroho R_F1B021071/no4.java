import java.util.Scanner;
abstract class AbstractChoice {
public abstract void makeChoice(int choice);
}
class ChoiceApplication extends AbstractChoice {
@Override
public void makeChoice(int choice) {
switch (choice) {
case 1:
System.out.println("Anda memilih 1");
break;
case 2:
System.out.println("Anda memilih 2");
break;
default:
System.out.println("Pilihan tidak valid");
}
}
}
public class no4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan pilihan (1 atau 2): ");
int choice = scanner.nextInt();
AbstractChoice chooser = new ChoiceApplication();
chooser.makeChoice(choice);
}
}