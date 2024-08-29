package fr.nidhal.whatsappclone.infrastructure.secondary.message;

import fr.nidhal.whatsappclone.messaging.domain.message.vo.ConversationPublicId;
import fr.nidhal.whatsappclone.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record ConversationIdWithUsers(ConversationPublicId conversationPublicId,
                                      List<UserPublicId> users) {
}
