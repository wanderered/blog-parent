package com.yunyi.blog.vo.params;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
@JsonSerialize(using = ToStringSerializer.class)
public class CommentParam {

    private Long articleId;

    private String content;

    private Long parent;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long toUserId;
}
