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
public class BoardDTO {

    private int seq;
    private String writer;
    private String title;
    private String contents;
    private Timestamp write_date;
    private int view_count;



}
