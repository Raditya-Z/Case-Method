import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Daftar Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); 
            
        Mahasiswa mahasiswa = new Mahasiswa();
        MataKuliah mataKuliah = new MataKuliah();
        Penilaian penilaian = new Penilaian();
        sortingNilaiAkhir sortingNilaiAkhir = new sortingNilaiAkhir();
        switch (menu) {
            case 1:
                System.out.println("DAFTAR MAHASISWA");
                mahasiswa.tampilMahasiswa();
                System.out.println();
                continue;
            case 2:
                System.out.println("DAFTAR MATA KULIAH");
                mataKuliah.tampilkanMataKuliah();
                System.out.println();
                continue;
            case 3:
                System.out.println("Data Penilaian");
                penilaian.tampilPenilaian();
                System.out.println();
                continue;
            case 4:
                System.out.println("Data Penilaian");
                sortingNilaiAkhir.sortingNA();
                sortingNilaiAkhir.tampilkanData();
                System.out.println();
                continue;
            case 5:
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String cari = input.nextLine();
                mahasiswa.PencarianDataSequential(cari);
                System.out.println();
                continue;
            case 0:
                break;
            default:
            System.out.println("Menu tidak valid. Silakan coba lagi.");
                break;
        }
        } while (menu != 0);

    }
}
