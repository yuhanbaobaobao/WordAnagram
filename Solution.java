import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> WordAnagram (List<String> dict, char[] chars) {
        if(chars.length == 0 || dict.size() == 0) {
            return new ArrayList<>();
        }

        List<String> ret = new ArrayList<>();

        //count the number of different chars;
        int[] map = countChars(chars);

        //go through each word in dictionary find anagram;
        for(String d : dict) {
            //if length not equal, skip;
            if(d.length() != chars.length) {
                continue;
            }
            char[] cur = d.toCharArray();
            int[] curMap = new int[26];
            int i = 0;
            while(i < cur.length) {
                char c = cur[i];
                if(c >= 'A' && c <= 'Z') {
                    curMap[c-'A']++;
                    if(curMap[c-'A'] > map[c-'A']) {
                        break;
                    }
                }else{
                    curMap[c-'a']++;
                    if(curMap[c-'a'] > map[c-'a']) {
                        break;
                    }
                }
                i++;

            }
            if(i == cur.length){
                ret.add(d);
            }

        }
        return ret;
    }

    public int[] countChars(char[] chars) {
        int[] map = new int[26];
        for(char c : chars) {
            if(c >= 'A' && c <= 'Z') {
                map[c-'A']++;
            }else{
                map[c-'a']++;
            }
        }
        return map;
    }

    public List<String> getUrlContents(String theUrl) throws Exception {
        List<String> content = new ArrayList<>();

        // create a url object
        URL url = new URL(theUrl);

        // create a urlconnection object
        URLConnection urlConnection = url.openConnection();

        // wrap the urlconnection in a bufferedreader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line;

        // read from the urlconnection via the bufferedreader
        while ((line = bufferedReader.readLine()) != null)
        {
            content.add(line);
        }
        bufferedReader.close();

        return content;
    }
}
