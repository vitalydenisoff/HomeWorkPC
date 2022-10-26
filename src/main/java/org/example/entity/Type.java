package org.example.entity;

public class Type {


    private String  location;
    private Integer powerconsum;
    private Boolean cooler;
    private String port;

    public Type (){

    }
    public Type(String location, Integer powerconsum, Boolean cooler, String port) {
        this.location = location;
        this.powerconsum = powerconsum;
        this.cooler = cooler;
        this.port = port;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Type");
        sb.append("location").append(location).append('\'');
        sb.append("powerconsum").append(powerconsum).append('\'');
        sb.append("cooler").append(cooler).append('\'');
        sb.append("port").append(port).append('\'');
        sb.append('}');
        return super.toString();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPowerconsum() {
        return powerconsum;
    }

    public void setPowerconsum(Integer powerconsum) {
        this.powerconsum = powerconsum;
    }

    public void Boolean getCooler() {
        return cooler;
    }

    public void setCooler(Boolean cooler) {
        this.cooler = cooler;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}