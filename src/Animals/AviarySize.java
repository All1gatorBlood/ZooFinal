package Animals;

public enum AviarySize  {
    AVIARY_SIZE_10(10),AVIARY_SIZE_20(20),AVIARY_SIZE_30(30),AVIARY_SIZE_40(40);
    int parSize;
    AviarySize(int parSize) {
        this.parSize = parSize;
    }

    public int getParSize() {
        return parSize;
    }
}
