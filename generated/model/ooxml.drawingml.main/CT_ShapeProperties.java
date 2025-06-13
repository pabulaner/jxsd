


public class CT_ShapePropertiesModel {


    private final ST_BlackWhiteModeModel bwMode;
    private final CT_Transform2DModel xfrm;
    private final CT_LinePropertiesModel ln;
    private final CT_Scene3DModel scene3d;
    private final CT_Shape3DModel sp3d;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ShapePropertiesModel(ST_BlackWhiteModeModel bwMode , CT_Transform2DModel xfrm , CT_LinePropertiesModel ln , CT_Scene3DModel scene3d , CT_Shape3DModel sp3d , CT_OfficeArtExtensionListModel extLst ) {
        this.bwMode = bwMode;
        this.xfrm = xfrm;
        this.ln = ln;
        this.scene3d = scene3d;
        this.sp3d = sp3d;
        this.extLst = extLst;
    }

    public ST_BlackWhiteModeModel getBwMode() {
        return this.bwMode;
    }
    public CT_Transform2DModel getXfrm() {
        return this.xfrm;
    }
    public CT_LinePropertiesModel getLn() {
        return this.ln;
    }
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_Shape3DModel getSp3d() {
        return this.sp3d;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}