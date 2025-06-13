


public class CT_PresetGeometry2DModel {


    private final ST_ShapeTypeModel prst;
    private final CT_GeomGuideListModel avLst;

    public CT_PresetGeometry2DModel(ST_ShapeTypeModel prst , CT_GeomGuideListModel avLst ) {
        this.prst = prst;
        this.avLst = avLst;
    }

    public ST_ShapeTypeModel getPrst() {
        return this.prst;
    }
    public CT_GeomGuideListModel getAvLst() {
        return this.avLst;
    }
}