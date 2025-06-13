


public class CT_RatioModel {


    private final LongModel n;
    private final LongModel d;

    public CT_RatioModel(LongModel n , LongModel d ) {
        this.n = n;
        this.d = d;
    }

    public LongModel getN() {
        return this.n;
    }
    public LongModel getD() {
        return this.d;
    }
}