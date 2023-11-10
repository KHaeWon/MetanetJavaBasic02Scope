import kr.or.kosa.utils.Car;

/*
클래스 == 설계도 == 데이터 타입(사용자가 정의)
클래스 구성 요소(설계도라고 판단 근거 필요, 최소한의 무엇이)
속성 + 기능이 필요
즉,
필드 + 메서드 (생성자 함수 : member field의 초기화 -> 생성되는 객체마다)가 필요

필드(member field) >> 데이터, 자료(정보)를 담고 있다. >> [고유정보], [상태정보], [부품정보]

class 설계도 이름{
	고유정보 : 바뀌지 않는 것들
		ex) 자동차의 제조회사 = 현대, 사람의 이름, 주민번호 ... 
	상태정보 : 수시로 값이 변화되는 것들 
		ex) 자동차 설계도 -> 속도
	부품정보 : 다른 클래스! 클래스가 클래스 타입을 갖는 것
		ex) 자동차 설계도 -> 다른 클래스 -> 엔진 클래스 
		
	+
	
	기능(행위) 
		ex) run, stop
	
	+
	
	생성자 함수
}

*생성자 함수를 만드는 목적?
*멤버필드의 초기화!
*생성자는 그냥 String companyname="현대";라고 하면 되는 것 아닌가?
*그러나 자동차마다 제조사가 다를 수 있으므로 박아두는 것은 비추

class Engine{

}
class Car{
	String companyname; //고유정보 - 회사 이름
	int speed; //상태정보 - 속도
	//엔진은 더 쪼개지기 때문에 표현할 방법이 없어. 그러니까 클래스로 빼자!
	Engine e; //부품정보 - 엔진
}
 
 
 
 클래스, 필드, 생성자 함수, 메서드 : 영역(범위)이 존재함
 							-> 생성되는 장소(위치) or 접근자(한정자, 수정자)에 따라
 장소(위치) : 폴더(package)를 기반으로 이해하자. 클래스 내부인지, 함수 내부인지, 제어문 내부인지에 따라 역할이나 라이프 사이클이 달라짐. 또는 접근자에 따라.
 
 접근자 : public, private, default, protected
 
 
 */

class Emp{ //이런 또 다른 class 생성은 연습할 때나 하는 거임.
	
}
class Dept{ //컴파일러가 default class Dept라고 해석함
	int deptno; //인스턴스 변수, 멤버필드
				//컴파일러가 default int deptno라고 해석
	
	//default는 같은 패키지 내에서만 사용 가능
	public String dname;//에러는 나지 않지만 의미가 없음.
						// Dept가 default 클래스니까 public으로 놔도 다른 패키지에서 접근이 불가능해. 바보바보

	private int count; //private -> 캡슐화(은닉), count는 Dept 클래스 내부에서만 쓰겠다
	//설계자의 의도
	//-클래스 내부에서만 사용
	//-직접 할당을 막고 간접 할당을 하겠다
	
	//특수한 목적의 함수
	//이 함수는 캡슐화된 멤버필드에 대해서 값을 읽고 쓸 수 있음
	//getter(읽기 전용), setter(쓰기 전용)

	public int getCount() {
		
		return this.count; //this->Dept를 의미
	}
	
	public void setCount(int count) {
		//간접할당
		if(count<0) {
			this.count=0;
			//좌변 : Dept의 count
			//우변 : 파라미터 count
			System.out.println("this.count="+this.count);
		}else {
			this.count=count;
			System.out.println("this.count="+this.count);
		}
		
		
	}
	
}


public class Ex01_Main {

	public static void main(String[] args) {

		Dept dept = new Dept();
		dept.deptno = 10;
		dept.dname = "인사팀";
		
		dept.setCount(-1);
		dept.setCount(1);
		
		Car car = new Car();
		//Car 클래스가 public이니까 다 사용 가능
		car.setColor("red");
		car.setDoor(2);
	}

}
