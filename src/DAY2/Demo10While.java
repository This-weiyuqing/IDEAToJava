package DAY2;

/*while有标准格式和扩展格式
 * 标准：while（）{}
 * 扩展格式：
 * 初始化语句；
 * while（）{
 * 循环体
 * 步进语句}
 * */
public class Demo10While {

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println("嘤嘤嘤,人家错错");
        }
        int i=0;
        while(i<=100){
            System.out.println("嘤嘤嘤");
            i++;
        }
        while (i<=100){
            i++;
        }
        System.out.println(i);
    }
}
