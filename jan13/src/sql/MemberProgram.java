package sql;
import java.util.List;
/* DAO : Data Access Object 의 약자로 데이터베이스에 접근
 * 		sql, connection, pstmt
 * 
 * DTO : Data Transfer Object
 * 			계층간 데이터 교환을 위한 자바빈즈
 * 			(java beans : 자바로 작성된 소프트웨어 컴포넌트)
 * 		값 저장을 위한 변수
 * 
 * 
 * VO : Value Object
 * 
 * 
 * 만들거
 * 		1. DBConnection     jar
 * 		1-1. 테이블 만들기
 * 		2. DTO
 * 		3. DAO
 * 
 */
import java.util.Scanner;

public class MemberProgram {
	private MemberDAO dao = new MemberDAO();
	// DAO, DTO, VO
	public void print() {
		List<MemberDTO> list = dao.list();
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│ 번호   이름   나이   이메일	  │");
		System.out.println("├─────────────────────────────────┘");
		for (MemberDTO memberDTO : list) {
			System.out.printf("│%d   %s   %d   %s\n"
					, memberDTO.getMember_no()
					, memberDTO.getMember_name()
					, memberDTO.getMember_age()
					, memberDTO.getMember_email()
					);
		}
		System.out.println("└─────────────────────────────────┘");
	}
    public void insert(Scanner sc) {
    	System.out.println("회원을 추가합니다.");
    	System.out.println("이름을 입력하세요.");
    	MemberDTO dto = new MemberDTO();
    	//string name = sc.next();
    	dto.setMember_name(sc.next());
    	System.out.println("나이를 입력하세요.");
    	dto.setMember_age(sc.nextInt());
    	System.out.println("전화번호를 입력하세요.");
    	dto.setMember_tel(sc.next());
    	System.out.println("이메일을 입력하세요.");
    	dto.setMember_email(sc.next());
    	
    	int result = dao.insert(dto);
    	System.out.println("처리결과 : " +result);
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 5;
		boolean check = true;
		MemberProgram mp = new MemberProgram();
		  
		
		System.out.println("회원관리 프로그램");

		while (check) {
			System.out.println("1.리스트  2.추가  3.수정  4.삭제  0.종료");
			System.out.print("입력 >");
			input = sc.nextInt();

			switch (input) {
			case 1:
				mp.print();
				break;
			case 2:
				mp.insert(sc);
				break;
			case 3:
				mp.update(sc);
				break;
			case 4:
				mp.delete(sc);
				break;
			case 0:
				System.out.println("종료합니다");
				check = false;
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}//sw
		}//while
		sc.close();
	}//main
	private void update(Scanner sc) {
		print();
		MemberDTO dto = new MemberDTO();
		System.out.println("수정할 번호를 입력하세요");
		System.out.println("입력 : ");
		dto.setMember_no(sc.nextInt());

		System.out.println(dto.getMember_no() + "번을 수정합니다. 맞습니까? 확실해?");
		System.out.println("맞으면 1번을, 틀리면 2번을 입력");
		System.out.println("입력 : ");
		if(sc.nextInt() == 1) {
			System.out.println("이름을 입력하세요.");
			dto.setMember_name(sc.next());
			System.out.println("나이를 입력하세요.");
			dto.setMember_age(sc.nextInt());
			System.out.println("전화번호를 입력하세요.");
			dto.setMember_tel(sc.next());
			System.out.println("email을 입력하세요.");
			dto.setMember_email(sc.next());
			
			int result = dao.update(dto);
			System.out.println("처리결과 : " + result );
		} else {
			System.out.println("수정을 멈춰!");
		}
		
	}
	private void delete(Scanner sc) {
		print();
		System.out.println("삭제할 번호를 입력하세요.");
		System.out.println("입력 : ");
		//int number = sc.nextInt();
		MemberDTO dto = new MemberDTO();
		dto.setMember_no(sc.nextInt());
		
		int result = dao.delete(dto);
		System.out.println("처리결과 : " + result);
		}
	}//class