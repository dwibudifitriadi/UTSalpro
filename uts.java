import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalNilai = 0;
        boolean validasiInput = false;
        int jMahasiswa=0;
        garisStart();
        while (!validasiInput) {
            System.out.print("Masukkan jumlah mahasiswa: ");
            jMahasiswa = scan.nextInt();
            if (jMahasiswa > 0) {
                validasiInput = true;
            } else {
                System.out.println("Harap masukkan jumlah mahasiswa yang benar!");
            }
        }
        garis();
        for (int i = 1; i <= jMahasiswa; i++) {
            validasiInput = false;
            while (!validasiInput) {
                System.out.print("Masukkan nilai mahasiswa " + i + ": ");
                double nilaiMahasiswa = scan.nextDouble();
                if (nilaiMahasiswa > 100 ||nilaiMahasiswa<0) {
                    System.out.println("Nilai jangan kurang dari 0 atau lebih dari sama dengan 100.");
                } else {
                    validasiInput = true;
                    totalNilai += nilaiMahasiswa;
                }
            }
        }
        garis();
        double nilaiRataRata = totalNilai / jMahasiswa;
        System.out.println("Nilai rata-rata kelas ini adalah: " + nilaiRataRata);
        if (nilaiRataRata >= 85) {
            System.out.println("Selamat, kelas ini berprestasi!");
        }
        garisEnd();
        scan.close();
    }
    static void garisStart() {
        System.out.println("===========START===========");
    }
    static void garis() {
        System.out.println("===========================");
    }
    static void garisEnd() {
        System.out.println("============END============");
    }
}
