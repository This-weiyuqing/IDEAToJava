import java.util.Scanner;

public class java4_1 {
    public static void main(String args[]){
        //数据奇偶判断
//        int x = 45;
        System.out.println("请输入需要判断奇偶性的整数数字");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println(x+"为偶数");
        }
        else{
            System.out.println(x+"是奇数");
        }
    }
}