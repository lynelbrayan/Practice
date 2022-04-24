class Cars {
    static int count = 0;
    int ct = 0;

    Cars() 
    {
        count++;
        ct++;
    }

    static 
    {
        System.out.println("This is a Static block. Runs when first object is created");
    }

    static void CountCars() 
    {
        System.out.println("Static Count " + count);
    }

    void DisplayCount() 
    {
        System.out.println("Normal Count " + ct);
    }
}

class StaticDemo
{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Cars c = new Cars();
            Cars.CountCars();
            c.DisplayCount();
        }
    }
}








