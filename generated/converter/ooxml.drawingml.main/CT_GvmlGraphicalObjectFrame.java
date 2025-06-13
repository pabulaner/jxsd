


public class CT_GvmlGraphicalObjectFrameModel {


    private final CT_GvmlGraphicFrameNonVisualModel nvGraphicFramePr;
    private final CT_GraphicalObjectModel graphic;
    private final CT_Transform2DModel xfrm;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlGraphicalObjectFrameModel(CT_GvmlGraphicFrameNonVisualModel nvGraphicFramePr , CT_GraphicalObjectModel graphic , CT_Transform2DModel xfrm , CT_OfficeArtExtensionListModel extLst ) {
        this.nvGraphicFramePr = nvGraphicFramePr;
        this.graphic = graphic;
        this.xfrm = xfrm;
        this.extLst = extLst;
    }

    public CT_GvmlGraphicFrameNonVisualModel getNvGraphicFramePr() {
        return this.nvGraphicFramePr;
    }
    public CT_GraphicalObjectModel getGraphic() {
        return this.graphic;
    }
    public CT_Transform2DModel getXfrm() {
        return this.xfrm;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}