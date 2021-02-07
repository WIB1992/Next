package HomeWork;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String [] words = {"a", "b", "c", "d", "e", "f", "g", "a", "b", "c"};
        Set<String> differentWords = new HashSet<>(Arrays.asList(words));
        System.out.println(differentWords);
        System.out.println(numberOfTimes(words));
    }
    public static Map<String, Integer> numberOfTimes(String[] args){
        Map<String, Integer>numberOfTimesMap = new HashMap<>();
        for (String s: args) {
            if (!numberOfTimesMap.containsKey(s)) {
                numberOfTimesMap.put(s,1);
            } else {
                numberOfTimesMap.put(s, numberOfTimesMap.get(s) + 1);
            }
        }return numberOfTimesMap;
    }
}
