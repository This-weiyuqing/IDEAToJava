package DAY2;

public class Demo17LppoHandMIN {
    public static void main(String[] args) {
        int sums=0;
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int s = 0; s < 60; s++) {
                    sums++;
                    System.out.println(hour+"hour"+minute+"minnte"+s+"s"+"   "+sums+"sum to s");
                }

            }
//            System.out.println(hour+"hour");
        }
    }
}
