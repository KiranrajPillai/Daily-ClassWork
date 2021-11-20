import java.util.Scanner;

public class StarPattern7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How many stars do you need:");
        int Stars = sc.nextInt();
    for (int i = 1; i <= Stars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=Stars-1;i>0;i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*
//**
//***
//****
//*****
//****
//***
//**
//*
