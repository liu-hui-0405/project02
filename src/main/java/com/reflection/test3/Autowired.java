package com.reflection.test3;

import java.lang.annotation.*;

/**
 * @ClassName: Autowired
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/1/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/1/13
 * @UpdateRemark: UpdateRemark
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {
}
