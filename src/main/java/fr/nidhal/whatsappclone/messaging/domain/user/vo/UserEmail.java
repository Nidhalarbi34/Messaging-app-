package fr.nidhal.whatsappclone.messaging.domain.user.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
