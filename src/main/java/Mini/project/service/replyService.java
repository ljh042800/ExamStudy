package Mini.project.service;

import Mini.project.dao.replyDAO;
import Mini.project.dto.replyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class replyService {
    @Autowired
    replyDAO dao;

    public int insert(replyDTO dto) {
        return dao.insert(dto);
    }

    public List<replyDTO> selectAll(int parent_seq) {
        return dao.selectAll(parent_seq);
    }

}
