
package test.ooxml.drawingml.chart;

import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;


public class CT_RelIdModel {


    private final ST_RelationshipIdModel id;

    public CT_RelIdModel(ST_RelationshipIdModel id) {
        this.id = id;
    }

    public ST_RelationshipIdModel getId() {
        return this.id;
    }
}
