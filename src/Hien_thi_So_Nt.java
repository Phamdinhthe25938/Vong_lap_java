public class Hien_thi_So_Nt {
    static boolean check_nt(int x){
        if(x<2){
            return false;
        }
        else{
            for (int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int dem=0;
        System.out.print("20 so nguyen to dau tien la:");
        for (int i =0;i<=1000;i++){
            if(check_nt(i)){
                System.out.print(i+" ");
                dem++;
                if(dem==20){
                    break;
                }
            }
        }
    }
}
