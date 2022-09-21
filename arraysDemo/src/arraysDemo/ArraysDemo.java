package arraysDemo;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Gülnaz";
		String ogrenci3 = "Derin";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("-----------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Gulnaz";
		ogrenciler[2] = "Derin";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}

	}

}