class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        final Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        final List<String> answer = new ArrayList<>();
        for (final String word : words) {
            final int length = word.length();
            final boolean[] dp = new boolean[length + 1];
            dp[0] = true;
            for (int i = 1; i <= length; ++i) {
                for (int j = (i == length ? 1 : 0); !dp[i] && j < i; ++j) {
                    dp[i] = dp[j] && dictionary.contains(word.substring(j, i)); 
                }
            }
            if (dp[length]) {
                answer.add(word);
            }
        }
        return answer;   
    }
}
/*list of sting for ans
set of string
store all
s=new hashset<>(Arrays.asList(words));
add all words in s
for word in words
remove from set
then send to form
if true add else no add
add back to set


for all chars in w
left right substring
s contains or s right or forms
true
*/