package com.local.web.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardMapper")
public interface BoardMapper {
	//게시물 전체 조회
	List<HashMap<String, Object>> selectAllBoard();
	//내 게시글 조회
	List<HashMap<String, Object>> selectMyBoard(int uIdx);
	//게시물 작성
	int createItem(HashMap<String, String> hashmapParam);
	//게시물 수정
	int updateItem(HashMap<String, String> hashmapParam);
}