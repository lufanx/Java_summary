public class Recursion {

	public static int recursion(int count) {
		if (count == 1) {
			return 1;
		} else {
			return count * recursion(count - 1);
		}
	}


	/**
	 * Use recursion realize Fab.
	 */
	public static int fab(int count) {
		if (count < 0) {
			System.out.println("invalid args");
			return -1;
		} else if (count ==1 || count ==2) {
			return 1;
		} else {
			return fab(count - 1) + fab(count - 2);
		}
	}

	public static int fabCount(int count) {
		if (count < 0) {
			System.out.println("invalid args");
			return -1;
		} else if (count == 1 || count ==2) {
			return 1;
		} else {
			int f1 = 1;
			int f2 = 1;
			int f = 0;
			
			for (int i = 0; i < count-2; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;	
			}
			return f;
		}
	}

	public static void main(String[] args) {
		System.out.println(recursion(5));
		System.out.println(fab(5));
		System.out.println(fabCount(5));
	}

}
