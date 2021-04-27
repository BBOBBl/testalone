package test.my.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/boardlist")
	public ModelAndView getAllEmp() {
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> boardlist = service.getAllEmp();
		mv.addObject("boardlist",boardlist);
		mv.setViewName("/board/list");
		return mv;
	}
	
	@RequestMapping("/boarddetail")
	public ModelAndView getDetailEmp() {
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> boardlist = service.getDetailEmp();
		mv.addObject("boarddetail",boardlist);
		mv.setViewName("/board/detail");
		return mv;
	}
	
	
	
	
}
