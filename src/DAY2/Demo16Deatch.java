package DAY2;
/*死循环：
* while（ture){循环体}*/
public class Demo16Deatch {
    public static void main(String[] args) {
        while (true){
            System.out.println("I love you");
        }
        //System.out.println("hi");//此句无法访问，因为上述循环一直执行，不能运行到这里
    }
}
