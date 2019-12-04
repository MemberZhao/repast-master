package com.aaa.repast.admin.framework.utils.user;

/**
 * 用户账号已被删除
 * 
 * @author teacherChen
 */
public class UserDeleteException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserDeleteException()
    {
        super("user.password.delete", null);
    }
}
