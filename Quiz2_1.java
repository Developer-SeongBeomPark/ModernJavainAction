package modernjavainaction.chap02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Quiz2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> inventory = Arrays.asList(
				new Apple(100, Color.Green),
				new Apple(50, Color.Red),
				new Apple(140, Color.Red)
				);
		
		prettyPrintApple(inventory, new AppleSimplePrint());
		System.out.println();
		prettyPrintApple(inventory, new AppleWeightPrint());
		System.out.println();
		prettyPrintApple(inventory, new AppleRedPrint());
	}
	
	
	// prettyPrintApple 메서드 구현
	public static void prettyPrintApple(List<Apple> inventory, ApplePrint p) {
		
		for (Apple apple : inventory) {
			String output = p.accept(apple);
			System.out.println(output);
		}
	}
	
	
	// predicate 인터페이스 생성
	interface ApplePrint{
		
		String accept(Apple a);
	}
	
	
	
	// implements predicate 메서드 생성
	public static class AppleSimplePrint implements ApplePrint {
		public String accept(Apple apple) {
			return "An apple weight is " + apple.getWeight() + " and color is " + apple.getColor();
		}
	}
	
	public static class AppleWeightPrint implements ApplePrint {
		
		public String accept(Apple apple) {
			String characteristic = apple.getWeight() > 100 ? "heavy" : "light";
			return "A " + characteristic + " " + apple.getColor() + " apple";
		}
	}
	
	public static class AppleRedPrint implements ApplePrint {
		
		public String accept(Apple apple) {
			String color_characteristic = apple.getColor().equals(Color.Red) ? "Red" : "Other";
			return "This apple is " + color_characteristic + " one";
		}
	}

	
	// Apple 클래스
	public static class Apple {
		
		private int weight = 0;
		private Color color;
		
		
		public Apple(int weight, Color color) {
			super();
			this.weight = weight;
			this.color = color;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		
		@Override
		public String toString() {
			return "Apple [weight=" + weight + ", color=" + color + "]";
		}
		
		
	}
	
	enum Color{
		Green, Red
	}
}


