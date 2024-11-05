public class Q_3 
{
    public static void main(String[] args) 
    {
        //Q.3. WAP to check if “2552” is palindrome or not.

        String str = "2552";
        // char arr[] = str.toCharArray();
        String str1 = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            str1 = str1 + str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println(str + " : is a palindrome");
        }
        else
        {
            System.out.println(str + " : is not a palindrome");
        }
        
    }
}
