package edu.ict.ex.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.DeptVO;

@SpringBootTest
class DeptDaoTest {
	
	@Autowired //스프링이 만든 빈을 자동으로 갖고옴
	private DeptDao deptDao;
	
	@Test
	void testDeptDao() {
		DeptDao dao =new DeptDao();
		
		for(DeptVO vo:deptDao.deptSelect()) {
			System.out.println(vo);
		}
	}
	
	@Test
	void testDeptDaoRepository() {
	
		for(DeptVO vo:deptDao.deptSelect()) {
			System.out.println(vo);
		}
	}

}
