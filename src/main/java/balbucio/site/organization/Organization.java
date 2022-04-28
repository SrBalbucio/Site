package balbucio.site.organization;

import org.json.JSONObject;

public class Organization {

    private String name;
    private String appPackage;
    private String url;
    private String email;
    private String chave;

    public Organization(JSONObject org){

    }

    public Organization(String name, String appPackage, String url, String email, String chave) {
        this.name = name;
        this.appPackage = appPackage;
        this.url = url;
        this.email = email;
        this.chave = chave;
    }
}
