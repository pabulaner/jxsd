


public class CT_TableStyleTextStyleModel {


    private final ST_OnOffStyleTypeModel i;
    private final ST_OnOffStyleTypeModel b;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableStyleTextStyleModel(ST_OnOffStyleTypeModel i , ST_OnOffStyleTypeModel b , CT_OfficeArtExtensionListModel extLst ) {
        this.i = i;
        this.b = b;
        this.extLst = extLst;
    }

    public ST_OnOffStyleTypeModel getI() {
        return this.i;
    }
    public ST_OnOffStyleTypeModel getB() {
        return this.b;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}