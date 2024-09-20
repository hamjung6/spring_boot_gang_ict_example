package edu.ict.ex.vo;


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
public class EmpDeptSalgradeVO {

	private EmpVO emp;
	private SalGradeVO salgrade;
	private DeptVO dept;
	
}
