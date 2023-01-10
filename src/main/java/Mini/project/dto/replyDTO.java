package Mini.project.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class replyDTO {

    private int reply_seq;
    private String reply_writer;
    private String reply_contents;
    private Timestamp reply_write_date;
    private int reply_parent_seq;


}
