package balbucio.site.profile;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class Password {

    private String criptoPass;

    public Password(String pass, boolean isCripto){
        if(!isCripto) {
            criptoPass = BCrypt.withDefaults().hashToString(12, pass.toCharArray());
            return;
        }
        criptoPass = pass;
    }

    public String getCriptografedPassword(){
        return criptoPass;
    }

    public boolean correctPassword(String password){
        return BCrypt.verifyer().verify(password.toCharArray(), criptoPass).verified;
    }
}
