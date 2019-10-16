import java.util.List;

public class Test {


    public static void main(String[] args) throws Exception {

        Solution s = new Solution();

        List<String> dict = s.getUrlContents("https://raw.githubusercontent.com/lad/words/master/words");

        char[] chars1 = {};
        char[] chars2 = {'a', 'a', 'B', 'B'};
        char[] chars3 = {'a', 'Z'};
        char[] chars4 = {'b', 'A', 'A', 'b'};
        char[] chars5 = {'z', 'z', 'z'};

        //test empty char set
        List<String> ret1 = s.WordAnagram(dict, chars1);
        System.out.println(ret1);
        //test normal
        List<String> ret2 = s.WordAnagram(dict, chars2);
        System.out.println(ret2);

        List<String> ret3 = s.WordAnagram(dict, chars3);
        System.out.println(ret3);

        List<String> ret4 = s.WordAnagram(dict, chars4);
        System.out.println(ret4);

        List<String> ret5 = s.WordAnagram(dict, chars5);
        System.out.println(ret5);
    }
}
