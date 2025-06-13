


public class CT_TableColModel {


    private final ST_CoordinateModel w;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableColModel(ST_CoordinateModel w , CT_OfficeArtExtensionListModel extLst ) {
        this.w = w;
        this.extLst = extLst;
    }

    public ST_CoordinateModel getW() {
        return this.w;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}