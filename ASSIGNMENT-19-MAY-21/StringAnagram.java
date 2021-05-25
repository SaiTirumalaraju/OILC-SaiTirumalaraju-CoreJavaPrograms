import java.util.*;
public class StringAnagram {

	static String isAnagram(String str1, String str2) {
		String result = "";
		if(str1.length() != str2.length()) {
			result = "Given two String are not Anagram";
		}
		else {
			char arr1[]= str1.toLowerCase().toCharArray();
			char arr2[]= str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1,arr2)) {
				result = "Given two strings are Anagrams";
			}
			else {
				result = "Given two String are not Anagram";
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings ");
		
		System.out.println(isAnagram(sc.next(), sc.next()));
	}

}
