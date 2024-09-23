package edu.ict.ex.vo.join;

import java.sql.Date;

import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.SalGradeVO;
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
public class EmpSalGradeVO {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	//1대1
	private SalGradeVO salgrade; 
	
	private DeptVO dept;
}
