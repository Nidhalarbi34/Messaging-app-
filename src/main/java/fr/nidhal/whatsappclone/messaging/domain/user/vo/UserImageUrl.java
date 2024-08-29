package fr.nidhal.whatsappclone.messaging.domain.user.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}
