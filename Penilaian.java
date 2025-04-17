public class Penilaian {
    String[] Nama = {"Ali Rahman", "Ali Rahman", "Budi Santoso", "Citra Dewi", "Citra Dewi"};
    String[] MK = {"Struktur Data", "Basis Data", "Struktur Data", "Basis Data", "Desain Web"};
    double[] nilaiTugas = {80, 60, 75, 85, 80};
    double[] nilaiUTS = {85, 75, 70, 90, 90};
    double[] nilaiUAS = {90, 70, 80, 95, 65};
    double [] nilaiAkhir = new double[5];

    public Penilaian() {
        for (int i = 0; i < nilaiAkhir.length; i++) {
            nilaiAkhir[i] = (nilaiTugas[i] * 0.30) + (nilaiUTS[i] * 0.30) + (nilaiUAS[i] * 0.40);
        }
    }

    void tampilPenilaian() {
        for (int i = 0; i < Nama.length; i++) {
            System.out.println(Nama[i] + " | " + MK[i] + " | Nilai Akhir: " + nilaiAkhir[i]);
        }
    }

}