


public class CT_TableCellModel {


    private final BooleanModel hMerge;
    private final IntModel gridSpan;
    private final BooleanModel vMerge;
    private final IntModel rowSpan;
    private final StringModel id;
    private final CT_TextBodyModel txBody;
    private final CT_TableCellPropertiesModel tcPr;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableCellModel(BooleanModel hMerge , IntModel gridSpan , BooleanModel vMerge , IntModel rowSpan , StringModel id , CT_TextBodyModel txBody , CT_TableCellPropertiesModel tcPr , CT_OfficeArtExtensionListModel extLst ) {
        this.hMerge = hMerge;
        this.gridSpan = gridSpan;
        this.vMerge = vMerge;
        this.rowSpan = rowSpan;
        this.id = id;
        this.txBody = txBody;
        this.tcPr = tcPr;
        this.extLst = extLst;
    }

    public BooleanModel getHMerge() {
        return this.hMerge;
    }
    public IntModel getGridSpan() {
        return this.gridSpan;
    }
    public BooleanModel getVMerge() {
        return this.vMerge;
    }
    public IntModel getRowSpan() {
        return this.rowSpan;
    }
    public StringModel getId() {
        return this.id;
    }
    public CT_TextBodyModel getTxBody() {
        return this.txBody;
    }
    public CT_TableCellPropertiesModel getTcPr() {
        return this.tcPr;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}