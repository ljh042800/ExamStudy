package Mini.project.controller;

import Mini.project.dto.BoardDTO;
import Mini.project.dto.replyDTO;
import Mini.project.service.BoardService;
import Mini.project.service.replyService;
import Mini.project.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Board/")
public class BoardController {

    @Autowired
    private BoardService service;
    @Autowired
    private HttpSession session;
    @Autowired
    private MembersService membersService;
    @Autowired
    private replyService replyService;


    //게시판 view로 가는곳
    @RequestMapping("BoardView")
    public String BoardView(Model model) {

        List<BoardDTO> list = service.selectAll();
        String writer = (String)session.getAttribute("sessionID");

        model.addAttribute("dto",list);
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
        return "redirect:BoardView";
    }

    @RequestMapping("detailBoard")
    public String detailBoard(int seq,Model model) {
        BoardDTO dto = service.detailBoard(seq);
        List<replyDTO> dto1 = replyService.selectAll(seq);
        model.addAttribute("list",dto);
        model.addAttribute("list1",dto1);

        return "detailView";

    }
    @RequestMapping("delete")
    public String delete(int seq) {
        service.delete(seq);
        return "redirect:BoardView";
    }

    @RequestMapping("update")
    public String update(int seq , String title ,String contents) {
        service.update(seq, title ,contents);
        System.out.println(seq);
        System.out.println(title);
        System.out.println(contents);
        return "redirect:BoardView";
    }

}
