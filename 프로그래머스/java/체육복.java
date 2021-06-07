package 프로그래머스.java;

public class 체육복 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer= n;
            int[] people = new int[n];
            for(int l : lost)
                people[l-1]--;
            for(int r : reserve)
                people[r-1]++;
            for(int i =0; i < people.length; i++) {
                if(people[i] == -1) {
                    if(i-1 >=0 && people[i-1] == 1){
                        people[i]++;
                        people[i-1]--;
                    }else if(i+1 < people.length && people[i+1]==1) {
                        people[i]++;
                        people[i+1]--;
                    }else{
                        answer--;
                    }
                }
            }
            return answer;
        }
    }
}
