public class In_Hinh {
     static void in_hcn(){
        for (int i =0;i<=4;i++){
            for(int j=0;j<=10;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void in_tg(){
         int i,j;
         for(i=0;i<5;i++){
             for(j=0;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
    }
    static void in_tg_nguoc(){
         int i,j;
         for(i=5;i>=0;i--){
             for (j=0;j<=i;j++){
                 if(j<i){
                     System.out.print("*");
                 }
             }
             System.out.println("");
         }
    }
    static void in_tg_nguoc2(){
         int i,j;
         for(i=0;i<=5;i++){
             for(j=0;j<=5;j++){
                 if(j>=i){
                     System.out.print("*");
                 }
                 else{
                     System.out.printf(" ");
                 }
             }
             System.out.println("");
         }
    }
    public static void main(String[] args) {
        in_hcn();
        in_tg();
        in_tg_nguoc();
        in_tg_nguoc2();
    }
}
