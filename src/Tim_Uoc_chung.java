import java.util.Scanner;

public class Tim_Uoc_chung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap 1 so a:");
        a = sc.nextInt();
        System.out.println("Nhap 1 so b:");
        b = sc.nextInt();
        a= Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b==0){
            System.out.println(a+","+b+"K co uoc chung");
        }
        while (a!=b){
            if(a>b){
                a= a-b;
            }
            else{
                b= b-a;
                System.out.println("uoc chung lon nhat la:"+b);
            }
        }
//        System.out.println("uoc chung lon nhat la:"+b);
    }
}
