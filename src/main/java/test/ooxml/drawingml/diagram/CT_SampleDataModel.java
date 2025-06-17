
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.diagram.CT_DataModelModel;


public class CT_SampleDataModel {


    private final BooleanModel useDef;
    private final CT_DataModelModel dataModel;

    public CT_SampleDataModel(BooleanModel useDef, CT_DataModelModel dataModel) {
        this.useDef = useDef;
        this.dataModel = dataModel;
    }

    public BooleanModel getUseDef() {
        return this.useDef;
    }
    public CT_DataModelModel getDataModel() {
        return this.dataModel;
    }
}
