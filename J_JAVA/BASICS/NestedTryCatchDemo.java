

class NestedTryCatchDemo
{
    public static void main(String args[]) {
        int a[]={1,2,3};
        int b=6;
        try{
            try{
                b=a[5];
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println(ae);
            }
            b=b/0;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }
}