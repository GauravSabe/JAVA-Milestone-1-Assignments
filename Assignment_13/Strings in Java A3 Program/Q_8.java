public class Q_8 
{
    public static void main(String[] args) 
    {
        //Q.8. WAP to find the maximum occurring character in a String.

        String str = "GAURAv@2004 && KANCHu@2004";
        str = str.toLowerCase();
        int c=0 , v=0 , num=0 , space=0 , special=0;
        char ch;

        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            else if(ch>='0' && ch<='9')
            {
                num++;
            }
            else if(ch==' ')
            {
                space++;
            }
            else
            {
                special++;
            }
        }

        if(v > c &&  v > num && v > space && v > special)
        {
                System.out.println("Max Number of Vowels present in the given string is : " + v);
        }
        else if(c > v && c > num && c > space && c > special)
        {
                System.out.println("Max Number of Consonants present in the given string is : " + c);           
        }
        else if(num > space && num > c && num > v && num > special)
        {
                System.out.println("Max Numbers present in the given string is : " + num);           
        }
        else if(space > num && space > c && space > v && space > special)
        {
                System.out.println("Max Number of Spaces present in the given string is : " + space);
        }
        else
        {
            System.out.println("Max Number of Special Characters present in the given string is : " + special);
        }
    }
}
