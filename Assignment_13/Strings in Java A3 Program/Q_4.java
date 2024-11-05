public class Q_4 
{
    public static void main(String[] args) 
    {
        //Q.4. WAP to count the number of consonants, vowels, special characters , numbers & spaces in a String.
        
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

        System.out.println("Number of Consonants present in the given string is : " + c);
        System.out.println("Number of Vowels present in the given string is : " + v);
        System.out.println("Numbers present in the given string is : " + num);
        System.out.println("Number of Spaces present in the given string is : " + space);
        System.out.println("Number of Special Characters present in the given string is : " + special);
       

    }
}
