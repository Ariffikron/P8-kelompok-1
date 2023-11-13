public interface no5 {
    void tampilkanJobsheet();
}

 class jobsheet implements no5 {
    @Override
    public void tampilkanJobsheet() {
        System.out.println("Menampilkan jobsheet...");
    }

    public static void main(String[] args) {
        jobsheet implementasi = new jobsheet();
        implementasi.tampilkanJobsheet();
    }
}
