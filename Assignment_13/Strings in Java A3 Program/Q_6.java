public class Q_6 
{
    public static void main(String[] args) 
    {
        //Q.6. WAP to implement Pangram Checking with least inbuilt methods being used.

        
        String str = "THE QUICK BROWN fox JUMPS OVER LAZY dog";

        //Step - 1 ---> Remove White Spaces
        String str1 = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ' && str.charAt(i) != '\t')
            {
                str1 = str1 + str.charAt(i);
            }
        }
        //System.out.println(str1);

        //Step - 2 ---> String convert into upper case
        char ch1 ;
        StringBuilder ch2 = new StringBuilder();
        for(int i=0; i<str1.length(); i++)
        {
           ch1 = str1.charAt(i);
           if(ch1>='A' && ch1<='Z')
           {
                ch2.append(ch1);
           }
           else
           {
            ch2.append((char) (ch1 - 32));
           }
        }
        
        //Step - 3 ---> Convert String into character Array
        char arr[] = new char[ch2.length()];
        for(int i=0; i<ch2.length(); i++)
        {
            arr[i] = ch2.charAt(i); 
        }
        //System.out.println(arr);

        //Step - 4 ---> Creat empty character Array size[26]
        int arr1[] = new int[26];
        
        //Step - 5 ---> boolean data tyep for use check a condition 
        boolean flag = false;
        
        //Step - 6 ---> Main Logic for pangram
        for(int i=0; i<arr.length; i++)
        {
            arr1[arr[i]-65]++;
        }
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] == 0)
            {
                System.out.println("it's not a pangram");
                flag = true;
            }
        }
        if(flag == false)
        {
            System.out.println("it's a pangram");
        }






    }
}
