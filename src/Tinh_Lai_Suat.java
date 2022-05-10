import java.util.Scanner;

public class Tinh_Lai_Suat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        double money;
        float interestRate;
        System.out.println("Nhap so thang gui:");
        month= input.nextInt();
        System.out.println("Nhap so tien da gui");
        money= input.nextDouble();
        System.out.println("Nhap lai xuat:");
        interestRate= input.nextFloat();
        float totalMoney =0;
        for(int i=0;i<month;i++){
            totalMoney += money* (interestRate/100)/12 * month;
        }
        System.out.println("So tien ban nhan dc la:"+totalMoney);
    }
}
