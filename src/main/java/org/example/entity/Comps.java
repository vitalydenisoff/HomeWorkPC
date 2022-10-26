package org.example.entity;

import org.apache.maven.surefire.shared.compress.archivers.dump.DumpArchiveEntry;

import java.lang.reflect.Type;

public class Comps {
    private String device;
    private Integer price;

    private Boolean critical;

    public Type (){}



    public Comps() {

    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    }

    public Boolean getCritical() {
        return critical;
    }

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }


}
