package ru.anyone;

import lombok.Getter;
import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.security.URIParameter;
@Component
public class TelegramBot extends TelegramLongPollingBot {
    private final String botToken ="6223455779:AAEIwsblmeD1mJiHeM-xVLJo4t8lIJqwfZg";
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "anton3235_bot";
    }

    @Override
    public String getBotToken() {
        return this.botToken;
    }
}
