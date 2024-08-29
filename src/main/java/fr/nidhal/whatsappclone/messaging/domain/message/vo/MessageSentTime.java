package fr.nidhal.whatsappclone.messaging.domain.message.vo;

import fr.nidhal.whatsappclone.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
