package firstProgram;

import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password :");
        String validPassword = "password";

        //jika password benar maka selamat datang bos
        //jika salah (else) maka error messsage

        if(password.equals(validPassword)){
            System.out.println("Selamat datang bos!!!");
        } else {
            System.out.println("password salah, coba lagi");
        }
        System.out.println("Terimakasih sudah menggunakan aplikasi kami");
    }

    private static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}

