package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate; //=TimeStamp hiredate(더 디테일함)
	private int sal;
	private int comm;
	private int deptno;
	
	//날짜 input 입력을 위해서
	//private String hiredate2;	
	
	//private String dname; //부서이름
	//private String loc; //지역
	
}
