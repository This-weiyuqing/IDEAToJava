public class java4_3 {
    public static void main(String[] args) {
        //while calculates the sum of factorials from 1 to 1/20
        double sum = 0, a = 1;
        //Define sum to save the result of the last step and use it for output, and define a to save the factorial data to be used in the next step after each step.
            int i = 1;
            //Definition i is used to represent the number of operation layers
            while (i <= 20) {
                sum = sum + a;
                i++;
                a = a * (1.0 / i);
            }
            System.out.println(sum);
        }
    }
