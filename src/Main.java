
public class Main {
    public static void main(String[] args) {
        String s1  = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        String s4 = "a ma m a ";

        System.out.println(IsStringPalindrom(s1));
        System.out.println(IsStringPalindrom(s2));
        System.out.println(IsStringPalindrom(s4));
        System.out.println(IsStringPalindrom(s3));


    }

    public static boolean IsStringPalindrom (String string) {
        System.out.println( "Результат проверки, явлется ли палиндромом строка: " + string );
        String str = string.toLowerCase();
        String result_str = "";
        for (int i = 0; i< str.length(); i++ )
        {
            if (str.charAt(i)  >= 'a' && (str.charAt(i)  <= 'z' )) {
                result_str = result_str + str.charAt(i);
            }
        }
        int First_index = 0;
        int Last_index = result_str.length()-1;
        for (int i=First_index; i <= Last_index; i++)
        {
           // System.out.print("Разница индексов" + (Last_index-First_index));
            if (Last_index-First_index!=0)
            {
                if (result_str.charAt(First_index) == result_str.charAt(Last_index))
                {
                   // System.out.println( result_str.charAt(First_index) + "" + result_str.charAt(Last_index) + "Верно");
                    First_index++;
                    Last_index--;
                    if (result_str.length()%2!=0 && Last_index-First_index==0)
                        return true;
                    if (result_str.length()%2==0 && Last_index-First_index==1)
                    {
                        if (result_str.charAt(First_index) != result_str.charAt(Last_index))
                            return false;
                    }
                }
            }
        }
    return true;}
}