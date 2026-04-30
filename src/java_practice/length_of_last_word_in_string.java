package java_practice;

public class length_of_last_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1
		String str = "Hello shyam world";
	    /*String[] word= str.split(" ");
	    
	    String s = word[word.length -1];
	    System.out.print(s.length());
	    */
	       
	    //Method 2
	    char[] c = str.toCharArray();
	    int count =0;
	    for(int i = c.length-1;i>=0;i--)
	    {
	    	if(c[i]!= ' ')
	    	{
	    		count++;
	    	}
	    	if(c[i]==' ')
	    	{
	    		break;
	    	}
	    }
	    
	    System.out.print(count);
	    
	    
	}

}
