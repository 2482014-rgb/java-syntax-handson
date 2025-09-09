package Taks1;

public class NamingConvention {
    public static void main(String[] args) {
        //variabel menggunakan camelCase
        String namaLengkapMahasiswa = "Bela Sonaga";
        String nomorIndukMahasiswa = "2482014";
        double ipkSemesterLalu = 3.77;
        boolean statusAktifKuliah = true;
        String alamatRumah = "Pranap";
        int jumlahSksDiambil = 22;

        //Tampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap       :" + namaLengkapMahasiswa);
        System.out.println("NIM                :" + nomorIndukMahasiswa );
        System.out.println("IPK Semester Lalu  :" + ipkSemesterLalu);
        System.out.println("Status Aktif       :" + (statusAktifKuliah? "Aktif" : "Tidak Aktif"));
        System.out.println("Alamat Rumah       :" + alamatRumah);
        System.out.println("Jumlah Sks         :" + jumlahSksDiambil);


    }
}
