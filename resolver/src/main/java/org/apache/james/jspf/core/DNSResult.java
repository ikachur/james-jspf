package org.apache.james.jspf.core;

public class DNSResult {

    private String domain;
    private String dnsRecordType;
    private String dnsResult;

    public DNSResult(String domain, String dnsRecordType, String dnsResult) {
        this.domain = domain;
        this.dnsRecordType = dnsRecordType.toUpperCase();
        this.dnsResult = dnsResult;
    }

    public String getDomain() {
        return domain;
    }

    public String getDnsRecordType() {
        return dnsRecordType;
    }

    public String getDnsResult() {
        return dnsResult;
    }

    public String toString() {
        return getDomain() + ", " + getDnsRecordType() + ": '" + getDnsResult() + "'";
    }

}