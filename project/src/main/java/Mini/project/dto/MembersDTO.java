package Mini.project.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MembersDTO {

    private String id;
    private String pw;
    private String name;
    private String phone;
    private String email;
    private String zipcode;
    private String address1;
    private String address2;
    private Timestamp signup_date;

}
