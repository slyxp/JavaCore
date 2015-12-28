/**
 * Created by user on 2015/12/20.
 */
public class ForEach {
    public static void main (String[] args) {
        new TestDeprecated();
        int[] a = {1, 2, 3, 4, 5, 6};
        for(int element : a) {
            System.out.println(element);
        }
        TestDeprecated testDeprecated = new TestDeprecated();
        testDeprecated.myMethod();
    }
}
