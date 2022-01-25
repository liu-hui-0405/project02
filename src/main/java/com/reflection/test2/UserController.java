package com.reflection.test2;

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
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
