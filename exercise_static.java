public class exercise_static {

	static class Cat {
		static int sid = 0;
		String name;
		int id;

		Cat(String name) {
			this.name = name;
			id = sid++;
		}

		public void info() {
			System.out.println("My name"+name+" No."+id);
		}
	}

	public static void main(String[] arg) {
		Cat.sid = 100;
		Cat mimi = new Cat("mimi");
		Cat pipi = new Cat("pipi");

		mimi.info();
		pipi.info();
	}
}
