


public class CT_SurfaceModel {


    private final CT_ThicknessModel thickness;
    private final CT_ShapePropertiesModel spPr;
    private final CT_PictureOptionsModel pictureOptions;
    private final CT_ExtensionListModel extLst;

    public CT_SurfaceModel(CT_ThicknessModel thickness , CT_ShapePropertiesModel spPr , CT_PictureOptionsModel pictureOptions , CT_ExtensionListModel extLst ) {
        this.thickness = thickness;
        this.spPr = spPr;
        this.pictureOptions = pictureOptions;
        this.extLst = extLst;
    }

    public CT_ThicknessModel getThickness() {
        return this.thickness;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_PictureOptionsModel getPictureOptions() {
        return this.pictureOptions;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}