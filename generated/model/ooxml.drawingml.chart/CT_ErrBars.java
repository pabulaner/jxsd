


public class CT_ErrBarsModel {


    private final CT_ErrDirModel errDir;
    private final CT_ErrBarTypeModel errBarType;
    private final CT_ErrValTypeModel errValType;
    private final CT_BooleanModel noEndCap;
    private final CT_NumDataSourceModel plus;
    private final CT_NumDataSourceModel minus;
    private final CT_DoubleModel val;
    private final CT_ShapePropertiesModel spPr;
    private final CT_ExtensionListModel extLst;

    public CT_ErrBarsModel(CT_ErrDirModel errDir , CT_ErrBarTypeModel errBarType , CT_ErrValTypeModel errValType , CT_BooleanModel noEndCap , CT_NumDataSourceModel plus , CT_NumDataSourceModel minus , CT_DoubleModel val , CT_ShapePropertiesModel spPr , CT_ExtensionListModel extLst ) {
        this.errDir = errDir;
        this.errBarType = errBarType;
        this.errValType = errValType;
        this.noEndCap = noEndCap;
        this.plus = plus;
        this.minus = minus;
        this.val = val;
        this.spPr = spPr;
        this.extLst = extLst;
    }

    public CT_ErrDirModel getErrDir() {
        return this.errDir;
    }
    public CT_ErrBarTypeModel getErrBarType() {
        return this.errBarType;
    }
    public CT_ErrValTypeModel getErrValType() {
        return this.errValType;
    }
    public CT_BooleanModel getNoEndCap() {
        return this.noEndCap;
    }
    public CT_NumDataSourceModel getPlus() {
        return this.plus;
    }
    public CT_NumDataSourceModel getMinus() {
        return this.minus;
    }
    public CT_DoubleModel getVal() {
        return this.val;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}