public class CountChars
{

    public static void main(String[] args) {
        //String spl="0987654321";

        int cnt=0;
        String chars="abc123abc";

        for(int i=0;i<chars.length();i++)
        {
            // for(int j=0;j<spl.length();j++)
            // {
                //if(char.charAt(i)==spl.charAt(j)))
                if(Character.isDigit(chars.charAt(i)))
                {
                    cnt++;
                    continue;
                }

            //}
        }
        System.out.println(cnt);
    }
}