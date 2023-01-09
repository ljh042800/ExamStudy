package Mini.project.dao;

import Mini.project.dto.BoardDTO;
import Mini.project.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    BoardMapper boardMapper;

    public int insert(BoardDTO dto) {
        return boardMapper.insert(dto);
    }

    public List<BoardDTO> selectAll() {
        return boardMapper.selectAll();
    }
    public BoardDTO detailBoard(int seq) {
        return boardMapper.detailBoard(seq);
    }
    public int delete(int seq) {
        return boardMapper.delete(seq);
    }
    public int update(int seq , String title, String contents) {
        return boardMapper.update(seq, title ,contents);
    }
}

