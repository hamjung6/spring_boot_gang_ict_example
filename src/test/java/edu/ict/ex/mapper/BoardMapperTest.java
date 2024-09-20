package edu.ict.ex.mapper;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {
   @Autowired
   private BoardMapper boardMapper;
   
   @Disabled
   @Test
   void testGetList() {
      for (BoardVO vo : boardMapper.getList()) {
         System.out.println(vo);
      }
   }
   
   @Disabled
   @Test
   void testRead() {
      System.out.println(boardMapper.read(22));
   }
   
   @Disabled
   @Test
   void testDelete() {
      int count = boardMapper.delete(23);
      
      System.out.println("삭제된 개수 : " + count);
      
      if(boardMapper.read(23) == null) {
         System.out.println("제대로 삭제되었음");
      }
   }
   
   @Disabled
   @Test
   void testWrite() {
	   BoardVO board =new BoardVO();
	   board.setBname("ㅇㅅㅇ");
	   board.setBtitle("런치");
	   board.setBcontent("런치");
	   
	   int count = boardMapper.insertBoard(board);
	   
	   System.out.println("추가된 갯수" + count);
   }

   @Disabled
   @Test
   void testUpdate() {
	   BoardVO board =new BoardVO();
	   board.setBid(62);
	   board.setBname("헤헤");
	   board.setBtitle("런치");
	   board.setBcontent("런치");
	   
	   int count = boardMapper.updateBoard(board);
	   
	   System.out.println("업데이트 갯수" + count);
      System.out.println(boardMapper.read(62));
   }
   @Test
   void getListWithPaging() {
	   Criteria criteria = new Criteria();
	   
	   criteria.setAmount(10);
	   criteria.setPageNum(3);
	   
	   List<BoardVO>list=boardMapper.getListWithPaging(criteria);
	   System.out.println(list);
	   

   }
}

