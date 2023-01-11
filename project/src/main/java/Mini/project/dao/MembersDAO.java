package Mini.project.dao;

import Mini.project.dto.MembersDTO;
import Mini.project.mapper.MembersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MembersDAO {

    @Autowired
    MembersMapper membersMapper;

    public int insert(MembersDTO dto) {
        return membersMapper.insert(dto);

    }
    public boolean loginCheck(String id, String pw) {
        return membersMapper.loginCheck(id,pw);
    }

    public int deleteID(String id) {
        return membersMapper.deleteID(id);
    }
    public MembersDTO mypage(String id) {
        return membersMapper.mypage(id);
    }

    public int update(MembersDTO dto) {
        return membersMapper.update(dto);
    }

}
