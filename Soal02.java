import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input baris pertama untuk masa studi dan IPK
        double masaStudi = scanner.nextDouble();
        double ipk = scanner.nextDouble();

        // Input baris kedua untuk nilai EPRT, status HKI, dan status lomba internasional
        int eprt = scanner.nextInt();
        String hki = scanner.next();
        String lomba = scanner.next();

        // Syarat kelulusan cumlaude
        boolean tepatWaktu = masaStudi == 3.0;
        boolean ipkMemenuhi = ipk > 3.5;
        boolean eprtMemenuhi = eprt >= 450;
        boolean hkiMemenuhi = hki.equalsIgnoreCase("ada");
        boolean lombaMemenuhi = lomba.equalsIgnoreCase("ada");

        // Mengecek status cumlaude
        if (tepatWaktu && ipkMemenuhi && eprtMemenuhi && (hkiMemenuhi || lombaMemenuhi)) {
            System.out.println("Cumlaude");
        } else {
            System.out.println("Tidak Cumlaude");
        }

        scanner.close();
	}
}
