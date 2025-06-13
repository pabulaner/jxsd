


public class CT_AudioFileModel {


    private final ST_RelationshipIdModel link;
    private final StringModel contentType;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_AudioFileModel(ST_RelationshipIdModel link , StringModel contentType , CT_OfficeArtExtensionListModel extLst ) {
        this.link = link;
        this.contentType = contentType;
        this.extLst = extLst;
    }

    public ST_RelationshipIdModel getLink() {
        return this.link;
    }
    public StringModel getContentType() {
        return this.contentType;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}