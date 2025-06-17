
package test.ooxml.drawingml.diagram;

import test.ooxml.drawingml.diagram.ST_AlgorithmTypeModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test.ooxml.drawingml.diagram.CT_ParameterModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_AlgorithmModel {


    private final ST_AlgorithmTypeModel type;
    private final UnsignedIntModel rev;
    private final CT_ParameterModel param;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_AlgorithmModel(ST_AlgorithmTypeModel type, UnsignedIntModel rev, CT_ParameterModel param, CT_OfficeArtExtensionListModel extLst) {
        this.type = type;
        this.rev = rev;
        this.param = param;
        this.extLst = extLst;
    }

    public ST_AlgorithmTypeModel getType() {
        return this.type;
    }
    public UnsignedIntModel getRev() {
        return this.rev;
    }
    public CT_ParameterModel getParam() {
        return this.param;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
