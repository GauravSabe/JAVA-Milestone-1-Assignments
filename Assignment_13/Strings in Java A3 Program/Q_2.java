public class Q_2 
{
    public static void main(String[] args) 
    {
        //Q.2. WAP to print Duplicates characters from the String.

           String str = "gauravsabe";
       
        // Approach-1

        char arr[] = str.toCharArray(); 
        StringBuilder str1 = new StringBuilder();
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j]) 
                {
                    str1.append(arr[i]);
                }
            }
        }
        System.out.println(str1);

        // Approach-2

            // char arr[] = str. toCharArray();
            // StringBuilder sb3 = new StringBuilder();
            // for (int i = 0; i < arr.length; i++) 
            // {
            //     boolean repated = false;
            //     for (int j= i + 1; j < arr.length; j++) 
            //     {
            //         if (arr[i] == arr[j]) 
            //         {
            //             repated = true;
            //             break;
            //         }
            //     }
            //     if(repated) 
            //     {
            //         sb3.append(arr[i]);
            //     }
            // }
            //     System.out.println(sb3);
         
        
    }
}
