package Arrays.OG;

import java.util.HashSet;

public class longestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 10, 4, 20, 2 };
        int length = findLongestSubsequence(arr);
        System.out.println(length);
    }

    static int findLongestSubsequence(int[] arr){
        int lss =0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int k : arr) hashSet.add(k);

        for (int k : arr) {
            if (!hashSet.contains(k - 1)) {
                int j = k;
                while (hashSet.contains(j)) {
                    hashSet.remove(j);
                    j++;
                }
                if (lss < j - k)
                    lss = j - k;
            }
        }
        return lss;
    }
}
