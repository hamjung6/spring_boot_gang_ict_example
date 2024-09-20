package edu.ict.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;


@Service
public interface BoardService {
	List<BoardVO>getList();
	BoardVO get(int bno);//bno가 넘어오면 해당 번호를 select해서 BoardVO로 전달
	
	int remove(int bid);
	int writeBoard(BoardVO board);
	int updateBoard(BoardVO board);
	int upHit(BoardVO board);
	
	//댓글
	void writeReply(BoardVO board);
	
	//페이징
	//페이징처리함수
	 int getTotal();
	 List<BoardVO> getListWithPaging(Criteria cri);
	
}
