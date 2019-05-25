package cn.zero4eva.login;

public class LoginServiceImpl implements ILoginService {
    @Override
    public boolean login(String name, String password) {
        return "admin".equals(name) && "admin".equals(password);
    }
}
