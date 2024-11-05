public class Q_2 
{
    public static void main(String[] args) 
    {
       /*
            Q.2. WAP to reverse a String
            Input: “PWSKILLS”
            Output: “SLLIKSPW”
        */

        String str = "PWSKILLS";
        StringBuilder sb1 = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
        {
            char ch = str.charAt(i);
            sb1.append(ch);
        }
        System.out.println(sb1);

    }
    
}