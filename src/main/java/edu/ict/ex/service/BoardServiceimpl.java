package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class BoardServiceimpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList()..");
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get()..");
		
		BoardVO board = new BoardVO();
		board.setBid(bno);
		
		boardMapper.upHit(board);
		
		return boardMapper.read(bno);
	}



	@Override
	public int remove(int bid) {
		log.info("remove()..");
		return boardMapper.delete(bid);
		
	}

	@Override
	public int writeBoard(BoardVO board) {
		log.info("writeBoard()..");
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		log.info("updateBoard()..");
		return boardMapper.updateBoard(board);
		
	}

	@Override
	public void writeReply(BoardVO board) {
		log.info("writeReply()..");
		//updateShape가 먼저와야함(비즈니스로직 = 순서있는 기능이 오는 부분=기능이 있는 로직=반드시 서비스단에서 해결)
		boardMapper.updateShape(board);
		boardMapper.insertReply(board);
	}

	@Override
	public int upHit(BoardVO board) {
		log.info("upHit()..");
		
		return boardMapper.upHit(board);
	}

	@Override
	public int getTotal() {
		log.info("getTotal..");
		
		return boardMapper.getTotalCount();
	}

	@Override
	public List<BoardVO> getListWithPaging(Criteria cri) {
		
		return boardMapper.getListWithPaging(cri);
	}


	
	
	

}
