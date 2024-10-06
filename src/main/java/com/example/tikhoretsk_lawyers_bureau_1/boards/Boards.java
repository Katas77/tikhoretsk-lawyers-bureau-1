package com.example.tikhoretsk_lawyers_bureau_1.boards;

import com.example.tikhoretsk_lawyers_bureau_1.TextsR;
import com.example.tikhoretsk_lawyers_bureau_1.database.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
@Component
@RequiredArgsConstructor
public class Boards {
    private final AppUserRepository appUserRepository;

    public SendMessage  hermitageInlineKeyboardAb(long chat_id) {
        appUserRepository.save(chat_id);
        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText("Тихорецкий филиал № 1  Краснодарской Коллегии адвокатов адвокатской  палаты Краснодарского края приветствует вас!!!");

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();

        InlineKeyboardButton button = buttonGreat("НАШ АДРЕС", "sait");
        button.setUrl("https://www.google.com/maps/place/%D1%83%D0%BB.+%D0%AD%D0%BD%D0%B3%D0%B5%D0%BB%D1%8C%D1%81%D0%B0,+174,+%D0%A2%D0%B8%D1%85%D0%BE%D1%80%D0%B5%D1%86%D0%BA,+%D0%9A%D1%80%D0%B0%D1%81%D0%BD%D0%BE%D0%B4%D0%B0%D1%80%D1%81%D0%BA%D0%B8%D0%B9+%D0%BA%D1%80%D0%B0%D0%B9,+352120/@45.8573395,40.1215312,19z/data=!4m6!3m5!1s0x40fb1fbb77b46029:0x8dfa863ee15c0b2b!8m2!3d45.857787!4d40.122075!16s%2Fg%2F11dfj0wtwq?entry=ttu&g_ep=EgoyMDI0MTAwMi4xIKXMDSoASAFQAw%3D%3D");
        InlineKeyboardButton button1 = buttonGreat("НАШИ АДВОКАТЫ", "LR");

        rowInline1.add(button);
        rowInline1.add(button1);

        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        InlineKeyboardButton button2 =buttonGreat("Адвокатская палата Краснодарского края", "saitSait");
        button2.setUrl("https://apkk.ru/");

        InlineKeyboardButton button3 = buttonGreat("Образцы заявлений", "idea");

        rowInline2.add(button2);
        rowInline2.add(button3);



        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline22 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton21 = buttonGreat(" Расчет размера оплаты труда адвоката по назначению", "Размер оплаты труда");
        InlineKeyboardButton inlineKeyboardButton22 = buttonGreat("НАША ИСТОРИЯ", "hist");


        rowInline11.add(inlineKeyboardButton21);
        rowInline22.add(inlineKeyboardButton22);
        rowsInline.add(rowInline22);
        rowsInline.add(rowInline1);
        rowsInline.add(rowInline2);

        rowsInline.add(rowInline11);

        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

        return message;

    }

    public  SendMessage defenders(long chat_id) {
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();//2
        List<InlineKeyboardButton> buttons = new ArrayList<>();
        InlineKeyboardButton button = buttonGreat("ПРОШИНА П.Г.", "pro");
        InlineKeyboardButton button1 = buttonGreat("МОРОЗОВ И.А.", "moroz");
        buttons.add(button);buttons.add(button1);
        InlineKeyboardButton button2 = buttonGreat("СТЕПАНЕНКО В.Ю.", "ст");
        InlineKeyboardButton button3 = buttonGreat("ЧУРИЛОВ А.П.", "чу");
        List<InlineKeyboardButton> buttons2 = new ArrayList<>();
        buttons2.add(button2);  buttons2.add(button3);
        InlineKeyboardButton button4 = buttonGreat("ЗАХАРЬЕВА Т.И.", "за");
        InlineKeyboardButton button5 = buttonGreat("ПАРУШЕВА Е.В.", "па");
        List<InlineKeyboardButton> buttons3 = new ArrayList<>();
         buttons3.add(button4);    buttons3.add(button5);

        InlineKeyboardButton button6 = buttonGreat("ЧМЫХ П.С.", "чм");
        InlineKeyboardButton button7 = buttonGreat("КАРНАЧЕВА А.В.", "ка");
        List<InlineKeyboardButton> buttons4 = new ArrayList<>();
        buttons4.add(button6);  buttons4.add(button7);
        InlineKeyboardButton button8 = buttonGreat("ДЕРГАЧ Д.Б.", "де");
        InlineKeyboardButton button9 = buttonGreat("КАЗАРЯН Е.М.", "каз");
        List<InlineKeyboardButton> buttons5 = new ArrayList<>();
        buttons5.add(button8);   buttons5.add(button9);
        InlineKeyboardButton button10 = buttonGreat("ШЕВЕЛЁВА И.В.", "ше");
        InlineKeyboardButton button11 = buttonGreat("Ваагн Давтян", "да");
        List<InlineKeyboardButton> buttons6 = new ArrayList<>();
        buttons6.add(button10);  buttons6.add(button11);
        InlineKeyboardButton button12 = buttonGreat("САША ЛЕВ БУРОВ", "саш");
        InlineKeyboardButton button13 = buttonGreat("СОФИЯ", "соф");

        List<InlineKeyboardButton> buttons7 = new ArrayList<>();
        buttons7.add(button12);  buttons7.add(button13);

        button12.setUrl("https://ru.wikipedia.org/wiki/%D0%9B%D0%B5%D0%B2");
        button13.setUrl("https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%83%D0%B4%D0%B5%D0%BD%D1%82");

        InlineKeyboardButton button14 = buttonGreat("ЖДАНОВ А.В.", "жд");
        InlineKeyboardButton button15 = buttonGreat("ТЮРИНА И.В.", "тю");
        List<InlineKeyboardButton> buttons8 = new ArrayList<>(); buttons8.add(button14); buttons8.add(button15);
        InlineKeyboardButton button16 = buttonGreat("КАТАСОНОВ Р.П.", "кат");
        List<InlineKeyboardButton> buttons9 = new ArrayList<>(); buttons9.add(button16);

        rowsInline.add(buttons);    rowsInline.add(buttons2);   rowsInline.add(buttons3);   rowsInline.add(buttons4);   rowsInline.add(buttons5);   rowsInline.add(buttons6);   rowsInline.add(buttons7); rowsInline.add(buttons8); rowsInline.add(buttons9);
        return messageGreat("Всегда помогут", rowsInline, chat_id);
    }

    public  SendMessage paragraphs(long chat_id) {
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();//2
        List<InlineKeyboardButton> buttons = new ArrayList<>();
        InlineKeyboardButton button1 = buttonGreat("'А'", "А");
        InlineKeyboardButton button2 = buttonGreat("'Б'", "Б");
        InlineKeyboardButton button3 = buttonGreat("'В'", "А");
        InlineKeyboardButton button4 = buttonGreat("'Г'", "Б");
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        rowsInline.add(buttons);

        return messageGreat(TextsR.textPay, rowsInline, chat_id);
    }
    public  SendMessage nextFinish(long chat_id) {
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();//2
        List<InlineKeyboardButton> buttons = new ArrayList<>();
        InlineKeyboardButton button1 = buttonGreat("НОВАЯ ДАТА", "но");
        InlineKeyboardButton button2 = buttonGreat("ЗАКОНЧИТЬ", "законч");

        buttons.add(button1);
        buttons.add(button2);

        rowsInline.add(buttons);
        appUserRepository.save(chat_id);
        return messageGreat("ВЫБЕРЕТЕ", rowsInline, chat_id);
    }



    public InlineKeyboardButton buttonGreat(String text, String backData) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(text);
        button.setCallbackData(backData);

        return button;
    }

    public SendMessage messageGreat(String text, List<List<InlineKeyboardButton>> rowsInline, long chat_id) {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline);
        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText(text);
        message.setParseMode(ParseMode.HTML);
        message.setReplyMarkup(markupInline);

        return message;
    }


}