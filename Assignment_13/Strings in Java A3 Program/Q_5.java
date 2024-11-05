import java.util.Arrays;

public class Q_5 
{
    public static void main(String[] args) 
    {
        //Q.5. WAP to implement Anagram Checking least inbuilt methods being used.

        //Step - 0 ---> Input String
        String str = "A decimal point";
        String str1 = "Im a dot in place";
       
        //Step - 1 ---> Remove all Whitespaces from a given string
        //str
        String str2 = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ' && str.charAt(i) != '\t')
            {
                str2 = str2 + str.charAt(i);
            }
        }
        //System.out.println(str2);
        
        //str1
        String str3 = "";
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i) != ' ' && str1.charAt(i) != '\t')
            {
                str3 = str3 + str1.charAt(i);
            }
        }
        //System.out.println(str3);

        //Step - 2 ---> String convert into Upper case
        //str
        char ch1 ;
        StringBuilder ch2 = new StringBuilder();
        for(int i=0; i<str2.length(); i++)
        {
           ch1 = str2.charAt(i);
           if(ch1>='A' && ch1<='Z')
           {
                ch2.append(ch1);
           }
           else
           {
            ch2.append((char) (ch1 - 32));
           }
        }
        //System.out.println(ch2);

        //str1
        char ch3 ;
        StringBuilder ch4 = new StringBuilder();
        for(int i=0; i<str3.length(); i++)
        {
           ch3 = str3.charAt(i);
           if(ch3>='A' && ch3<='Z')
           {
                ch4.append(ch3);
           }
           else
           {
            ch4.append((char) (ch3 - 32));
           }
        }
        //System.out.println(ch4);

        //Step - 3 ---> String convert into character array
        //ch2
        char arr[] = new char[ch2.length()];
        for(int i=0; i<ch2.length(); i++)
        {
            arr[i] = ch2.charAt(i); 
        }
        //System.out.println(arr);
        
        //ch4
         char arr1[] = new char[ch4.length()];
         for(int i=0; i<ch4.length(); i++)
         {
             arr1[i] = ch4.charAt(i); 
         }
        //System.out.println(arr1);

         //Step - 4 ---> Sort the character array
         //arr
         char temp;
         for(int i=0; i<arr.length; i++)
         {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
         }
        //System.out.println(arr);
          //arr1
          char temp1;
          for(int i=0; i<arr1.length; i++)
          {
             for(int j=i+1; j<arr1.length; j++)
             {
                 if(arr1[i] > arr1[j])
                 {
                     temp1 = arr1[i];
                     arr1[i] = arr1[j];
                     arr1[j] = temp1;
                 }
 
             }
          }
        //System.out.println(arr1);

        //Step - 5 ---> Compare and check wether String are Anagram or not.
        if(Arrays.equals(arr, arr1))
        {
            System.out.println("It's an Anagram");
        }
        else 
        {
            System.out.println("Its not an Anagram");
        }

    }
}
