package com.yunyi.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data

public class UserVo {
    //@JsonSerialize(using = ToStringSerializer.class)
    private String nickname;

    private String avatar;
    //@JsonSerialize(using = ToStringSerializer.class)
    private String id;
}
