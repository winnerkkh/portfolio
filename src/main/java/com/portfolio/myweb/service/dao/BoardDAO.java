package com.portfolio.myweb.service.dao;

import java.util.List;

import com.portfolio.myweb.dto.BoardDTO;

public interface BoardDAO {
	List<BoardDTO> selectBoardList() throws Exception;
	void insertBoard(BoardDTO boardDTO);
}
