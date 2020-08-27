package org.apache.james.jspf.core;

import java.util.ArrayList;
import java.util.List;

public class DNSResult {

    private String question;
    private String dnsRecordType;
    private ArrayList<String> dnsResult;

    public DNSResult(String question, String dnsRecordType, ArrayList<String> dnsResult) {
        this.question = question;
        this.dnsRecordType = dnsRecordType.toUpperCase();
        this.dnsResult = dnsResult;
    }

    public DNSResult(String question, String dnsRecordType, String singleRecord) {
        this.question = question;
        this.dnsRecordType = dnsRecordType.toUpperCase();
        ArrayList<String> singleRecordContainer = new ArrayList<String>();
        singleRecordContainer.add(singleRecord);
        this.dnsResult = singleRecordContainer;
    }

    public String getQuestion() {
        return question;
    }

    public String getDnsRecordType() {
        return dnsRecordType;
    }

    public ArrayList<String> getDnsResult() {
        return dnsResult;
    }

    public String toString() {
        return getQuestion() + ", " + getDnsRecordType() + " record: " + getDnsResult().toString();
    }

}
