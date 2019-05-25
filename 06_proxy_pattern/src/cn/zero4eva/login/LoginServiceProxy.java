package cn.zero4eva.login;

public class LoginServiceProxy implements ILoginService{

    LoginServiceImpl loginService;

    public LoginServiceProxy() {
        loginService = new LoginServiceImpl();
    }

    @Override
    public boolean login(String name, String password) {
        beforeService(name, password);
        boolean ret = loginService.login(name, password);
        afterService(ret);
        return ret;
    }

    public void beforeService(String name, String password) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("login info: ");
        System.out.println("    name: " + name + ", password: " + password);
    }


    public void afterService(boolean loginResult) {
        System.out.println("login result: " + loginResult);
        System.out.println("-----------------------------------------------------------------");
    }
}
