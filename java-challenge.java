class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
	System.out.println(validateCard(1234567890123456L));
	System.out.println(validateCard(1234567890123452L));
  } 

  public static int biggerSum(char[] arr) {
	  int currentSum = 0;
	  for(int i = 0; i < arr.length; i++) {
		  currentSum += arr[i];
	  }
	  return currentSum;
  }

  public static boolean validateCard(long num) {
	  int numLength = String.valueOf(num).length();
	  if(numLength > 19 || numLength < 14) {
		return false;  
	  }

	  int checkDigit = Integer.parseInt(String.valueOf(num).substring(String.valueOf(num).length() - 1));
	  StringBuilder reversed = new StringBuilder(String.valueOf(num).substring(0, String.valueOf(num).length() - 1)).reverse();
	  int sum = 0;
	  for(int i = 0; i < reversed.length(); i++) {
		  if(i % 2 == 0) {
			  int currentNum = Character.getNumericValue(reversed.charAt(i));
			  if((currentNum * 2) >= 10) {
				  char[] nums = String.valueOf(currentNum * 2).toCharArray();
				  int currentSum = biggerSum(nums);
				  sum += currentSum;
			  } else {
				  sum += currentNum;  
			  }
		  }
	  }
	  int lastNum = Integer.parseInt(String.valueOf(sum).substring(String.valueOf(sum).length() - 1));
	  if(10 - lastNum == checkDigit) {
		  return true;
	  } else {
		  return false;
	  }
  }
}