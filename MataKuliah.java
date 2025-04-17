import java.util.Scanner;
public class MataKuliah {
    Scanner input           = new Scanner(System.in);
    String [] namaMatkul    = {"Struktur Data", "Basis Data", "Desain Web"};
    String [] kodeMK        = {"MK001", "MK002", "MK003"};
    int    [] sks           = {3, 3, 3, 3, 2};

    public void tampilkanMataKuliah() {
        for (int i = 0; i < kodeMK.length; i++) {
            System.out.println("Nama Mata Kuliah : " + namaMatkul[i] + " | Kode Mata Kuliah : " + kodeMK[i] + " | SKS : " + sks[i]);
        }
    }
}   