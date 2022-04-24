class Outerclass {
    int j = 5;

    void display() {
        class Innerclass {
            int i = 10;

            void display() {
                System.out.println("Data from Inner Class :");
                System.out.println(" innerclass i "+i++);
                System.out.println(" outerclass j "+j++);
            }
        }
        Innerclass c2 = new Innerclass();
        c2.display();
        System.out.println("\nData from Outer Class :");
        System.out.println(" innerclass i "+c2.i);
        System.out.println(" outerclass j "+j);
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        Outerclass c1 = new Outerclass();
        c1.display();
    }
}
