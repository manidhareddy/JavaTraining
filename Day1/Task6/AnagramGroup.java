package Day1.Task6;

import java.util.*;

public class AnagramGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of input strings: ");
        int size = sc.nextInt();//take size as input
        String[] strs = new String[size];
        System.out.println("Enter strings : ");
        for(int i = 0 ; i<size ; i++){
            strs[i] = sc.next();
        }
        System.out.println(groupAnagram(strs));

    }
    public static List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();
        //iterate through string array
        for(String str : strs){
            char[] chars = str.toCharArray();//convert string to char array
            Arrays.sort(chars);//sort the characters in ascending order
            String sortedWord = new String(chars);//convert char array to string
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(str);
        }
        resultList.addAll(map.values());
        return resultList;
    }
}
