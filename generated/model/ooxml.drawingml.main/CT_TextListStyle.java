


public class CT_TextListStyleModel {


    private final CT_TextParagraphPropertiesModel defPPr;
    private final CT_TextParagraphPropertiesModel lvl1pPr;
    private final CT_TextParagraphPropertiesModel lvl2pPr;
    private final CT_TextParagraphPropertiesModel lvl3pPr;
    private final CT_TextParagraphPropertiesModel lvl4pPr;
    private final CT_TextParagraphPropertiesModel lvl5pPr;
    private final CT_TextParagraphPropertiesModel lvl6pPr;
    private final CT_TextParagraphPropertiesModel lvl7pPr;
    private final CT_TextParagraphPropertiesModel lvl8pPr;
    private final CT_TextParagraphPropertiesModel lvl9pPr;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TextListStyleModel(CT_TextParagraphPropertiesModel defPPr , CT_TextParagraphPropertiesModel lvl1pPr , CT_TextParagraphPropertiesModel lvl2pPr , CT_TextParagraphPropertiesModel lvl3pPr , CT_TextParagraphPropertiesModel lvl4pPr , CT_TextParagraphPropertiesModel lvl5pPr , CT_TextParagraphPropertiesModel lvl6pPr , CT_TextParagraphPropertiesModel lvl7pPr , CT_TextParagraphPropertiesModel lvl8pPr , CT_TextParagraphPropertiesModel lvl9pPr , CT_OfficeArtExtensionListModel extLst ) {
        this.defPPr = defPPr;
        this.lvl1pPr = lvl1pPr;
        this.lvl2pPr = lvl2pPr;
        this.lvl3pPr = lvl3pPr;
        this.lvl4pPr = lvl4pPr;
        this.lvl5pPr = lvl5pPr;
        this.lvl6pPr = lvl6pPr;
        this.lvl7pPr = lvl7pPr;
        this.lvl8pPr = lvl8pPr;
        this.lvl9pPr = lvl9pPr;
        this.extLst = extLst;
    }

    public CT_TextParagraphPropertiesModel getDefPPr() {
        return this.defPPr;
    }
    public CT_TextParagraphPropertiesModel getLvl1pPr() {
        return this.lvl1pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl2pPr() {
        return this.lvl2pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl3pPr() {
        return this.lvl3pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl4pPr() {
        return this.lvl4pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl5pPr() {
        return this.lvl5pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl6pPr() {
        return this.lvl6pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl7pPr() {
        return this.lvl7pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl8pPr() {
        return this.lvl8pPr;
    }
    public CT_TextParagraphPropertiesModel getLvl9pPr() {
        return this.lvl9pPr;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}