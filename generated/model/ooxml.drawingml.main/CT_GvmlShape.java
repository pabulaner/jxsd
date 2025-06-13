


public class CT_GvmlShapeModel {


    private final CT_GvmlShapeNonVisualModel nvSpPr;
    private final CT_ShapePropertiesModel spPr;
    private final CT_GvmlTextShapeModel txSp;
    private final CT_ShapeStyleModel style;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlShapeModel(CT_GvmlShapeNonVisualModel nvSpPr , CT_ShapePropertiesModel spPr , CT_GvmlTextShapeModel txSp , CT_ShapeStyleModel style , CT_OfficeArtExtensionListModel extLst ) {
        this.nvSpPr = nvSpPr;
        this.spPr = spPr;
        this.txSp = txSp;
        this.style = style;
        this.extLst = extLst;
    }

    public CT_GvmlShapeNonVisualModel getNvSpPr() {
        return this.nvSpPr;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_GvmlTextShapeModel getTxSp() {
        return this.txSp;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}