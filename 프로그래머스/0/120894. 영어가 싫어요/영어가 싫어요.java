class Solution {
    public long solution(String numbers) {
        String[] numWords = {
            "zero","one","two","three","four",
            "five","six","seven","eight","nine"
        };
        
        for(int i=0; i<numWords.length; i++){
            numbers = numbers.replace(numWords[i],Integer.toString(i));
        }
        
        long answer = Long.parseLong(numbers);
        return answer;
    }
}