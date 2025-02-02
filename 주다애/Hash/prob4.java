import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        int size = map.size();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            answer *= entry.getValue();
        }
        return (answer-1);
    }
}
