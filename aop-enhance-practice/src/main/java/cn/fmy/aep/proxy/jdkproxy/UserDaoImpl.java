package cn.fmy.aep.proxy.jdkproxy;

/**
 * ClassName  UserDaoImpl<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 16:36<br>
 * Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("持久层：用户保存");
    }
}
