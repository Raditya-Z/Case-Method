public class sortingNilaiAkhir {
    String[] Nama = {"Ali Rahman", "Ali Rahman", "Budi Santoso", "Citra Dewi", "Citra Dewi"};
    String[] MK = {"Struktur Data", "Basis Data", "Struktur Data", "Basis Data", "Desain Web"};
    double[] nilaiAkhir = {85.5, 68.5, 75.5, 90.5, 77};

    public void sortingNA() {
        for (int i = 0; i < nilaiAkhir.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < nilaiAkhir.length; j++) {
                if (nilaiAkhir[j] > nilaiAkhir[maxIndex]) {
                    maxIndex = j;
                }
            }

            double tmpNilai = nilaiAkhir[i];
            nilaiAkhir[i] = nilaiAkhir[maxIndex];
            nilaiAkhir[maxIndex] = tmpNilai;

            String tmpNama = Nama[i];
            Nama[i] = Nama[maxIndex];
            Nama[maxIndex] = tmpNama;

            String tmpMK = MK[i];
            MK[i] = MK[maxIndex];
            MK[maxIndex] = tmpMK;
        }
    }

    public void tampilkanData() {
        for (int i = 0; i < Nama.length; i++) {
            System.out.println(Nama[i] + " | " + MK[i] + " | Nilai Akhir: " + nilaiAkhir[i]);
        }
    }
}
