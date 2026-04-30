package java_practice;

public class print_even_words_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello world java is the best";
		
		String word[] = str.split(" ");
		String each_word=" ";
		
		for(int i=0;i<word.length;i++)
		{
		  each_word = word[i];
		 // System.out.println(each_word.length());
          if(each_word.length()%2==0)
          {
        	  System.out.println(each_word);
          }
		 
		}
		
		
		
	}

}
