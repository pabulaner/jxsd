
package test.ooxml.drawingml.chart;

import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;


public class CT_ExternalDataModel {


    private final ST_RelationshipIdModel id;
    private final CT_BooleanModel autoUpdate;

    public CT_ExternalDataModel(ST_RelationshipIdModel id, CT_BooleanModel autoUpdate) {
        this.id = id;
        this.autoUpdate = autoUpdate;
    }

    public ST_RelationshipIdModel getId() {
        return this.id;
    }
    public CT_BooleanModel getAutoUpdate() {
        return this.autoUpdate;
    }
}
