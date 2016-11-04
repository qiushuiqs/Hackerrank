import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.offer(Integer.valueOf(num));
			set.add(num);
			if (deque.size() == m) {
				int removed = deque.poll();
				if (set.size() > max) {
					max = set.size();
				} 
				if (!deque.contains(removed)) {
					set.remove(removed);
				}
			}
		}

		System.out.println(max);
	}

}
