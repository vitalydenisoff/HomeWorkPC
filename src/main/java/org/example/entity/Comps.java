package org.example.entity;

import org.apache.maven.surefire.shared.compress.archivers.dump.DumpArchiveEntry;

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


    public void getLocation(String data) {
    }

    public void getPowerconsum(String data) {
    }

    public void getCooler(String data) {
    }

    public Type getPort() {
    }
}
