


public class CT_Shape3DModel {


    private final ST_PositiveCoordinateModel contourW;
    private final ST_PositiveCoordinateModel extrusionH;
    private final ST_PresetMaterialTypeModel prstMaterial;
    private final ST_CoordinateModel z;
    private final CT_BevelModel bevelT;
    private final CT_BevelModel bevelB;
    private final CT_ColorModel extrusionClr;
    private final CT_ColorModel contourClr;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_Shape3DModel(ST_PositiveCoordinateModel contourW , ST_PositiveCoordinateModel extrusionH , ST_PresetMaterialTypeModel prstMaterial , ST_CoordinateModel z , CT_BevelModel bevelT , CT_BevelModel bevelB , CT_ColorModel extrusionClr , CT_ColorModel contourClr , CT_OfficeArtExtensionListModel extLst ) {
        this.contourW = contourW;
        this.extrusionH = extrusionH;
        this.prstMaterial = prstMaterial;
        this.z = z;
        this.bevelT = bevelT;
        this.bevelB = bevelB;
        this.extrusionClr = extrusionClr;
        this.contourClr = contourClr;
        this.extLst = extLst;
    }

    public ST_PositiveCoordinateModel getContourW() {
        return this.contourW;
    }
    public ST_PositiveCoordinateModel getExtrusionH() {
        return this.extrusionH;
    }
    public ST_PresetMaterialTypeModel getPrstMaterial() {
        return this.prstMaterial;
    }
    public ST_CoordinateModel getZ() {
        return this.z;
    }
    public CT_BevelModel getBevelT() {
        return this.bevelT;
    }
    public CT_BevelModel getBevelB() {
        return this.bevelB;
    }
    public CT_ColorModel getExtrusionClr() {
        return this.extrusionClr;
    }
    public CT_ColorModel getContourClr() {
        return this.contourClr;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}