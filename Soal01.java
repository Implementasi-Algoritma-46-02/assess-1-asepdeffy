import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

        String id1 = scanner.next();
        String id2 = scanner.next();
        String id3 = scanner.next();
        String id4 = scanner.next();
        String id5 = scanner.next();

        // Validasi masing-masing nomor ID
        System.out.println(id1 + " " + (isValidID(id1) ? "valid" : "tidak valid"));
        System.out.println(id2 + " " + (isValidID(id2) ? "valid" : "tidak valid"));
        System.out.println(id3 + " " + (isValidID(id3) ? "valid" : "tidak valid"));
        System.out.println(id4 + " " + (isValidID(id4) ? "valid" : "tidak valid"));
        System.out.println(id5 + " " + (isValidID(id5) ? "valid" : "tidak valid"));

        scanner.close();
	}

	public static boolean isValidID(String id) {
        // Cek apakah nomor ID memiliki panjang 3 digit dan hanya berisi angka
        if (id.length() != 3 || !id.matches("\\d+")) {
            return false;
        }

        // Ambil setiap digit sebagai integer
        int digit1 = Character.getNumericValue(id.charAt(0));
        int digit2 = Character.getNumericValue(id.charAt(1));
        int digit3 = Character.getNumericValue(id.charAt(2));

        // Periksa ketentuan: digit pertama <= digit kedua <= digit ketiga dan digit ketiga ganjil
        if (digit1 <= digit2 && digit2 <= digit3 && digit3 % 2 != 0) {
            // Pastikan setiap digit berbeda
            return digit1 != digit2 && digit2 != digit3 && digit1 != digit3;
        }
        return false;
    }

}
