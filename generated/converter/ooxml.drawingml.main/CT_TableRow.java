


public class CT_TableRowModel {


    private final ST_CoordinateModel h;
    private final List<CT_TableCellModel> tc;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableRowModel(ST_CoordinateModel h , List<CT_TableCellModel> tc , CT_OfficeArtExtensionListModel extLst ) {
        this.h = h;
        this.tc = tc;
        this.extLst = extLst;
    }

    public ST_CoordinateModel getH() {
        return this.h;
    }
    public List<CT_TableCellModel> getTc() {
        return this.tc;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}