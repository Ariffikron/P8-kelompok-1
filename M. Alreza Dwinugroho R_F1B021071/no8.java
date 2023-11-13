public interface TampilLaporan {
    void tampilWeb();
    void tampilMobile();
}

interface CetakLaporan {
    void cetakA4();
    void cetakA3();
}

public class no8 implements TampilLaporan, CetakLaporan {
    
    public void tampilWeb() {
        System.out.println("Tampilkan di web");
    }

    
    public void tampilMobile() {
        System.out.println("Tampilkan di mobile");
    }

    
    public void cetakA4() {
        System.out.println("Cetak laporan menggunakan kertas A4s");
    }

    
    public void cetakA3() {
        System.out.println("Cetak laporan menggunakan kertas A4");
    }

    public static void main(String[] args) {
        no8 objekA = new no8();
        System.out.println("Objek A :");
        objekA.tampilWeb();
        objekA.tampilMobile();
        objekA.cetakA3();
        objekA.cetakA4();
        System.out.println("");
        System.out.println("OBjek B : ");
        no8 objekB = new no8();
        objekB.tampilWeb();
        objekB.tampilMobile();
        objekB.cetakA3();
        objekB.cetakA4();
    }
}
