/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

/**
 *
 * @author Mwendwa Mugambi
 */
//meter value getter and setter methods
public class meter_values {
    int meternum;
    String metername;
    String metertype;
    int elecusage;
    String status;
    int credit;
    int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
    public int getMeternum() {
        return meternum;
    }

    public void setMeternum(int meternum) {
        this.meternum = meternum;
    }

    public String getMetername() {
        return metername;
    }

    public void setMetername(String metername) {
        this.metername = metername;
    }

    public String getMetertype() {
        return metertype;
    }

    public void setMetertype(String metertype) {
        this.metertype = metertype;
    }

    public int getElecusage() {
        return elecusage;
    }

    public void setElecusage(int elecusage) {
        this.elecusage = elecusage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
