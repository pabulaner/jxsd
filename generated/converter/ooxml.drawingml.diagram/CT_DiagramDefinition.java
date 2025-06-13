


public class CT_DiagramDefinitionModel {


    private final StringModel uniqueId;
    private final StringModel defStyle;
    private final StringModel minVer;
    private final List<CT_NameModel> title;
    private final List<CT_DescriptionModel> desc;
    private final CT_CategoriesModel catLst;
    private final CT_SampleDataModel sampData;
    private final CT_SampleDataModel styleData;
    private final CT_SampleDataModel clrData;
    private final CT_LayoutNodeModel layoutNode;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_DiagramDefinitionModel(StringModel uniqueId , StringModel defStyle , StringModel minVer , List<CT_NameModel> title , List<CT_DescriptionModel> desc , CT_CategoriesModel catLst , CT_SampleDataModel sampData , CT_SampleDataModel styleData , CT_SampleDataModel clrData , CT_LayoutNodeModel layoutNode , CT_OfficeArtExtensionListModel extLst ) {
        this.uniqueId = uniqueId;
        this.defStyle = defStyle;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.sampData = sampData;
        this.styleData = styleData;
        this.clrData = clrData;
        this.layoutNode = layoutNode;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
    }
    public StringModel getDefStyle() {
        return this.defStyle;
    }
    public StringModel getMinVer() {
        return this.minVer;
    }
    public List<CT_NameModel> getTitle() {
        return this.title;
    }
    public List<CT_DescriptionModel> getDesc() {
        return this.desc;
    }
    public CT_CategoriesModel getCatLst() {
        return this.catLst;
    }
    public CT_SampleDataModel getSampData() {
        return this.sampData;
    }
    public CT_SampleDataModel getStyleData() {
        return this.styleData;
    }
    public CT_SampleDataModel getClrData() {
        return this.clrData;
    }
    public CT_LayoutNodeModel getLayoutNode() {
        return this.layoutNode;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}