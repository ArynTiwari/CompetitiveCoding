package GFG.Stack;

//ArrayList is used internally
//O(n) is amortised
public class Intro {
    static class MyStack {
        int top;
        int arr[] = new int[1000];
        int res;

        MyStack() {
            top = -1;
        }

        void push(int a) {
            if (top == arr.length) {
                System.out.println("stack is overflow");
            } else {
                top++;
                arr[top] = a;

            }
        }

        int pop() {
            if (top == -1) {
                return -1;
            } else {
                res = arr[top];
                top--;
            }
            return res;
        }

        void print() {
            int curr = top;
            while (curr != -1) {
                System.out.println(pop());
                curr--;
            }
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.print();
    }
}
