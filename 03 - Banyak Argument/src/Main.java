/* ~ Banyak Argument Method ~

    Beberapa argument dapat diteruskan ke suatu method. 
    Agar method dapat mengambil lebih dari satu argument, 
     kita dapat memisahkan argumentnya menggunakan koma (,) Ketika kita mendeklarasikan method tersebut.
    Saat memanggil method, argument harus berurutan dari kiri ke kanan seperti: argument1, argument2, …
*/
public class Main {
    public static void main(String[] args) {
        
        printData("Panjul", 23);
        printData("PALKON", 25);
    }

                             // Parameter 1| Parameter 2
    public static void printData(String name, int age) {

        System.out.println("Nama saya adalah "+name+".");
        System.out.println("Umur saya adalah "+age+".");
        
    }
    
}
