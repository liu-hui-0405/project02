package com.lombook.test2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Girl
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/6/16
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/16
 * @UpdateRemark: UpdateRemark
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//默认false
@EqualsAndHashCode(callSuper = false)
public class Girl extends Father {

    private int age;

    public Girl(Integer id, String name, int age) {
        super(id, name);
        this.age = age;
    }
}
