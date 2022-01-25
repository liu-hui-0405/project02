package com.eumn;

/**
 * @ClassName: PersonEumn
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/6/23
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/23
 * @UpdateRemark: UpdateRemark
 */
public enum  PersonEumn {

    Girl("com.lombook.test2.Girl"),

    Son("com.Son");

    private String className;

    PersonEumn(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
