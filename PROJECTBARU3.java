import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PROJECTBARU3 {

    public static void main(String[] args) {
        String namaDepan = "";
        String namaBelakang = "";

        // Buat objek dari InputStreamReader
        InputStreamReader ireader = new InputStreamReader(System.in);

        // Buat objek BufferedReader
        BufferedReader breader = new BufferedReader(ireader);

        try {
            System.out.print("Nama Depan: ");
            // Membaca inputan user
            namaDepan = breader.readLine();

            System.out.print("Nama Belakang: ");
            // Membaca inputan user
            namaBelakang = breader.readLine();

            // Menampilkan hasil
            System.out.println("Nama Saya adalah: " + namaDepan + " " + namaBelakang);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
        }
    }
}
