package Mini.project.service;

import Mini.project.dao.BoardDAO;
import Mini.project.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardDAO dao;

    public int insert(BoardDTO dto) {
        return dao.insert(dto);
    }

}
