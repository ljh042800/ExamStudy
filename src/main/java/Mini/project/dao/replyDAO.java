package Mini.project.dao;

import Mini.project.dto.replyDTO;
import Mini.project.mapper.replyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class replyDAO {
    @Autowired
    replyMapper replyMapper;

    public int insert(replyDTO dto) {
        return replyMapper.insert(dto);
    }
    public List<replyDTO> selectAll(int parent_seq){
        return replyMapper.selectAll(parent_seq);
    }
}
