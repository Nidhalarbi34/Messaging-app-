package fr.nidhal.whatsappclone.messaging.domain.message.aggregate;

import fr.nidhal.whatsappclone.messaging.domain.message.vo.ConversationPublicId;
import fr.nidhal.whatsappclone.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}
