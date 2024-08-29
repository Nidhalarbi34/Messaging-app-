package fr.nidhal.whatsappclone.messaging.domain.user.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record UserLastName(String value) {

    public UserLastName {
        Assert.field(value, value).maxLength(255);
    }
}
