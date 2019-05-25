package cn.zero4eva;

import cn.zero4eva.login.LoginServiceProxy;

public class LoginTest {
    public static void main(String[] args) {
        String name = "admin";
        String password = "admin";
        LoginServiceProxy loginServiceproxy = new LoginServiceProxy();
        boolean loginSuccess = loginServiceproxy.login(name, password);
        if (loginSuccess){
            System.out.println("login success!");
        }else{
            System.out.println("login failed!");
        }
    }
}
