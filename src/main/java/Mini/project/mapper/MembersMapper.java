package Mini.project.mapper;

import Mini.project.dto.MembersDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembersMapper {

    int insert(MembersDTO dto);

    boolean loginCheck(String id, String pw);

    int deleteID(String id);

   MembersDTO mypage(String id);

   int update(MembersDTO dto);

}
