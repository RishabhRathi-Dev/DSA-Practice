class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int vc = 0;
        int maximum = 0;

        while (right < s.length()){

            char cr = s.charAt(right);
            char cl = s.charAt(left);

            // Right check
            if (cr == 'a' | cr == 'e' | cr == 'i' | cr == 'o' | cr == 'u'){
                vc++;
            }

            // Moving left if window crossed

            if (right - left + 1 > k){
                if (cl == 'a' | cl == 'e' | cl == 'i' | cl == 'o' | cl == 'u'){
                    vc--;
                }

                left++;
            }

            // Right increase
            right++;

            // Answer setting
            maximum = Math.max(vc, maximum);
            
        }

        return maximum;
    }
}