import java.util.ArrayList;
import java.util.Scanner;

class Stack<T> {
    int top, max;
    ArrayList<T> st;

    Stack(int n) {
        this.st = new ArrayList<T>(n);
        top = -1;
        max = n;
    }

    void push(T item) {
      if(top == max - 1){
          System.out.println("Is Full");
      }else{
          top++;
          st.add(item);
      }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            T item = st.get(top);
            st.remove(top);
            top--;
            System.out.println(item + " Deleted");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(st.get(i) + "\t");
            }
        }
    }
}

class GenericClassDemo  {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>(5);
        Stack<String> s1 = new Stack<String>(5);
        Stack<Float> s2  = new Stack<Float>(5);

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Integer Stack ");
        s.display();

        s1.push("ab");
        s1.push("bc");
        s1.push("cd");
        System.out.println("\nString Stack ");
        s1.display();

        s2.push(12.3f);
        s2.push(34.5f);
        s2.push(56.7f);
        System.out.println("\nFloat Stack ");
        s2.display();
        

    }

}

