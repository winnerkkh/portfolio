package com.portfolio.myweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.myweb.dto.BoardDTO;
import com.portfolio.myweb.service.BoardService;
import com.portfolio.myweb.service.dao.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardMapper;

	@Override
	@Transactional
	public List<BoardDTO> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}

	@Override
	public void insertBoard(BoardDTO boardVO) {
		boardMapper.insertBoard(boardVO);
	}
}
