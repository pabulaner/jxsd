


public class CT_GvmlConnectorNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualConnectorPropertiesModel cNvCxnSpPr;

    public CT_GvmlConnectorNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr , CT_NonVisualConnectorPropertiesModel cNvCxnSpPr ) {
        this.cNvPr = cNvPr;
        this.cNvCxnSpPr = cNvCxnSpPr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualConnectorPropertiesModel getCNvCxnSpPr() {
        return this.cNvCxnSpPr;
    }
}