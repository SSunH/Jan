package jan11;

//가비지 컬렉션 garbage collection 구찌
/* 가비지 컬렉션은 가비지 컬랙터가
 * 더이상 사용하지 않는 객체를 제거하는 것.
 * 가비지 컬랙션 = 자동 메모리 관리
 * 
 * 가비지 컬랙션의 특징
 * 1. 자동 메모리 관리
 * 2. 가비지 컬랙션은 프로그래머가 구현할 수 없습니다.
 * 3. 가비지 컬랙션은 객체입니다.
 * 4. 가비지 컬랙션의 대상은 살아 있는 스레드가 더이상 참조하지 않는 객체입니다.
 * 5. 다른 참조 변수가 참조하고 있는 객체는 가비지 컬랙션의 대상이 될 수 없습니다.
 * 6. 객체에 할당된 메모리를 명시적으로 해제할 수 없어요.
 * 7. 가비지 컬랙터가 객체를 어떠한 순서로 정리하는지 알 수 없어요.
 * 8. 가비지 컬랙터가 언제 수행되는지 몰라요.
 * 9. 가비지 컬랙션은 JVM이 결정하며 우리는 단순 요청만 가능합니다.
 * 
 * 가비지 컬랙션이 되려면
 * 1. 참조변수에 null할당하기
 *    참조변수에 null을 할당하면 이 변수 이전의 값은
 *    더이상 접근 할 수 없습니다. 그래서 이 객체는
 *    가비지 컬랙션이 됩니다.
 *    
 * 2. 참조 변수에 다른 객체의 참조값을 할당하기
 *      참조 변수에 다른 객체의 참조변수를 할당하면
 *      참조변수가 가리키고 있던 객체를 더이상 접근할 수 없으므로
 *      가비지 대상이 됩니다.
 *
 * 요청하기
 *  
 * 어떤 객체가 가비지 컬랙션의 대상이 되었다고 해서 바로 
 * 가비지 컬랙션이 동작하지 않습니다.
 * 가비지 컬랙션은 JVM이 스스로 동작시키므로 강제할 수 없습니다.
 * 다만 다음과 같은 방법으로 요청만! 가능합니다.
 * 	
 * System.gc();
 * Runtime.getRuntime().gc();
 * 
 * 
 * 
 */

public class GC {
	public static void main(String[] args) {
		String str = new String("Hi");
		str = null;
		
		str = new String("Hi");
		String str2 = new String("Hi");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.contains(str2));
		
		str = str2;
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.contains(str2));
		
		
		
	}
	
	
	
	
	

}
