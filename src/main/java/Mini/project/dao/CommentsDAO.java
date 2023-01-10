package Mini.project.dao;

import Mini.project.dto.CommentsDTO;
import Mini.project.mapper.BoardMapper;
import Mini.project.mapper.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentsDAO {
    @Autowired
    CommentsMapper commentsMapper;

    public int insert(CommentsDTO dto) {
        return commentsMapper.insert(dto);
    }
}
