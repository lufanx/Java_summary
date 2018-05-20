public class Overload {
	static class Person {
		int id, age;

		Person(int argId, int argAge) {
			id = argId;
			age = argAge;
		}

		void print() {
			System.out.println("hello");
		}

		void print(int argId) {
			System.out.println(argId);
		}

		void print(double argId) {
			System.out.println(argId);
		}
	}

	public static void main(String[] args) {
		Person p = new Person(1, 35);
		p.print();
		p.print(p.id);

		double a = 3.2;
		p.print(a);
	}
}
