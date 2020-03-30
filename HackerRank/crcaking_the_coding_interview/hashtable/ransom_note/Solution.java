package hashtable.ransom_note;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        long startTime = System.currentTimeMillis();
        
//        frequency of words in magazine
        Map<String, Integer> frqWrdMgzn = findWordFrequency(magazine);
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Time elapsed: " + ((endTime - startTime)/1000));
        
        System.out.println("--------------------------------------");
        
        startTime = System.currentTimeMillis();
//        frequency of words in ransom note
        Map<String, Integer> frqWrdRnsm = findWordFrequency(ransom);
        
        endTime = System.currentTimeMillis();
        
        System.out.println("Time elapsed: " + ((endTime - startTime)/1000));
        
        
        System.out.println("---------------------------------------");
        
        startTime = System.currentTimeMillis();
        
//        compare magazine and ransom note words
        System.out.println(compareMgznAndRnsm(frqWrdMgzn, frqWrdRnsm));
        
        endTime = System.currentTimeMillis();
//        
        System.out.println("Time elapsed: " + ((endTime - startTime)/1000));
        
    }

	private static String compareMgznAndRnsm(Map<String, Integer> frqWrdMgzn, Map<String, Integer> frqWrdRnsm) {
		
		Set<String> mgznKeySet = frqWrdMgzn.keySet();
		
		Set<String> rnsmKeySet = frqWrdRnsm.keySet();
		
		if (rnsmKeySet.size() > mgznKeySet.size())
			return "No";
		else
		{
			for (String word : rnsmKeySet)
			{
				if (frqWrdMgzn.get(word) < frqWrdRnsm.get(word))
					return "No";
			}
		}
		return "Yes";
	}

	private static Map<String, Integer> findWordFrequency(String[] words) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		convert string array to set
		Set<String> set = new HashSet<>();
		
		for(String word: words)
		{
			set.add(word);
		}
		
//		count word frequency and store into map
		
		for (String word: set)
		{
			int count = 0;
			for (int i = 0; i < words.length; i++)
			{
				if (word.equals(words[i]))
				{
					count ++;
				}
			}
			
			map.put(word, count);
		}
		
		
//		System.out.println(map);
		
		return map;
	}
}

