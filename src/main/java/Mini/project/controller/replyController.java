package Mini.project.controller;

import Mini.project.dto.replyDTO;
import Mini.project.service.replyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Comments/")
public class replyController {
    @Autowired
    private replyService service;
    @Autowired
    private HttpSession session;

    @RequestMapping("insert")
    public String insert(replyDTO dto, Model model , int seq) {
        model.addAttribute(session.getAttribute("sessionID").toString());
        dto.setReply_writer(session.getAttribute("sessionID").toString());
        dto.setReply_parent_seq(seq);
        service.insert(dto);

        return "redirect:/Board/detailBoard?seq="+dto.getReply_parent_seq();
    }
    @RequestMapping("delete")
    public String delete(int reply_seq,int seq) {
        replyDTO dto = new replyDTO();
        dto.setReply_parent_seq(seq);
        service.delete(reply_seq);
        return "redirect:/Board/detailBoard?seq="+dto.getReply_parent_seq();
    }

}
