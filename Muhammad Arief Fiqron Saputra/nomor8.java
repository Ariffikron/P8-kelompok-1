package percobaan8;
public interface nomor8 {
    void tampilWeb();
    void tampilMobile();
}

interface nomor88 {
    void cetakA4();
    void cetakA3();
}

class no8 implements TampilLaporan, CetakLaporan {
    @Override
    public void tampilWeb() {
        System.out.println("Tampil di web");
    }

    @Override
    public void tampilMobile() {
        System.out.println("Tampil di mobile");
    }

    @Override
    public void cetakA4() {
        System.out.println("Cetak laporan A4");
    }
    @Override
    public void cetakA3() {
        System.out.println("Cetak laporan A3");
    }

    public static void main(String[] args) {
        no8 objekA = new no8();
        objekA.tampilWeb();
        objekA.tampilMobile();
        objekA.cetakA3();
        objekA.cetakA4();

        no8 objekB = new no8();
        objekB.tampilWeb();
        objekB.tampilMobile();
        objekB.cetakA3();
        objekB.cetakA4();
    }
}