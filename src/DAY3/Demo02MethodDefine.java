package DAY3;
/*return：停止方法；将返回值返回给调用处
* void只能单独调用*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,50);
        /*打印调用*/
        System.out.println(sum(3,5));
        //赋值调用
        int a=sum(50,80);
        System.out.println(a);
    }

    public static int sum(int a,int b){
        a+=b;
        return a;
    }
}
