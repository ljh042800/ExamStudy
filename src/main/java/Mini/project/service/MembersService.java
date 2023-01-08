package Mini.project.service;

import Mini.project.dao.MembersDAO;
import Mini.project.dto.MembersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {

@Autowired
private MembersDAO dao;

    public int insert(MembersDTO dto) {
        return dao.insert(dto);
    }
    public boolean loginCheck(String id, String pw) {
        return dao.loginCheck(id,pw);
    }
    public int deleteID(String id) {
        return dao.deleteID(id);
    }
    public MembersDTO mypage(String id) {
        return dao.mypage(id);
    }

    public int update(MembersDTO dto) {
        return dao.update(dto);
    }
}
