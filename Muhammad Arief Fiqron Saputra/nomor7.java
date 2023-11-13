package percobaan8;

interface CetakLaporan {
    void cetakA4();
    void cetakA3();
}

interface TampilLaporan {
    void tampilWeb();
    void tampilMobile();
}

interface jos extends CetakLaporan, TampilLaporan {
    void info();
}

class NewClass implements jos {
    @Override
    public void cetakA4() {
        System.out.println("Cetak laporan A4");
    }

    @Override
    public void cetakA3() {
        System.out.println("Cetak laporan A3");
    }

    @Override
    public void tampilWeb() {
        System.out.println("Tampil di monitor");
    }

    @Override
    public void tampilMobile() {
        System.out.println("Tampil di mobile");
    }

    @Override
    public void info() {
        System.out.println("Info laporan: dua ribu");
    }
}

class LaporanTahunan extends NewClass {
    public static void main(String[] args) {
        LaporanTahunan laporanTahunan = new LaporanTahunan();
        laporanTahunan.cetakA4();
        laporanTahunan.cetakA3();
        laporanTahunan.tampilWeb();
        laporanTahunan.tampilMobile();
        laporanTahunan.info();
    }
}
