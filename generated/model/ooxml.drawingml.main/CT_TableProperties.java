


public class CT_TablePropertiesModel {




public class TableStyleOrtableStyleIdModel {


    private final Object value;

    public TableStyleOrtableStyleIdModel(CT_TableStyleModel value) {
        this.value = value;
    }
    public TableStyleOrtableStyleIdModel(ST_GuidModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_TableStyleModel getTableStyle() {
        return (CT_TableStyleModel) value;
    }
    public ST_GuidModel getTableStyleId() {
        return (ST_GuidModel) value;
    }
}

    private final BooleanModel bandCol;
    private final BooleanModel rtl;
    private final BooleanModel bandRow;
    private final BooleanModel lastCol;
    private final BooleanModel lastRow;
    private final BooleanModel firstCol;
    private final BooleanModel firstRow;
    private final TableStyleOrtableStyleIdModel tableStyleOrtableStyleId;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TablePropertiesModel(BooleanModel bandCol , BooleanModel rtl , BooleanModel bandRow , BooleanModel lastCol , BooleanModel lastRow , BooleanModel firstCol , BooleanModel firstRow , TableStyleOrtableStyleIdModel tableStyleOrtableStyleId , CT_OfficeArtExtensionListModel extLst ) {
        this.bandCol = bandCol;
        this.rtl = rtl;
        this.bandRow = bandRow;
        this.lastCol = lastCol;
        this.lastRow = lastRow;
        this.firstCol = firstCol;
        this.firstRow = firstRow;
        this.tableStyleOrtableStyleId = tableStyleOrtableStyleId;
        this.extLst = extLst;
    }

    public BooleanModel getBandCol() {
        return this.bandCol;
    }
    public BooleanModel getRtl() {
        return this.rtl;
    }
    public BooleanModel getBandRow() {
        return this.bandRow;
    }
    public BooleanModel getLastCol() {
        return this.lastCol;
    }
    public BooleanModel getLastRow() {
        return this.lastRow;
    }
    public BooleanModel getFirstCol() {
        return this.firstCol;
    }
    public BooleanModel getFirstRow() {
        return this.firstRow;
    }
    public TableStyleOrtableStyleIdModel getTableStyleOrtableStyleId() {
        return this.tableStyleOrtableStyleId;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}