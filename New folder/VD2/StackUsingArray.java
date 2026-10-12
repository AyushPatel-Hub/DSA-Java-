import java.util.Scanner;
// Defining the Stack class
class Stack {
private int top; // Keeps track of top element index
private int[] arr; // Array to hold stack elements
private int capacity; // Maximum size of the stack
// Constructor - initializes the stack
public Stack(int size) {
arr = new int[size]; // Create an array of given size
capacity = size; // Store max capacity
top = -1; // Stack is empty at the beginning
}
// Push operation - to insert an element
public void push(int x) {
if (isFull()) { // Check if stack is full
System.out.println("Stack Overflow! Cannot push " + x);
return;
}
arr[++top] = x; // Increment top and add element
System.out.println(x + " pushed into stack.");
}
// Pop operation - to remove top element
public int pop() {
if (isEmpty()) { // Check if stack is empty
System.out.println("Stack Underflow! Cannot pop.");
return -1;
}
return arr[top--]; // Return top element and decrease top
}
// Peek operation - to view top element without removing
public int peek() {
if (!isEmpty()) {
return arr[top];
}
System.out.println("Stack is empty!");
return -1;
}
// Check if stack is empty
public boolean isEmpty() {
return top == -1;
}
// Check if stack is full
public boolean isFull() {
return top == capacity - 1;
}
// Display stack elements
public void display() {
if (isEmpty()) {
System.out.println("Stack is empty!");
return;
}
System.out.print("Stack elements: ");
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
// Main class
public class StackUsingArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter stack size: ");
int size = sc.nextInt(); // Take stack size from user
Stack stack = new Stack(size); // Create stack object
// Real-time Example: Representing Browser history pages
stack.push(101); // Visiting page ID 101
stack.push(102); // Visiting page ID 102
stack.push(103); // Visiting page ID 103
stack.display(); // Show visited pages
System.out.println("Current page (Peek): " + stack.peek());
System.out.println("Back button pressed, removing page: " + stack.pop());
stack.display(); // Show remaining history
}
}