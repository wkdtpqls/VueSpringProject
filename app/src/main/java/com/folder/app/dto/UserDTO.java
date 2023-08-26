package com.folder.app.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserDTO {
    private int no;
    private String name;
    private String email;
    private String pwd;
    private boolean gender;
    // private boolean del;
    private LocalDateTime regDate;

}
