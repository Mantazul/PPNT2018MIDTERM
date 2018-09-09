package string.problems;

import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static  void DuplicateWords(String str){
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] arr = str.split(" ");

        for (String x: arr) {
            if (map.get(x) != null){
                map.put(x,map.get(x)+1);
            }else {
                map.put(x,1);
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWords(st);

    }

}
