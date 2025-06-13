


public class CT_ShapeNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualDrawingShapePropsModel cNvSpPr;

    public CT_ShapeNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr , CT_NonVisualDrawingShapePropsModel cNvSpPr ) {
        this.cNvPr = cNvPr;
        this.cNvSpPr = cNvSpPr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualDrawingShapePropsModel getCNvSpPr() {
        return this.cNvSpPr;
    }
}