import java.util.Scanner;

public class Java0_0 {
    public static void main(String[] args) {
        //string 类实现HelloWord输出
//        String s1=new String("Hello");
//        String s2=new String("World");
//        String s = s1 + " " + s2; //s1.s2赋值给s
        System.out.println("Please enter the string to be operated.");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //从第几位截取字符串
        String substr = s.substring(4);
        System.out.println(substr);
        //获取长度,空格占一个长度
        int size = s.length();
        System.out.println(size);
        //字符串中字符位置,获取第一个出现的位置
        int stay = s.indexOf("l");
        System.out.println(stay);
        //
    }
}
