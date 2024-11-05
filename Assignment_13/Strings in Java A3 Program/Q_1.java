public class Q_1 
{

    public static void main(String[] args) 
    {
        //Q.1. WAP(Write a Program) to remove Duplicates from a String.(Take any String example with duplicates character)
        
        String str = "gaurav";
             
        
        // Approach-1

        // String result = "";
        // //str=str.toUpperCase();
        // for(int i=0; i<str.length(); i++)
        // {
        //     String ch = "" + str.charAt(i);
        //     if(result.contains(ch))
        //     {
        //         continue;
        //     }
        //     result = result + ch;
        // } 
        // System.out.println(result);        
        
        
        
        
        
        // Approach-2

        // StringBuilder sb2 = new StringBuilder();
        // for (int i = 0; i < str.length(); i++ )
        // {
        //     char ch = str. charAt(i);
        //     int idx = str.indexOf(ch, i + 1);
        //     if (idx == -1) 
        //     {
        //     sb2. append (ch) ;
        //     }
        // }
        // System.out.println(sb2);

       

        // Approach-3

            char arr[] = str. toCharArray();
            StringBuilder sb3 = new StringBuilder();
            for (int i = 0; i < arr.length; i++) 
            {
                boolean repated = false;
                for (int j= i + 1; j < arr.length; j++) 
                {
                    if (arr[i] == arr[j]) 
                    {
                        repated = true;
                        break;
                    }
                }
                if(!repated) 
                {
                    sb3.append(arr[i]);
                }
            }
                System.out.println(sb3);
         
        
    }
}