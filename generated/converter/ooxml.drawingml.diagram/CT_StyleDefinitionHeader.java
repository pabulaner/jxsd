


public class CT_StyleDefinitionHeaderModel {


    private final StringModel uniqueId;
    private final IntModel resId;
    private final StringModel minVer;
    private final List<CT_SDNameModel> title;
    private final List<CT_SDDescriptionModel> desc;
    private final CT_SDCategoriesModel catLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_StyleDefinitionHeaderModel(StringModel uniqueId , IntModel resId , StringModel minVer , List<CT_SDNameModel> title , List<CT_SDDescriptionModel> desc , CT_SDCategoriesModel catLst , CT_OfficeArtExtensionListModel extLst ) {
        this.uniqueId = uniqueId;
        this.resId = resId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
    }
    public IntModel getResId() {
        return this.resId;
    }
    public StringModel getMinVer() {
        return this.minVer;
    }
    public List<CT_SDNameModel> getTitle() {
        return this.title;
    }
    public List<CT_SDDescriptionModel> getDesc() {
        return this.desc;
    }
    public CT_SDCategoriesModel getCatLst() {
        return this.catLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}