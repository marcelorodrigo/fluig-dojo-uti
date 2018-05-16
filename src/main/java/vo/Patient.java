package vo;

public class Patient {

    private String name;
    private double weight;
    private long heartBeat;
    private long maxBeat;
    private long minBeat;

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Patient setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public long getHeartBeat() {
        return heartBeat;
    }

    public Patient setHeartBeat(long heartBeat) {
        this.heartBeat = heartBeat;
        return this;
    }

    public Long getMaxBeat() {
        return maxBeat;
    }

    public Patient setMaxBeat(Long maxBeat) {
        this.maxBeat = maxBeat;
        return this;
    }

    public Long getMinBeat() {
        return minBeat;
    }

    public Patient setMinBeat(Long minBeat) {
        this.minBeat = minBeat;
        return this;
    }
}
