package fr.nidhal.whatsappclone.infrastructure.secondary.message;

import fr.nidhal.whatsappclone.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageIdWithUsers(ConversationViewedForNotification conversationViewedForNotification,
                                 List<UserPublicId> usersToNotify) {
}
