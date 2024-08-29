package fr.nidhal.whatsappclone.messaging.domain.message.vo;

public record MessageMediaContent(byte[] file,
                                  String mimetype) {
}
