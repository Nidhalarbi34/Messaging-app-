package fr.nidhal.whatsappclone.infrastructure.secondary.message;

import fr.nidhal.whatsappclone.messaging.domain.message.aggregate.Message;
import fr.nidhal.whatsappclone.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageWithUsers(Message message, List<UserPublicId> userToNotify) {
}
