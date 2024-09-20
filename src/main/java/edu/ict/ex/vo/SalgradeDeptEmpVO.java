package edu.ict.ex.vo;

import java.sql.Date;
import java.util.List;

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
public class SalgradeDeptEmpVO {

	private int grade;
	private int losal;
	private int hisal;
	
	private List<DeptEmpVO> deptList; 

}
