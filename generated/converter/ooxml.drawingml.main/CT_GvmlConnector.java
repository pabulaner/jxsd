


public class CT_GvmlConnectorModel {


    private final CT_GvmlConnectorNonVisualModel nvCxnSpPr;
    private final CT_ShapePropertiesModel spPr;
    private final CT_ShapeStyleModel style;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlConnectorModel(CT_GvmlConnectorNonVisualModel nvCxnSpPr , CT_ShapePropertiesModel spPr , CT_ShapeStyleModel style , CT_OfficeArtExtensionListModel extLst ) {
        this.nvCxnSpPr = nvCxnSpPr;
        this.spPr = spPr;
        this.style = style;
        this.extLst = extLst;
    }

    public CT_GvmlConnectorNonVisualModel getNvCxnSpPr() {
        return this.nvCxnSpPr;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}