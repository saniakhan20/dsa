class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, m = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 0)
                sum--;
            else
                sum++;
            if (map.containsKey(sum)) 
                m = Math.max(m, i - map.get(sum));
            else 
                map.put(sum, i);
        }
        return m;
    }
}