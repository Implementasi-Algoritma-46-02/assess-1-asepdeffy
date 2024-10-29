import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input jam, menit, dan tambahan menit
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();

        // Hitung total menit
        int totalMenit = M + V;
        int totalJam = H + totalMenit / 60; // Menambahkan jam dari total menit
        totalMenit = totalMenit % 60; // Mengambil sisa menit setelah dibagi 60

        // Format jam agar selalu dua digit
        String jamFormat = String.format("%02d", totalJam % 24); // Menggunakan % 24 untuk menghindari jam lebih dari 23
        String menitFormat = String.format("%02d", totalMenit);

        // Menampilkan hasil
        System.out.println(jamFormat + ":" + menitFormat);

        scanner.close();
	}
}
