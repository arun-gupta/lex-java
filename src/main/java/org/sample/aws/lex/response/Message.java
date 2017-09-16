package org.sample.aws.lex.response;

public class Message {
    private final String contentType;
    private final String content;

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
