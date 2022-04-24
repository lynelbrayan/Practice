import java.io.*;
class Box implements Serializable
{
    int height,width,depth;

    Box(int a,int b,int c)
    {
        height=a;
        width=b;
        depth=c;
    }
    void display()
    {
        System.out.println("height is "+height);
        System.out.println("width is "+width);
        System.out.println("depth is "+depth);
    }
}

class ObjectStreamDemo {
    public static void main(String[] args) {
        Box b=new Box(12, 10, 5);
        b.display();
        try {
            FileOutputStream f1 = new FileOutputStream("file1.txt");
            ObjectOutputStream w1 = new ObjectOutputStream(f1);
            w1.writeObject(b);
            w1.close();
            FileInputStream f2 = new FileInputStream("file1.txt");
            ObjectInputStream w2 = new ObjectInputStream(f2);
            Box n=(Box)w2.readObject();
            n.display();
            w1.close();
            w2.close();
            f1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
