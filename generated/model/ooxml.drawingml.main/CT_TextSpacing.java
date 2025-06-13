


public class CT_TextSpacingModel {




public class SpcPctOrspcPtsModel {


    private final Object value;

    public SpcPctOrspcPtsModel(CT_TextSpacingPercentModel value) {
        this.value = value;
    }
    public SpcPctOrspcPtsModel(CT_TextSpacingPointModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_TextSpacingPercentModel getSpcPct() {
        return (CT_TextSpacingPercentModel) value;
    }
    public CT_TextSpacingPointModel getSpcPts() {
        return (CT_TextSpacingPointModel) value;
    }
}

    private final SpcPctOrspcPtsModel spcPctOrspcPts;

    public CT_TextSpacingModel(SpcPctOrspcPtsModel spcPctOrspcPts ) {
        this.spcPctOrspcPts = spcPctOrspcPts;
    }

    public SpcPctOrspcPtsModel getSpcPctOrspcPts() {
        return this.spcPctOrspcPts;
    }
}