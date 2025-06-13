


public class CT_RelSizeAnchorModel {


    private final CT_MarkerModel from;
    private final CT_MarkerModel to;

    public CT_RelSizeAnchorModel(CT_MarkerModel from , CT_MarkerModel to ) {
        this.from = from;
        this.to = to;
    }

    public CT_MarkerModel getFrom() {
        return this.from;
    }
    public CT_MarkerModel getTo() {
        return this.to;
    }
}