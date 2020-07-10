package LaptopFolder;

public class Specs {

    //Specs(ram(memory), hd(memory), processor(iNumber, Ghz, numOfCores)

    private int specsRam;
    private int specsHd;
    private Processor  processor;


    @Override
    public String toString() {
        return "Specs{" +
                "specsRam=" + specsRam +
                ", specsHd=" + specsHd +

                '}';
    }

    public Specs(int specsRam, int specsHd, Processor processor) {
        this.specsRam = specsRam;
        this.specsHd = specsHd;
        this.processor = processor;
    }

    public int getSpecsRam() {
        return specsRam;
    }

    public void setSpecsRam(int specsRam) {
        this.specsRam = specsRam;
    }

    public int getSpecsHd() {
        return specsHd;
    }

    public void setSpecsHd(int specsHd) {
        this.specsHd = specsHd;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
