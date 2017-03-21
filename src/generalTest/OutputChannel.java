/*******************************************************************************
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved.
 *******************************************************************************/
package generalTest;

import java.util.List;

public class OutputChannel {
    private String type;
    private String outputParameters;
    private String toAddress;
    private String fromAddress;
    private String toName;
    private String fromName;
    private String replyToName;
    private String replyToAddress;
    private List<EmailSendTo> to;
    private List<EmailSendTo> cc;
    private List<EmailSendTo> bcc;

    private String templateOwner;
    private String templateCode;
    private String locale;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOutputParameters() {
        return outputParameters;
    }

    public void setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getReplyToName() {
        return replyToName;
    }

    public void setReplyToName(String replyToName) {
        this.replyToName = replyToName;
    }

    public String getReplyToAddress() {
        return replyToAddress;
    }

    public void setReplyToAddress(String replyToAddress) {
        this.replyToAddress = replyToAddress;
    }

    public List<EmailSendTo> getTo() {
        return to;
    }

    public void setTo(List<EmailSendTo> to) {
        this.to = to;
    }

    public List<EmailSendTo> getCc() {
        return cc;
    }

    public void setCc(List<EmailSendTo> cc) {
        this.cc = cc;
    }

    public List<EmailSendTo> getBcc() {
        return bcc;
    }

    public void setBcc(List<EmailSendTo> bcc) {
        this.bcc = bcc;
    }

    public String getTemplateOwner() {
        return templateOwner;
    }

    public void setTemplateOwner(String templateOwner) {
        this.templateOwner = templateOwner;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

}
