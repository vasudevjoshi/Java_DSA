package Hashing;
import java.util.*;
public class firstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s = "mdwfxytmt";
		char []ch = s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c: ch){
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		System.out.println(map);
	}
}
