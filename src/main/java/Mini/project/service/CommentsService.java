package Mini.project.service;

import Mini.project.dao.CommentsDAO;
import Mini.project.dto.CommentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {
    @Autowired
    CommentsDAO dao;

    public int insert(CommentsDTO dto) {
        return dao.insert(dto);
    }

}
