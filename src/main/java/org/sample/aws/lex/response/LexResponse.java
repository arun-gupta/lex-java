package org.sample.aws.lex.response;

import org.sample.aws.lex.response.DialogAction;

import java.util.Map;

public class LexResponse {
    Map<String, String> sessionAttributes;
    private DialogAction dialogAction;

    public LexResponse(DialogAction dialogAction) {

        this.dialogAction = dialogAction;
    }

    public DialogAction getDialogAction() {
        return dialogAction;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public static final LexResponse getLexResponse(String speechText, String title) {
        Message message = new Message("PlainText", speechText);
        DialogAction dialogAction = new DialogAction("Close", "Fulfilled", message);
        return new LexResponse(dialogAction);
    }

}
