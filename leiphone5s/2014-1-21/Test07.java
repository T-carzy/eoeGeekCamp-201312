package se2.day01;

public class Test07 {
	public enum Season_2 {
		SPRING("����"), SUMMER("����"), AUTUN("����"), WINTER("����");
		public String name;

		private Season_2(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	public static void main(String[] args) {
		Season_2 season = Season_2.SUMMER;
		System.out.println(season);
	}
}
