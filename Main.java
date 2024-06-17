import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = input.nextInt();

        if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
                System.out.println("Girdiginiz Yil Artik Yildir!");
            }else{
                System.out.println("Girdiginiz Yil Artik Yil Degildir!");
            }
        }
    }





