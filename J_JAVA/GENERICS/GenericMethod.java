class Max {
    public <T extends Comparable<T>> T maximum(T x, T y, T z) {
       T max = x; 
       
       if(y.compareTo(max) > 0) {
          max = y;  
       }
       if(z.compareTo(max) > 0) {
          max = z;              
       }
       return max;   
    }
}
class GenericMethod
{
    public static void main(String args[])
    {
        Max i=new Max();
        System.out.println("Max of int "+i.maximum((Integer)10, (Integer)35,(Integer)25));
        System.out.println("Max of float "+i.maximum((float)10.4f,(float)11.4f,(float)21.8f));
    
    }
    
}