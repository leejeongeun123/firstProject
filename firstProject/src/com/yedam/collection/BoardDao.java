package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		list.add(new Board("자바공부하실분", "재밌는자바 같이 모여서 공부해요."));			
		
		
		
		return list;
	}

	// BoardDao 객체의 getBoardList() 메소드 호출하면 List<Board> 타입의 컬렉션을 리턴, ListExample 클래스 실행시켰을 때  메소드 작성
	

}
