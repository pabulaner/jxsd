


public class CT_Scene3DModel {


    private final CT_CameraModel camera;
    private final CT_LightRigModel lightRig;
    private final CT_BackdropModel backdrop;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_Scene3DModel(CT_CameraModel camera , CT_LightRigModel lightRig , CT_BackdropModel backdrop , CT_OfficeArtExtensionListModel extLst ) {
        this.camera = camera;
        this.lightRig = lightRig;
        this.backdrop = backdrop;
        this.extLst = extLst;
    }

    public CT_CameraModel getCamera() {
        return this.camera;
    }
    public CT_LightRigModel getLightRig() {
        return this.lightRig;
    }
    public CT_BackdropModel getBackdrop() {
        return this.backdrop;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}