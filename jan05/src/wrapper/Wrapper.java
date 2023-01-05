package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 랩퍼 클라스
// 능력 단위: (비NCS) 웹표준 기술
// 능력 단위 요소 : (비NCS) 웹표준 기술

/* 자료구조?
 * 컬렉션(자료구조) 은 참조값(레퍼런스 R타입)만 담을수 있습니다. 
 * 
 * P타입은 저장할 수 없습니다.
 * 그래서 랩퍼 클래스로 변환 후 저장합니다. 
 * 기본 자료형의 값을 컬랙션에 저장하기 위해서 사용합니다.   
 * 모든 기본 자료형에 대해 그에 대응되는 랩퍼 클라스가 있습니다.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고해서
 * 랩퍼(Wrapper, 감싸다) 클래스라고 불립니다.
 * 
 *  기본 타입                     랩퍼 클래스명
 *  Byte                             Byte
 *  short                            Short
 *  int								 Integer  ------------ full name
 *  long							 Long
 *  float                            Float
 *  double                           Double
 *  char                             Character ----------- full name
 *  boolean                          Boolean
 * 
 * 프로모션?
 */

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = new Byte((byte) 127); //취소선
		Byte b2 = 127;
		
		Integer iNum = new Integer(127);
		Integer iNum2 = 127; //오토박싱 <-> 언박싱
		
		byte bNum = iNum2.byteValue(); //Integer 안에 byteValue가 있음.  캐스팅이 아닙니다. 
		short sNum = iNum2.shortValue(); 
		long lNum = iNum2.longValue();
		float fNum = iNum2.floatValue();
		
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);//2147483647
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum);//-2147483648
		
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE); // -128
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE); // 0 ? 
		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE); // -1 ?
         
		//오토 박싱
		Integer iNum3 = 127;
		Integer iNum4 = new Integer(127);
		//형변환이 아닙니다. 기본 타입이 참조 타입으로 바뀝니다.
		if(iNum4 == iNum3) {
			System.out.println("같아요 ");
		}
		else {
			System.out.println("달라욤");
		}
		
		System.out.println( iNum3.equals(127)); //equals
		// 같으면 true , 다르면 false
		System.out.println( iNum3.compareTo(129)); //compareTo
		// 같으면 0,  앞숫자가 크면 1 , 뒤 숫자가 크면 -1 
		
		
		//오토 언박싱
		int number/*p타입*/ = iNum3; /*R타입*/
		// 값만 뽑아오자 = 언박싱 
		//iNum23이 참조하고 있는 객체안에 있는 int값이
		//객체 밖으로 나와 number에 들어갑니다.
		System.out.println(number);
		
		Object obj =10;
		System.out.println(obj);

		int result =(int)obj;
		System.out.println(result);
		
		result = (Integer) obj;
		result = ((Integer) obj).intValue();	
		
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map;
		// 컬렉션을 쓰기위해 랩퍼클래스를 넣어주어야한다. R타입만 담을수있기때문에 p타입 x
		

		    
		
		
		
	
	
	
	}

}














