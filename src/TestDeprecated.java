import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2015/12/22.
 */
public class TestDeprecated {
    @Deprecated
    TestDeprecated() {
        System.out.println("TestDeprecated");
    }

    @SuppressWarnings(value = {"unchecked"})
    public void myMethod() {
        List wordList = new ArrayList<>();
//        List<String> wordList = new ArrayList<String>();
        wordList.add("foo");
        System.out.println(wordList);
    }
}
