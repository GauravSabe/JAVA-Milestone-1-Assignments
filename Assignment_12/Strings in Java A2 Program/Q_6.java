public class Q_6
{
    public static void main(String[] args) 
    {
        //6. Write a program to check if the letter 'e' is present in the word 'Umbrella'.

        String str = "Umbrella";
        char isPresent = 'e';
        for(int i=0; i<str.length(); i++)
        {
            char str1 = str.charAt(i);
            if(isPresent == str1)
            {
                System.out.println(isPresent + " is present in  the word " + str);
            }
            else
            {
                System.out.println(isPresent + " is not present in  the word " + str);
                break;
            }
        }



    }
}
