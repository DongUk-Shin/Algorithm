
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int s = Integer.parseInt(br.readLine());
		int x = 0;
		
		
		for (int i = 0; i < s; i++) {
			
			int input = Integer.parseInt(br.readLine());
			
			if (input > x) {
				for (int j = x + 1; j <= input; j++) {
					stack.push(j);
					sb.append("+\n");
				}
				x = input;
				
			} else if(stack.peek() != input) {
				System.out.println("NO");
				return;		
			}
			sb.append("-\n");
			stack.pop();
			
		}
		System.out.println(sb);
	}
}