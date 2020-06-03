package DAY2;

//switch如果不写break,将会继续执行下一case，知道结束或出现break为止
public class
Demo08SwitchCase {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("11");
           // break;
            case 2:
                System.out.println("22");
                break;
            case 3:
                System.out.println("33");
                break;
            default:
                System.out.println("break");
                break;
        }
    }
}
