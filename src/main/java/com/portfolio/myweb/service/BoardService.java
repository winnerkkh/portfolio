package com.portfolio.myweb.service;

import java.util.List;

import com.portfolio.myweb.dto.BoardDTO;

public interface BoardService {
	List<BoardDTO> selectBoardList() throws Exception;
	void insertBoard(BoardDTO boardVO);
}
