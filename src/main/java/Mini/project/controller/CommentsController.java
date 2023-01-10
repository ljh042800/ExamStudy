package Mini.project.controller;

import Mini.project.dto.BoardDTO;
import Mini.project.dto.CommentsDTO;
import Mini.project.service.BoardService;
import Mini.project.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Comments/")
public class CommentsController {
    @Autowired
    private CommentsService service;
    @Autowired
    private HttpSession session;

    @RequestMapping("insert")
    public String insert(CommentsDTO dto,int seq) {

        dto.setParent_seq(seq);
        service.insert(dto);

        return "redirect:/Board/detailBoard?seq="+dto.getParent_seq();
    }

}
