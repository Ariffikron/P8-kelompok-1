package percobaan8;

interface TampilkanData {
    void tampilkanData();
}

interface CetakData {
    void cetakData();
}

class Program implements TampilkanData, CetakData {
    @Override
    public void tampilkanData() {
        System.out.println("Berikut adalah datanya...");
    }

    @Override
    public void cetakData() {
        System.out.println("Josss");
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.tampilkanData();
        program.cetakData();
    }
}
