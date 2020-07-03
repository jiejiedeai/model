package com.mq.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="用户信息", description="用户信息")
public class User implements Serializable {

    @ApiModelProperty(value = "主键",dataType = "Integer")
    private Integer id;

    @NotBlank(message = "发送消息不能为空")
    @ApiModelProperty(value = "姓名",dataType = "String")
    private String name;

    @NotBlank(message = "发送消息不能为空")
    @ApiModelProperty(value = "年龄",dataType = "Integer")
    private Integer age;
}
