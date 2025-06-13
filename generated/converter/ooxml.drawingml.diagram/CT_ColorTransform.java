


public class CT_ColorTransformModel {


    private final StringModel uniqueId;
    private final StringModel minVer;
    private final List<CT_CTNameModel> title;
    private final List<CT_CTDescriptionModel> desc;
    private final CT_CTCategoriesModel catLst;
    private final List<CT_CTStyleLabelModel> styleLbl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ColorTransformModel(StringModel uniqueId , StringModel minVer , List<CT_CTNameModel> title , List<CT_CTDescriptionModel> desc , CT_CTCategoriesModel catLst , List<CT_CTStyleLabelModel> styleLbl , CT_OfficeArtExtensionListModel extLst ) {
        this.uniqueId = uniqueId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.styleLbl = styleLbl;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
    }
    public StringModel getMinVer() {
        return this.minVer;
    }
    public List<CT_CTNameModel> getTitle() {
        return this.title;
    }
    public List<CT_CTDescriptionModel> getDesc() {
        return this.desc;
    }
    public CT_CTCategoriesModel getCatLst() {
        return this.catLst;
    }
    public List<CT_CTStyleLabelModel> getStyleLbl() {
        return this.styleLbl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}