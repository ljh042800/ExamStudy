package Mini.project.mapper;

import Mini.project.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    int insert(BoardDTO dto);
    List<BoardDTO> selectAll();

    BoardDTO detailBoard(int seq);

}
