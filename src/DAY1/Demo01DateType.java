package DAY1;

/*
 * 自动类型转换和强制类型转换的区别：
 * 自动：
 *   1.代码不需要特殊写，直接赋值
 *   2.数据范围中小到大
 * 强制：
 *   1.代码要经过处理，否则会报错
 *   2.byte，short，char都可以发生数学运算，但是会先被转换为int型
 *   3.boolean不能进行数据类型转换
 * 缺点：
 *   1.会引起精度损失
 * */
public class Demo01DateType {
    public static void main(String[] args) {
        System.out.println(1024);  //默认int
        System.out.println(3.14);  //默认double
        //自动类型转换
        long num1 = 100;//不加后缀默认为int
        System.out.println(num1);
        double num2 = 2.5F;
        System.out.println(num2);
        float num3 = 30L;
        System.out.println(num3);
        //强制类型转换
        //long to int
        int num4 = (int) 6000000000L;//强制转化为int
        System.out.println(num4);//1705032704  数据溢出
        //double-->int
        int num5 = (int) 3.5;//精度损失
        System.out.println(num5);//舍弃小数位
        char a1 = 'A';
        System.out.println(a1 + 1);//char进行数学运行算时会按照ASCⅡ码转换为数字
        byte num6 = 40;
        byte num7 = 50;
//        byte num8=num7+num6;//会先转换为int+int，最后是int
        int num8 = num7 + num6;
        System.out.println(num8);
        short num9 = 60;
        //先用int计算然后强制转换为short2
        //但是要注意数据范围不能超出
        short result1 = (short) (num6 + num9);
        System.out.println(result1);
    }
}
