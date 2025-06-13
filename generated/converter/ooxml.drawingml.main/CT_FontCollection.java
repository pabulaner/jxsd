


public class CT_FontCollectionModel {


    private final CT_TextFontModel latin;
    private final CT_TextFontModel ea;
    private final CT_TextFontModel cs;
    private final List<CT_SupplementalFontModel> font;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_FontCollectionModel(CT_TextFontModel latin , CT_TextFontModel ea , CT_TextFontModel cs , List<CT_SupplementalFontModel> font , CT_OfficeArtExtensionListModel extLst ) {
        this.latin = latin;
        this.ea = ea;
        this.cs = cs;
        this.font = font;
        this.extLst = extLst;
    }

    public CT_TextFontModel getLatin() {
        return this.latin;
    }
    public CT_TextFontModel getEa() {
        return this.ea;
    }
    public CT_TextFontModel getCs() {
        return this.cs;
    }
    public List<CT_SupplementalFontModel> getFont() {
        return this.font;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}