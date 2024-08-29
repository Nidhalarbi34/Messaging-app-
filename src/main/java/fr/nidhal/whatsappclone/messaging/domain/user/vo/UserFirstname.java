package fr.nidhal.whatsappclone.messaging.domain.user.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
