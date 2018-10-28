package com.portfolio.myweb;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portfolio.myweb.dto.BoardDTO;
import com.portfolio.myweb.service.BoardService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Resource(name = "boardService")
	private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//Index Controller
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info("comes in? {}.", locale);
		
		return "content/main_index.do";
	}
	/**
	 *  게시판 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/boardList.do")
	public String boardList(Model model) throws Exception {

	    List<BoardDTO> list = boardService.selectBoardList();

	    logger.info(list.toString());

	    model.addAttribute("list", list);

	    return "content/boardList.do";
	}
	
	/**
	 * 게시판 등록폼
	 * @param boardDTO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/boardRegisterForm.do")
	public String boardRegisterForm(@ModelAttribute("boardDTO") BoardDTO boardDTO, Model model) throws Exception {
		
	    return "content/boardRegisterForm.do";
	}
	
	/**
	 * 글을 등록합니다.
	 * @return
	 */
	@RequestMapping(value = "/boardInsert.do")
	public String boardInsert(@ModelAttribute("boardDTO") BoardDTO boardDTO, Model model) {
		
		boardService.insertBoard(boardDTO);
		
		//redirect follows the mapping value
		return "redirect:/boardList.do";
	}
}