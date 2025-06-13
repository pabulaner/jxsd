


public class CT_StyleDefinitionModel {


    private final StringModel uniqueId;
    private final StringModel minVer;
    private final List<CT_SDNameModel> title;
    private final List<CT_SDDescriptionModel> desc;
    private final CT_SDCategoriesModel catLst;
    private final CT_Scene3DModel scene3d;
    private final List<CT_StyleLabelModel> styleLbl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_StyleDefinitionModel(StringModel uniqueId , StringModel minVer , List<CT_SDNameModel> title , List<CT_SDDescriptionModel> desc , CT_SDCategoriesModel catLst , CT_Scene3DModel scene3d , List<CT_StyleLabelModel> styleLbl , CT_OfficeArtExtensionListModel extLst ) {
        this.uniqueId = uniqueId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.scene3d = scene3d;
        this.styleLbl = styleLbl;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
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
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public List<CT_StyleLabelModel> getStyleLbl() {
        return this.styleLbl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}