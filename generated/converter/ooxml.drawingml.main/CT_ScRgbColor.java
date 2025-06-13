


public class CT_ScRgbColorModel {


    private final ST_PercentageModel g;
    private final ST_PercentageModel r;
    private final ST_PercentageModel b;

    public CT_ScRgbColorModel(ST_PercentageModel g , ST_PercentageModel r , ST_PercentageModel b ) {
        this.g = g;
        this.r = r;
        this.b = b;
    }

    public ST_PercentageModel getG() {
        return this.g;
    }
    public ST_PercentageModel getR() {
        return this.r;
    }
    public ST_PercentageModel getB() {
        return this.b;
    }
}