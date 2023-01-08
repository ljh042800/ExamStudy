package Mini.project.controller;

import Mini.project.dto.BoardDTO;
import Mini.project.dto.MembersDTO;
import Mini.project.service.BoardService;
import Mini.project.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Board/")
public class BoardController {

    @Autowired
    private BoardService service;
    @Autowired
    private HttpSession session;
    @Autowired
    private MembersService membersService;


    //게시판 view로 가는곳
    @RequestMapping("BoardView")
    public String BoardView(Model model) {

        String writer = (String)session.getAttribute("sessionID");
        model.addAttribute("sessionID",writer);

        return "BoardView";
    }
    //게시판 글쓰기 화면으로 감.
    @RequestMapping("Write")
        public String Write(Model model) {

        String writer =(String)session.getAttribute("sessionID");
        model.addAttribute("sessionID",writer);


            return "BoardWriteView";
        }


    @RequestMapping("Writer")
     public String insert(BoardDTO dto,Model model) {
        String writer = (String)session.getAttribute("sessionID");
        model.addAttribute("sessionID",writer);
        service.insert(dto);
        return "BoardView";
    }

}
