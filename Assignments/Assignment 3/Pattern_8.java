// Pattern Printing Program 8 - Assignment 3
 
         // 	 5
		//      4 5  
		//     3 4 5
		//    2 3 4 5
		//   1 2 3 4 5
// doubt
class Pattern_8
{
	public static void main(String args[])
	{
		
          
      for (int i = 5; i >= 1; i--)
			
        {
             for (int k = 1; k < i; k++) 
            {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j+" ");
            }
              
            System.out.println();
        }
		
	}
}