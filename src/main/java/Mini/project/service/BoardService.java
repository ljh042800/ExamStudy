package Mini.project.service;

import Mini.project.dao.BoardDAO;
import Mini.project.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDAO dao;

    public int insert(BoardDTO dto) {
        return dao.insert(dto);
    }
    public List<BoardDTO> selectAll() {
        return dao.selectAll();
    }

    public BoardDTO detailBoard(int seq) {
        return dao.detailBoard(seq);
    }
    public int delete(int seq) {
        return dao.delete(seq);
    }
    public int update(int seq , String title, String contents) {
        return dao.update(seq, title ,contents);
    }


}
