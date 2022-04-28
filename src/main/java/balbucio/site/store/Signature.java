package balbucio.site.store;

import balbucio.site.profile.Profile;

import java.util.UUID;

public interface Signature {

    String getName();
    String[] getDescription();
    String getPackage();
    Integer getDuration();
    boolean isGift();
    Profile getGiftOwner();
    UUID getUniqueSignatureID();
}
