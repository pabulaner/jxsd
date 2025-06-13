


public class CT_GvmlGraphicFrameNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

    public CT_GvmlGraphicFrameNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr , CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr ) {
        this.cNvPr = cNvPr;
        this.cNvGraphicFramePr = cNvGraphicFramePr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
        return this.cNvGraphicFramePr;
    }
}