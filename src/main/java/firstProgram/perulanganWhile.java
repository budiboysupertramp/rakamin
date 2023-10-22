package firstProgram;
import java.util.Scanner;
public class perulanganWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You Redady?");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter = 0;

        while(ulangi.equals(1) || ulangi.equalsIgnoreCase("yes")){
            System.out.println("perulangan ke-" + counter);
            System.out.println("apakah anda mau mengulang? (yes/no) : ");
            String jawab = scanner.nextLine();
            counter++;
            if (!jawab.equalsIgnoreCase("yes")){
                ulangi = "0";
            }

        }
    }
}
