import java.util.Scanner;

abstract class AbstractLoop {
    public abstract void repeat(int count);
}

class RepeatApplication extends AbstractLoop {
    @Override
    public void repeat(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Kamu adalah yang terbaik!!");
        }
    }
}

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah perulangan:");
        int count = scanner.nextInt();
        AbstractLoop repeater = new RepeatApplication();
        repeater.repeat(count);
    }
}
