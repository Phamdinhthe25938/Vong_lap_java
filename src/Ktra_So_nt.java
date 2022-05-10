import java.util.Scanner;
public class Ktra_So_nt {
    public static boolean ktnt(int x){
        if(x<2){
            return false;
        }
        else {
            for (int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
           int a;
        System.out.println("nhap so a:");
        a= sc.nextInt();
        if(ktnt(a)){
            System.out.println(a+"la so nguyen to");
        }
        else{
            System.out.println(a+"khong phai la so nguyen to");
        }
    }
}
