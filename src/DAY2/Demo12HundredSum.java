package DAY2;

/*求出1-100偶数和
 * 挨个数字进行检查，取适用数字（判断）*/
public class Demo12HundredSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum = sum;
            }
        }
        System.out.println(sum);


        int i = 0;
        int sum1 = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum1 += i;
            }
            i++;
        }
        System.out.println(sum1);

        int x = 1;
        int sum2 = 0;
        do {
            if (x % 2 == 0) {
                sum2 += x;
            }
            x++;
        } while (x <= 100);
        System.out.println(sum2);
    }
}
