package application;
import entities.Generator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generator generator = new Generator();
        System.out.print("write your nick: ");
        generator.nickName = sc.nextLine();
        System.out.print("<<< Your password has been successfully created >>> \n\n");
        System.out.println("\t----- Choice the password -----\n");

        for(int i = 0; i < 5;i++) {
            System.out.println(generator.gerar_senha(generator.nickName));
        }
    }
}