package org.sample.aws.lex.response;

import java.util.HashMap;
import java.util.Map;

public class DialogAction {
    private String type;
    private String fulfillmentState;
    private Message message;
    private String intentName;
    private String slotToElicit;
    private Map<String, String> slots;
    private ResponseCard responseCard;

    public static final String FULFILLMENT_STATE_FULFILLED = "Fulfilled";
    public static final String FULFILLMENT_STATE_FAILED = "Failed";

    public static final String ELICIT_INTENT_TYPE = "ElicitIntent";
    public static final String ELICIT_SLOT_TYPE = "ElicitSlot";
    public static final String CONFIRM_TYPE = "ConfirmIntent";
    public static final String DELEGATE_TYPE = "Delegate";
    public static final String CLOSE_TYPE = "Close";

    public DialogAction() { }

    public DialogAction(String type, String fulfillmentState, Message message) {
        this.type = type;
        this.fulfillmentState = fulfillmentState;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFulfillmentState() {
        return fulfillmentState;
    }

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    public String getSlotToElicit() {
        return slotToElicit;
    }

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public void addSlots(String k, String v) {
        if (slots == null) {
            slots = new HashMap<String, String>();
        }

        slots.put(k, v);
    }

    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }

    public ResponseCard getResponseCard() {
        return responseCard;
    }

    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }
}
