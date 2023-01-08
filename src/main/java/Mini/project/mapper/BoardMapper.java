package Mini.project.mapper;

import Mini.project.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    int insert(BoardDTO dto);
}
