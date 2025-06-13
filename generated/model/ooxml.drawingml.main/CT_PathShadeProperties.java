


public class CT_PathShadePropertiesModel {


    private final ST_PathShadeTypeModel path;
    private final CT_RelativeRectModel fillToRect;

    public CT_PathShadePropertiesModel(ST_PathShadeTypeModel path , CT_RelativeRectModel fillToRect ) {
        this.path = path;
        this.fillToRect = fillToRect;
    }

    public ST_PathShadeTypeModel getPath() {
        return this.path;
    }
    public CT_RelativeRectModel getFillToRect() {
        return this.fillToRect;
    }
}