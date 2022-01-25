package com.reflection.test3;

/**
 * @ClassName: UserController
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/1/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/1/13
 * @UpdateRemark: UpdateRemark
 */
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    public UserService getUserService() {
        return userService;
    }

}
