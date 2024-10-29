import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Honor per jam dan tunjangan per pekerjaan
        final double HONOR_PER_JAM = 30000;
        double tunjangan = 0;

        // Input kode pekerjaan dan jam kerja
        System.out.println("Masukkan kode posisi karyawan dan jumlah jam kerja dalam sebulan (pisahkan dengan spasi):");
        String kodePosisi = scanner.next();
        int jamKerja = scanner.nextInt();

        // Menentukan tunjangan berdasarkan kode pekerjaan
        switch (kodePosisi) {
            case "DES":
                tunjangan = 600000;
                break;
            case "PRG":
                tunjangan = 1200000;
                break;
            case "WRT":
                tunjangan = 400000;
                break;
            case "MKT":
                tunjangan = 500000;
                break;
            default:
                System.out.println("Kode posisi tidak valid.");
                scanner.close();
                return; // Menghentikan program jika kode posisi tidak valid
        }

        // Menghitung honor dasar
        double honorDasar = jamKerja * HONOR_PER_JAM + tunjangan;

        // Menghitung bonus
        double bonus = 0;
        if (jamKerja > 175) {
            bonus = honorDasar * 0.07; // Bonus 7%
        } else if (jamKerja > 160) {
            bonus = honorDasar * 0.05; // Bonus 5%
        }

        // Total honor
        double totalHonor = honorDasar + bonus;

        // Menampilkan hasil
        System.out.printf("%.1f%n", totalHonor);

        scanner.close();
	}
}
