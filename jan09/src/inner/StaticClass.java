package inner;
/*
 * 정적 클래스 Static class
 * class 앞에 Static이 붙은 것이 차이점입니다.
 * Static이 붙었기 때문에 객체 생성없이 사용가능합니다.
 * 클래스의 Static변수처럼 사용됩니다.
 * 외부클래스와 내부 클래스는 다르게 동작합니다.
 * 외부 클래스와 내부 클래스의 멤버가 private라도 접근 가능
 * 경로만 지정되면 단독으로 활용할 수 있습니다.
 * 
 */

public class StaticClass {
	private int outMember = 10;
	public static int outStatic = 55;
	
	public static class Inner{
		public static void innerMethod() {
			System.out.println(outStatic);
		}
		
		public void innerMethod2() {
			System.out.println(outStatic);
		}
	}
	

	public static void main(String[] args) {
		StaticClass.Inner in = new StaticClass.Inner();

		StaticClass.Inner.innerMethod(); //static 호출할거면 앞에 staticClass 써줘야합니다.
		in.innerMethod2(); // non ststic
		//p 392 


	}

}
