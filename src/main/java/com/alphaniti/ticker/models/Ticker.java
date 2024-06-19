package com.alphaniti.ticker.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "ticker")
public class Ticker {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    @JsonIgnore
    private Long id;
    @JsonProperty("ev")
    @Column(name="event_type")
    private String eventType;

    @JsonProperty("sym")
    @Column(name="symbol")
    private String symbol;

    @JsonProperty("v")
    @Column(name="volume")
    private int volume;

    @JsonProperty("av")
    @Column(name="avg_volume")
    private long averageVolume;

    @JsonProperty("op")
    @Column(name="open_price")
    private double openPrice;

    @JsonProperty("vw")
    @Column(name="volume_weighted_avg_price")
    private double volumeWeightedAveragePrice;

    @JsonProperty("o")
    @Column(name="open")
    private double open;

    @JsonProperty("c")
    @Column(name="close")
    private double close;

    @JsonProperty("h")
    @Column(name="high")
    private double high;

    @JsonProperty("l")
    @Column(name="low")
    private double low;

    @JsonProperty("a")
    @Column(name="average ")
    private double average;

    @JsonProperty("z")
    @Column(name="sequence")
    private int zero;

    @JsonProperty("s")
    @Column(name="start_timestamp")
    private long startTime;

    @JsonProperty("e")
    @Column(name="end_timestamp")
    private long endTime;

    public Ticker() {
    }

    public Ticker(String symbol) {
        this.symbol = symbol;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public long getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(long averageVolume) {
        this.averageVolume = averageVolume;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getVolumeWeightedAveragePrice() {
        return volumeWeightedAveragePrice;
    }

    public void setVolumeWeightedAveragePrice(double volumeWeightedAveragePrice) {
        this.volumeWeightedAveragePrice = volumeWeightedAveragePrice;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getZero() {
        return zero;
    }

    public void setZero(int zero) {
        this.zero = zero;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                ", symbol='" + symbol + '\'' +
                ", volume=" + volume +
                ", averageVolume=" + averageVolume +
                ", openPrice=" + openPrice +
                ", volumeWeightedAveragePrice=" + volumeWeightedAveragePrice +
                ", open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", average=" + average +
                ", zero=" + zero +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
