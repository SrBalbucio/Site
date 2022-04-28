package balbucio.site.profile;

import balbucio.site.store.Signature;

import java.util.List;
import java.util.UUID;

public class Profile {

    private String nomeCompleto;
    private String nickname;
    private String email;
    private int idade;
    private String dataDeNascimento;
    private Password password;
    private UUID uniqueID;
    private List<Signature> assinaturas;
}
