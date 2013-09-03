package com.midtrans.bank.core.model;

/**
 * Created with IntelliJ IDEA.
 * User: shaddiqa
 * Date: 9/3/13
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankTransConfiguration {
    private Long pkBankTransConf;

    private boolean active;

    private String mti;

    private String name;

    private String processingCode;

    private Bank bank;

    private Lookup lookupOfCommandType;

    public Long getPkBankTransConf() {
        return pkBankTransConf;
    }

    public void setPkBankTransConf(Long pkBankTransConf) {
        this.pkBankTransConf = pkBankTransConf;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Lookup getLookupOfCommandType() {
        return lookupOfCommandType;
    }

    public void setLookupOfCommandType(Lookup lookupOfCommandType) {
        this.lookupOfCommandType = lookupOfCommandType;
    }
}
