package LaptopFolder;

public class Processor {
   // processor(iNumber, Ghz, numOfCores)

    private double specsProcessorGhz;
    private String specsProcessorIName;
    private String specsProcessorINumber;

    @Override
    public String toString() {
        return "Processor{" +
                "specsProcessorGhz=" + specsProcessorGhz +
                ", specsProcessorIName='" + specsProcessorIName + '\'' +
                ", specsProcessorINumber='" + specsProcessorINumber + '\'' +
                '}';
    }

    public Processor(double specsProcessorGhz, String specsProcessorIName, String specsProcessorINumber) {
        this.specsProcessorGhz = specsProcessorGhz;
        this.specsProcessorIName = specsProcessorIName;
        this.specsProcessorINumber = specsProcessorINumber;
    }

    public double getSpecsProcessorGhz() {
        return specsProcessorGhz;
    }

    public void setSpecsProcessorGhz(double specsProcessorGhz) {
        this.specsProcessorGhz = specsProcessorGhz;
    }

    public String getSpecsProcessorIName() {
        return specsProcessorIName;
    }

    public void setSpecsProcessorIName(String specsProcessorIName) {
        this.specsProcessorIName = specsProcessorIName;
    }

    public String getSpecsProcessorINumber() {
        return specsProcessorINumber;
    }

    public void setSpecsProcessorINumber(String specsProcessorINumber) {
        this.specsProcessorINumber = specsProcessorINumber;
    }
}
