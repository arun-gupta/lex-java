package org.sample.aws.lex.response;

public class Message {
    private final String contentType;
    private final String content;

    public static final String CONTENT_TYPE_PLAIN_TEXT = "PlainText";
    public static final String CONTENT_TYPE_SSML = "SSML";

    public Message(String contentType, String content) {
        this.contentType = contentType;
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContent() {
        return content;
    }
}
