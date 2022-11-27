import java.io.*;

class StackByArray {
	private int[] stack;
	private int top;

	public StackByArray(int stack_size) {
		stack = new int[stack_size];
		top = -1;
	}

	public boolean push(int data) {
		if (top >= stack.length) {
			System.out.println("Stack is full.");
			return false;
		} else {
			stack[++top] = data;
			return true;
		}
	}

	public int pop() {
		if (empty()) {
			return -1;
		} else {
			return stack[top--];
		}
	}

	public boolean empty() {
		if (top == -1)
			return true;
		else
			return false;
	}
}

public class main {
	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int value;
		StackByArray stack = new StackByArray(10);
		System.out.println("Input ten numbers.");
		for (int i = 0; i < 10; i++) {
			value = Integer.parseInt(buf.readLine());
			stack.push(value);
		}
		while (! stack.empty()) System.out.println("pop out" + stack.pop());
	}
}
