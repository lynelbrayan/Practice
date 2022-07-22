public class TimeDifByAsh {


    public static void main(String[] args) {
        String t1="22:5:4";
        String t2="22:5:3";

        String tt1[]=t1.split(":");
        String tt2[]=t2.split(":");

        int h1=Integer.parseInt(tt1[0]);
        int h2=Integer.parseInt(tt2[0]);
        
        int m1=Integer.parseInt(tt1[1]);
        int m2=Integer.parseInt(tt2[1]);
        
        int s1=Integer.parseInt(tt1[2]);
        int s2=Integer.parseInt(tt2[2]);

        int h=h2-h1;
        if(h<0)
        {
            h=24+h;
        }
        int m=m2-m1;
        if(m<0)
        {
            m=60+m;
        }
        int s=s2-s1;
        if(s<0)
        {
            s=60+s;
        }
        
        System.out.println(h+":"+m+":"+s);

    }
    
}
