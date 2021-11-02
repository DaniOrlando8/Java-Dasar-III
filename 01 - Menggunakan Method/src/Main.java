/* ~ Menggunakan Method ~ 

    Method adalah bagian code dimana kita dapat menetapkan tugas tertentu. 
    Dari sini, kita akan membagi method main menjadi method yang lebih kecil. 
    Ketika file Java dijalankan, method main secara otomatis dijalankan. 
    Ketika program dibagi, method main menginstruksikan method yang terbagi untuk melaksanakan tugas masing-masing.
*/
public class Main {
    public static void main(String[] args) {
        hello();
        hello();
    }

    public static void hello() {

        System.out.println("Hello World");
    }
}

/*  
    Setelah menjalankan Main.java   
    1. Method main dipanggil
    2. Method hello dipanggil didalam method main
    3. System.out.println("Hello World") dijalankan didalam menthod hello.

    Anda dapat menganggap method sebagai kumpulan dari statement yang dikelompokkan untuk melakukan operasi tertentu. 
    kita mendefinisikan method hello, dan memanggil method hello dari method main. 
    Tidak apa-apa jika Anda belum memahami proses ini.
*/