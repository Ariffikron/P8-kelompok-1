interface CetakLaporan {
void cetakA4();
void cetakA3();
}
interface TampilLaporan {
void tampilWeb();
void tampilMobile();
}
interface Laporan extends CetakLaporan, TampilLaporan {
}
class NewClass implements Laporan {
@Override
public void cetakA4() {
System.out.println("Cetak laporan menggunakan kertas A4");
}
@Override
public void cetakA3() {
System.out.println("Cetak laporan menggunakan kertas A3");
}
@Override
public void tampilWeb() {  System.out.println("Tampilkan web");
}
@Override
public void tampilMobile() {
System.out.println("Tampilkan mobile");
}
}
class LaporanTahunan extends NewClass {
public static void main(String[] args) {
LaporanTahunan laporanTahunan = new
LaporanTahunan();
laporanTahunan.cetakA4();
laporanTahunan.cetakA3();
laporanTahunan.tampilWeb();
laporanTahunan.tampilMobile();
}
}