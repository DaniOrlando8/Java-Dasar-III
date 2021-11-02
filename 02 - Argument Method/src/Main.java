/* ~ Argument Method ~ 

    Argument adalah informasi tambahan yang Anda berikan ke method. 
    Jika Anda meneruskan argument saat memanggil method, nilai argument dapat digunakan di dalam method.

    Untuk meneruskan argument ke suatu method, Anda harus terlebih dahulu mendefinisikan method yang dapat menerima argument. 
    Untuk melakukannya, kita perlu menetapkan variable atau lebih tepatnya, yang lebih dikenal sebagai parameter di dalam () dari public static void methodName(). 
    Ingatlah untuk menyertakan tipe data untuk setiap parameter seperti saat mendefinisikan variable.

*/
public class Main {
    public static void main(String[] args) {
        
        hello("Bob");
        hello("Tol");
    }

    public static void hello(String name ) { // String adalah tipe data 
                                             // name adalah variabel untuk menerima argument 
                                             // string dan name adalah parameter 
        System.out.println("Hello, " + name + ".");
        
    }
}
/* 
    Untuk meneruskan argument ke suatu method, panggil method seperti ini: methodName(argument). 
    Argument yang diteruskan ke method akan diterima oleh method sebagai parameternya ditentukan dalam definisi method, dan parameter dapat digunakan sebagai variable di dalam method.
*/