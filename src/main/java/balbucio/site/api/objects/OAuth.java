package balbucio.site.api.objects;

import balbucio.site.profile.Profile;

public class OAuth {

    private OAuth.LoginResult status;
    private String appPackage;
    private Profile loggedIn;


    public enum LoginResult{
        APROVADO, DESAPROVADO, SUSPEITO, DESATIVADO
    }
}
