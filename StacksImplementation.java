public class StacksImplementation {

        // store elements of stack
        int elements[];
        // represent top of stack
        int top;
        // total capacity of the stack
        int capacity;

        // Creating a stack
        StacksImplementation(int size) {
            // initialize the array
            // initialize the stack variables
            elements = new int[size];
            capacity = size;
            top = -1;
        }

        // push elements to the top of stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack overspill!");

                System.exit(1);
            }

            // insert element on top of stack
            System.out.println("Inserting " + x);
            elements[++top] = x;
        }

        // pop elements from top of stack
        public int pop() {

            // if stack is empty
            // no element to remove
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                System.exit(1);
            }

            // remove element from top of stack
            return elements[top--];
        }

    // check if the stack is empty
        public Boolean isEmpty(){
            return top == -1;
        }

        // check if the stack is full
        public Boolean isFull() {
            return top == capacity - 1;
        }

        // display elements of stack
        public void displayStack() {
            for (int i = 0; i <= top; i++) {
                System.out.print(elements[i] + ", ");
            }
        }

        public static void main(String[] args)
        {

            StacksImplementation stack = new StacksImplementation(10);

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(8);
            stack.push(7);
            stack.push(5);

            System.out.print("Stack: ");
            stack.displayStack();

            // eradicate last element inserted from stack
            stack.pop();
            System.out.println("\nlast element stacked after popping");
            stack.displayStack();
            System.out.print("\n");

            stack.pop();
            System.out.println("\ncurrent element on top after popping");
            stack.displayStack();
            System.out.print("\n");
        }

    }

