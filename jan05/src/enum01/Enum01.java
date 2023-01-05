package enum01;
// Enum : 열거 타입 (쓸수있는 것을 다 작성후 , 거기서 골라) 
// 열거한 데이터만 쓸 수 있습니다.
// 같은 값은 가질 수 없습니다.
// enum은 클래스명하고 중복할 수 없습니다. (고정)
enum Week{
	MON, TUE, WED, THU, FRI, SET, SUN;
}

public class Enum01 {
//	static final String mon = "월요일"; 이거 말고 enum 이용하기.
//	static final String mon = "월요일";
//	static final String mon = "월요일";
//	static final String mon = "월요일";.... 
      public static void main(String[] args) {
    	  Week week = Week.FRI;
    	  // String se = Week.FRI; ( String x 데이터 타입자체가 다름 그냥끝)
    	
    	 var number = 10; // java 10버전에 도입된 변수 var
    	 //값으로 데이터타입을 추론합니다. 지역변수로만 가능
    	 //꼭 초기화 후 사용, null 초기화 안 됨 , 배열 사용 불가
    	 System.out.println(number);
    	 var name = "길동홍";
    	 String str = name;
    	 System.out.println(name);
	
    }

}

