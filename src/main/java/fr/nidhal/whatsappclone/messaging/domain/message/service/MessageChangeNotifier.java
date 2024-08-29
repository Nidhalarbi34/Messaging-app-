package fr.nidhal.whatsappclone.messaging.domain.message.service;

import fr.nidhal.whatsappclone.infrastructure.secondary.message.ConversationViewedForNotification;
import fr.nidhal.whatsappclone.messaging.domain.message.aggregate.Message;
import fr.nidhal.whatsappclone.messaging.domain.message.vo.ConversationPublicId;
import fr.nidhal.whatsappclone.messaging.domain.user.vo.UserPublicId;
import fr.nidhal.whatsappclone.shared.service.State;

import java.util.List;

public interface MessageChangeNotifier {

    State<Void, String> send(Message message, List<UserPublicId> userToNotify);

    State<Void, String> delete(ConversationPublicId conversationPublicId, List<UserPublicId> userToNotify);

    State<Void, String> view(ConversationViewedForNotification conversationViewedForNotification, List<UserPublicId> usersToNotify);
}
