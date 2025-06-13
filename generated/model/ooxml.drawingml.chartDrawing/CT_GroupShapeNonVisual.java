


public class CT_GroupShapeNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

    public CT_GroupShapeNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr , CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr ) {
        this.cNvPr = cNvPr;
        this.cNvGrpSpPr = cNvGrpSpPr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
        return this.cNvGrpSpPr;
    }
}