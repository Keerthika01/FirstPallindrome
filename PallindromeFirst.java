public class PallindromeFirst {
	    public static void main(String[] args) {
	        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
	        PallindromeFirst first=new PallindromeFirst();
	        String firstPalindrome = first.findFirstPalindrome(words);

	        if (firstPalindrome != null) {
	            System.out.println("The first palindrome string in the list is: " + firstPalindrome);
	        } else {
	            System.out.println("No palindrome string found in the list.");
	        }
	    }

	    public  String findFirstPalindrome(String[] words) {
	        for (String word : words) {
	            if (isPalindrome(word)) 
	            {
	                return word;
	            }
	        }
	        return null;
	    }

	    public boolean isPalindrome(String word) {
		    int left = 0;
		    int right = word.length() - 1;
		
		    while (left < right) {
		        if (word.charAt(left) != word.charAt(right)) {
		            return false;
		        }
		        left++;
		        right--;
    }

    return true;
}
}