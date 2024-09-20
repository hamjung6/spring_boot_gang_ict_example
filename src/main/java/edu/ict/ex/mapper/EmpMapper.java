package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpDeptSalgradeVO;
import edu.ict.ex.vo.EmpDeptVO;
import edu.ict.ex.vo.EmpVO;

import edu.ict.ex.vo.SalGradeVO;
import edu.ict.ex.vo.EmpSalGradeVO;
import edu.ict.ex.vo.SalgradeDeptEmpVO;



//마이바티스용 인터페이스라는걸 알려주는 애노테이션
@Mapper
public interface EmpMapper {
	
	
	

	public List<EmpVO>getList();
	
	public int insert(EmpVO empVO);
	
	public List <EmpVO>getEmpDeptList(); //조인처리 첫번째 방법
	
	public List <DeptEmpVO>getDeptEmpList(); //조인처리 두번째 방법
	
	public List <EmpDeptVO>getEmpOneDeptList(); //조인처리 일대일 처리
	
	List<SalGradeVO> getSalEmpList();
	
	List<EmpSalGradeVO> getSalEmpList2();
	
	//페이징관련
	int getTotalCount();
	List<EmpVO> getListWithPaging(Criteria cri);

	public List<SalgradeDeptEmpVO> getSalDeptEmpList();

	public List<EmpSalGradeVO> getEmpSalGradeList();
	
	//조인처리2
	List<EmpDeptSalgradeVO>getEmpDeptSalList(); 
	
	
	
}
