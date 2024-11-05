public class Q_3 {
    public static void main(String[] args) {
        
        /*
         * Q.3. WAP to reverse a sentence while preserving the position
                Input: Think Twice
                Output: “kniht eciwt”
         */
        
        String str1="Think Twice";
        String str3 = str1.toLowerCase();
        StringBuilder str2= new StringBuilder();
        String sarr[]=str3.split(" ");

        for(String elem :sarr)
        {
            for(int i=elem.length()-1 ; i>=0;i--)
            {
               str2.append(elem.charAt(i));
            }
            str2.append(" ");
        }
        
        System.out.println("Before Reversing: " + str1);
        System.out.println("After Reversing: " + str2);
        
    }
}
