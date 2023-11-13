public interface TampilkanData {
void tampilkanData();
}
public interface CetakData {
void cetakData();
}
public class no6 implements TampilkanData, CetakData {
@Override
public void tampilkanData() {
System.out.println("Berikut adalah data : ");
}
@Override
public void cetakData() {
System.out.println("Mencetak data : ");
}
public static void main(String[] args) {
no6 program = new no6();
program.tampilkanData();
program.cetakData();
}
}