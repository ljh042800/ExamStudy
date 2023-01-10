package Mini.project.mapper;

import Mini.project.dto.CommentsDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentsMapper {

    int insert(CommentsDTO dto);
}
