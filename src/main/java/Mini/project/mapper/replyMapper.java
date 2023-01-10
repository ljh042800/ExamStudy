package Mini.project.mapper;

import Mini.project.dto.replyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface replyMapper {

    int insert(replyDTO dto);

    List<replyDTO> selectAll(int parent_seq);

    int delete(int reply_seq);
    int update(int reply_seq, String reply_contents);
}
