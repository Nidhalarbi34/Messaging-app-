package fr.nidhal.whatsappclone.messaging.domain.message.aggregate;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
