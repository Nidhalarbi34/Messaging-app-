package fr.nidhal.whatsappclone.messaging.domain.user.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
