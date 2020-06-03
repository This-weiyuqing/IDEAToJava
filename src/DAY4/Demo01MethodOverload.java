package DAY4;
/*对于功能类似，参数列表不一，进行整合 是作为重载Overload
* 方法名称相同，参数列表不一*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(2,5,8));
        System.out.println(sum(4,5,8,9));
    }
    public static int sum(int a,int b){
        System.out.println("2个");
        return a+b;
    }
    /*public static double sum(int a,int b){
        System.out.println("2个");
        return a+b+0.0;
    }*/
    public static int sum(double a,int b){
        System.out.println("2个");
        return (int) (a+b);
    }
  /*  public static int sum(double s,int d){
        System.out.println("2个");
        return (int) (s+d);
    }*/
    public static int sum(int  a,double b){
        System.out.println("2个");
        return (int) (a+b);
    }
    public static int sum(double a,double b){
        System.out.println("2个D");
        return (int) (a+b);
    }
    public static int sum(int c,int a,int b){
        System.out.println("3个");
        return a+c+b;
    }
    public static int sum(int c,int d,int a,int b){
        return a+b+c+d;
    }

}
