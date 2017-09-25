package org.sample.aws.lex.response;

import org.sample.aws.lex.response.DialogAction;

import java.util.Map;

public class LexResponse {
    Map<String, String> sessionAttributes;
    private DialogAction dialogAction;

    public LexResponse() { }

    public LexResponse(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    public LexResponse(DialogAction dialogAction, Map<String, String> sessionAttributes) {
        this(dialogAction);
        this.sessionAttributes = sessionAttributes;
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
}
