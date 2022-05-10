public class BaiDoc_vong_lap_long {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.println(" ");
        for (int i=1;i<=9;i++) {
            System.out.println("%d"+i);
        }
            System.out.println("\n———————————————————————————————————————");
            for(int j=1;j<=9;j++){
                System.out.println(j+" | ");
                for(int k=1;k<=9;k++){
                    System.out.printf("%4d", j * k);
                }
                System.out.println();
            }
    }
}
