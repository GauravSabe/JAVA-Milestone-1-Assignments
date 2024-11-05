public class Q_7 
{
    public static void main(String[] args) 
    {
        //Q.7. WAP to find if String contains all unique characters.
        String str = "aabbccddeefgh";
        String unique = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch))
            {
                unique = unique + ch;
            }
        }
        System.out.println(unique);
    }
}
