import java.util.Scanner;

interface Stack {
    void Push();

    void Pop();

    void Display();
}

class FixedStack implements Stack {
    int top, n;
    int arr[];

    FixedStack(int max) {
        top = -1;
        n = max;
        arr = new int[n];
    }

    public void Push() {
        if (top == (n - 1)) {
            System.out.println("\t Stack Is Full");
            return;
        }
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the element : ");
        x = sc.nextInt();
        arr[++top] = x;
    }

    public void Pop() {
        if (top == -1) {
            System.out.println("\tStack is Empty");
            return;
        }
        System.out.println("Element deleted is :" + arr[top--]);
    }

    public void Display() {
        if (top == -1) {
            System.out.println("\tStack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
}

class DynamicStack implements Stack {
    int top, n;
    int arr[];

    DynamicStack(int max) {
        top = -1;
        n = max;
        arr = new int[n];
    }

    public void Push() {
        int temp[];
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the element : ");
        x = sc.nextInt();
        if (top == (n - 1)) {
            n *= 2;
            temp = new int[n];
            for (int i = 0; i <= top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            arr[++top] = x;
            return;
        }
        arr[++top] = x;
    }

    public void Pop() {
        if (top == -1) {
            System.out.println("---- Stack is Empty -------");
            return;
        }
        System.out.println("Element deleted is :" + arr[top--]);
    }

    public void Display() {
        if (top == -1) {
            System.out.println("----- Stack is Empty --------");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
}

class DynamicStackInterface {

    int StackSize() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the Stack");
        n = sc.nextInt();
        return n;
    }

    int Menu() {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print("1.PUSH");
        System.out.print("\t2.POP");
        System.out.print("\t3.DISPLAY");
        System.out.print("\t4.MAIN MENU\n");
        System.out.println("Enter Your Choice ");
        ch = sc.nextInt();
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, ch1, n, ele;
        JAVALAB14 j = new JAVALAB14();
        do {
            System.out.println("1.Fixed Stack");
            System.out.println("2.Dynamic Stack");
            System.out.println("Enter Your Choice ");
            ch = sc.nextInt();
            Stack st;
            switch (ch) {
                case 1:
                    n = j.StackSize();
                    st = new FixedStack(n);
                    do {
                        ch1 = j.Menu();
                        switch (ch1) {
                            case 1:
                                st.Push();
                                break;
                            case 2:
                                st.Pop();
                                break;
                            case 3:
                                st.Display();
                                break;
                        }
                    } while (ch1 < 4);
                    break;
                case 2:
                    n = j.StackSize();
                    st = new DynamicStack(n);
                    do {
                        ch1 = j.Menu();
                        switch (ch1) {
                            case 1:
                                st.Push();
                                break;
                            case 2:
                                st.Pop();
                                break;
                            case 3:
                                st.Display();
                                break;
                        }
                    } while (ch1 < 4);
                    break;
            }
        } while (ch < 3);
    }
}
