package Mini.project.controller;

import Mini.project.dto.MembersDTO;
import Mini.project.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;

@Controller
public class HomeController {

    @Autowired
    private MembersService service;

    @Autowired
    private HttpSession session; //로그인 세션가져온다.


    @GetMapping("/signup")
    public String singup() {
        return "signup";
    }


    //회원가입
    @RequestMapping("insert")
    public String insert(MembersDTO dto) {
        service.insert(dto);
        return "index";

    }
    //로그인 체크
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(String id, String pw, Model model) {

        boolean result = service.loginCheck(id, pw);
        if(result) {
            System.out.println("로그인 성공");
            session.setAttribute("sessionID",id);   //id를 세션id로 가져온다.
            model.addAttribute("id",id); //모델로 추가해서 가져옴. 모델로 해야 가져와짐.
        }
        System.out.println(id +":" + pw);


        return "index";

    }
    //로그아웃.
    @RequestMapping("delete")
    public String delete() {

        session.invalidate();  //로그인 세션 지우기.


        return "index";
    }

    //회원탈퇴

    @RequestMapping("deleteID" )
        public String deleteID(String id) {

            service.deleteID((String)session.getAttribute("sessionID"));  //세션 id가져온다.

            session.invalidate();

             return "index";
    }
    //마이페이지 조회
    @RequestMapping("mypage")
        public String mypage(Model model) {  //꼭 매개변수를 여기다가 안받고, 밑에다가 받아도됨.

        String id = ((String)session.getAttribute("sessionID")); //아이디값을 받음.
        MembersDTO dto = service.mypage(id);  // 받은 아이디를 조회해서 dto가 다 나오게함.

        model.addAttribute("list",dto);
        return "mypage";
    }


    //수정하기.
    @RequestMapping("update")
    public String update(MembersDTO dto) {  //이미 아이디를 받아 정보를 가져와서 dto값을 다 가져와서 수정하면됨.
        service.update(dto);

        return "index";

    }



}
