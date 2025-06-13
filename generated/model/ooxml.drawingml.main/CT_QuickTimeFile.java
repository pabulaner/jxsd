


public class CT_QuickTimeFileModel {


    private final ST_RelationshipIdModel link;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_QuickTimeFileModel(ST_RelationshipIdModel link , CT_OfficeArtExtensionListModel extLst ) {
        this.link = link;
        this.extLst = extLst;
    }

    public ST_RelationshipIdModel getLink() {
        return this.link;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}