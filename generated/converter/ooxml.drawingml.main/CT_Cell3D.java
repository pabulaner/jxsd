


public class CT_Cell3DModel {


    private final ST_PresetMaterialTypeModel prstMaterial;
    private final CT_BevelModel bevel;
    private final CT_LightRigModel lightRig;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_Cell3DModel(ST_PresetMaterialTypeModel prstMaterial , CT_BevelModel bevel , CT_LightRigModel lightRig , CT_OfficeArtExtensionListModel extLst ) {
        this.prstMaterial = prstMaterial;
        this.bevel = bevel;
        this.lightRig = lightRig;
        this.extLst = extLst;
    }

    public ST_PresetMaterialTypeModel getPrstMaterial() {
        return this.prstMaterial;
    }
    public CT_BevelModel getBevel() {
        return this.bevel;
    }
    public CT_LightRigModel getLightRig() {
        return this.lightRig;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}