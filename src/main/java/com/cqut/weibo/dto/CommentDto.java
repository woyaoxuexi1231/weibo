package com.cqut.weibo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CommentDto {

    private Integer id;

    private Integer weiboId;

    private String commentText;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date commentCreateTime;

    private Integer commentUserId;

    private String commentUserAvatar;

    private String commentUserName;

}
