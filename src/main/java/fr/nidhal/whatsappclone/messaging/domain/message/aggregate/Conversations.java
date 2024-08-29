package fr.nidhal.whatsappclone.messaging.domain.message.aggregate;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
