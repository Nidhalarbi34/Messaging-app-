package fr.nidhal.whatsappclone.messaging.domain.message.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
