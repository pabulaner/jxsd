


public class CT_View3DModel {


    private final CT_RotXModel rotX;
    private final CT_HPercentModel hPercent;
    private final CT_RotYModel rotY;
    private final CT_DepthPercentModel depthPercent;
    private final CT_BooleanModel rAngAx;
    private final CT_PerspectiveModel perspective;
    private final CT_ExtensionListModel extLst;

    public CT_View3DModel(CT_RotXModel rotX , CT_HPercentModel hPercent , CT_RotYModel rotY , CT_DepthPercentModel depthPercent , CT_BooleanModel rAngAx , CT_PerspectiveModel perspective , CT_ExtensionListModel extLst ) {
        this.rotX = rotX;
        this.hPercent = hPercent;
        this.rotY = rotY;
        this.depthPercent = depthPercent;
        this.rAngAx = rAngAx;
        this.perspective = perspective;
        this.extLst = extLst;
    }

    public CT_RotXModel getRotX() {
        return this.rotX;
    }
    public CT_HPercentModel getHPercent() {
        return this.hPercent;
    }
    public CT_RotYModel getRotY() {
        return this.rotY;
    }
    public CT_DepthPercentModel getDepthPercent() {
        return this.depthPercent;
    }
    public CT_BooleanModel getRAngAx() {
        return this.rAngAx;
    }
    public CT_PerspectiveModel getPerspective() {
        return this.perspective;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}