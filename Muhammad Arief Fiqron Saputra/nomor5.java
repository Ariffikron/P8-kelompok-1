package percobaan8;

public interface nomor5 {
    void tampilkanLaporan();
}

class nomor55 implements nomor5 {
    @Override
    public void tampilkanLaporan() {
        System.out.println("Memberi laporan...");
    }

    public static void main(String[] args) {
        nomor55 implementasi = new nomor55();
        implementasi.tampilkanLaporan();
    }
}
