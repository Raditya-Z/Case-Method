import java.util.Scanner;
public class Mahasiswa {
    String [] NIM   = {"22001", "22002", "22003"};
    String [] Nama  = {"Ali Rahman", "Budi Santoso", "Citra Dewi"};
    String [] Prodi = {"Teknik Informatika", "Teknik Informatika", "Sistem Informasi Bisnis"};

    public void tampilMahasiswa() {
        for (int i = 0; i < Nama.length; i++) {
            System.out.println("NIM : " + NIM[i] + " | Nama : " + Nama[i] + " | Prodi: " + Prodi[i]);
        }
    }

    void PencarianDataSequential(String cari) {
        for (int j = 0; j < Nama.length; j++) {
            if (NIM[j].equalsIgnoreCase(cari)) {
                System.out.println("Mahasiswa Ditemukan: NIM : " + NIM[j] + " | Nama : " + Nama[j] + " | Prodi: " + Prodi[j]);
            }        
        }
    }

}