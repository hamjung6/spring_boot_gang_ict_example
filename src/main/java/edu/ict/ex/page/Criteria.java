package edu.ict.ex.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//페이징 처리를 위해선 페이지 번호와 한페이지당 몇개의 데이터를 보여줄 것인지 결정되어야만 함
@Setter
@Getter
@ToString
public class Criteria {

	private int pageNum; //페이지번호
	private int amount; //한페이지당 몇개의 데이터를 보여줄 것인가? 
	
	public Criteria() {
		this(1,10); //기본값1페이지 10개로 지정
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum=pageNum;
		this.amount=amount;
	}
}