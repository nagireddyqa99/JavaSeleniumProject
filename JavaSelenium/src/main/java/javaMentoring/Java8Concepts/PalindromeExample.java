package javaMentoring.Java8Concepts;

public class PalindromeExample {

	public static void main(String[] args) {
	
		 int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		  int number = 234;
		  
		  
		}  

	
		public static boolean ispalindrome(int number) {
			 return number == IntStream.iterator(number, i -> i / 10)
			        .map(n -> n % 10)
			        .limit(String.valueOf(number).length())
			        .reduce(0, (a, b) -> a = a * 10 + b);
			
		}
}
