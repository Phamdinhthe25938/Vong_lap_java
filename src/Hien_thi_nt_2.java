public class Hien_thi_nt_2 {
    static boolean check_nt(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("20 so nguyen to dau tien la:");
        for (int i = 0; i <= 100; i++) {
            if (check_nt(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
