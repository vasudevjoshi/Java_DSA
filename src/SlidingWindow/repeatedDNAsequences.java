package SlidingWindow;

public class repeatedDNAsequences {
	public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        int i = 0;
        int j = 10;
        List<String> list = new ArrayList<>();
        while(i<=s.length() -10){
            String temp = s.substring(i,j);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp) + 1);
            }
            else map.put(temp,1);
            i++;
            j++;
        }
        // System.out.print(map);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > 1) list.add(entry.getKey());
        }
        return list;
    }
}
