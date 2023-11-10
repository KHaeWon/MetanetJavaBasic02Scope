package kr.or.kosa.utils;

/*
 VO(Value Object) == DTO(Data Transfer Object) == DOMAIN
 사원 1명의 데이터를 담을 수 있는 객체(클래스)
 
 Emp 홍길동 = new Emp(7788,"홍길동","it",5000); -> 사원 1명의 정보를 담을 수 있음
 
 만약에 사원이 많아진다면? 그때 쓰는 게 배열, collection
 */

public class Emp {

	//사원은 사번을 가지고 있다.
	private int empno;//0
	
	//사원은 이름을 가지고 있다.
	private String ename;//null
	
	//사원은 직종을 가지고 있다.
	private String job;
	
	//사원은 급여를 받는다.
	private int sal;

	//기본생성자
	public Emp() {}
	
	//생성자로 4개를 모두 초기화하겠다.
	//생성자 오버로딩
	public Emp(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	
	//getter, setter
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	
	//모든 클래스는 Object라는 클래스를 상속받고 있고 toString은 Object의 메소드
	//따라서 toString을 재정의한다고 표현
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
	
	
	
	
}
