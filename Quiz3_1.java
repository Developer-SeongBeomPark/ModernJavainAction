package modernjavainaction.chap03;

public class Quiz3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		() -> {} // public void run(){} 과 같이 파라미터가 없고 바디도 없는 메소드
		
		() -> "Raoul" //public String run() {return "Raoul";} 과 같은 람다 표현식 
		
		() -> {return "Mario";} // 위의 예제와 같은 의미의 람다 표현식
		
		(Integer i) -> return "Alan" + i; // 틀린 람다식.  (Integer i) -> {return "Alan" + i;} 가 올바른 람다식
	
		(String s) -> {"Iron Man";} // 틀린 람다식. (String s) -> {return "Iron Man";} 가 올바른 람다식
	}

}
