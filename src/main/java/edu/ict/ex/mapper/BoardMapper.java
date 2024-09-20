package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;



//마이바티스용 인터페이스라는걸 알려주는 애노테이션
@Mapper
public interface BoardMapper {
	//interface는 public 유무상관없음 자동으로 넣어짐
	public List<BoardVO>getList();
	BoardVO read(int bno);
	
	int delete(int bid); //int 쓰는이유 게시판 삭제 == 삭제된 갯수 리턴
	
	//게시판 insert
	int insertBoard(@Param("board")BoardVO boardVO); //객체를 2개넘길때는 Param을 붙여야함, boardVO를 board객체로 넘기겠다는 뜻 
	//int insertBoard(@Param("board")BoardVO boardVO,@Param("emp")BoardVO boardVO); //객체를 2개넘길때는 Param을 붙여야함
	
	//게시판 업데이트
	int updateBoard(BoardVO boardVO); //객체가 1개일때는 param 적을 필요가 없음
	
	//댓글관련
	public void updateShape(BoardVO boardVO); //기존에 있던 게시글을 한칸씩 밀어냄
	public void insertReply(BoardVO boardVO);
	
	//히트수
	int upHit(BoardVO boardVO);
	
	//페이징 관련
	int getTotalCount(); //전체 게시판 갯수
	List<BoardVO> getListWithPaging(Criteria cri);
	
	
	
	
}
