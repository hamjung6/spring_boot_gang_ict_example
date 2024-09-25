package edu.ict.ex.vo;

import java.sql.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmpVOTest {

	@DisplayName("Emp 테스트")
	@Test
	void testEmpVO() {
		EmpVO empVO = new EmpVO();

		empVO.setEmpno(1000);
		empVO.setEname("리서치");
		empVO.setJob("스위스");
		empVO.setMgr(1);
		empVO.setHiredate(new Date(2024, 9, 11));
		empVO.setSal(3);
		empVO.setComm(4);
		empVO.setDeptno(5);

		System.out.println(empVO.getEmpno());
		System.out.println(empVO.getEname());
		System.out.println(empVO.getJob());
		System.out.println(empVO.getMgr());
		System.out.println(empVO.getHiredate());
		System.out.println(empVO.getSal());
		System.out.println(empVO.getComm());
		System.out.println(empVO.getDeptno());

	}

}
