package com.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangshichang
 * @date 2020/6/5 10:04 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user")
public class User {

    @TableId
    @ApiModelProperty(value = "id", example = "1")
    private Long id;
    @ApiModelProperty(value = "姓名", example = "王五")
    private String name;
    @ApiModelProperty(value = "年龄", example = "22")
    private Integer age;
    @ApiModelProperty(value = "性别", example = "女")
    private String sex;

}
