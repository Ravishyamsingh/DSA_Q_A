

import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], result.get(result.size() - 1))) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
