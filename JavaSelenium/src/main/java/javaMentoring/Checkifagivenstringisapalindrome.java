package javaMentoring;

public class Checkifagivenstringisapalindrome {

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
		  
		  return number == IntStream.iterate(number, i -> i / 10)
			        .map(n -> n % 10)
			        .limit(String.valueOf(number).length())
			        .reduce(0, (a, b) -> a = a * 10 + b);
		}  
	
	
}
