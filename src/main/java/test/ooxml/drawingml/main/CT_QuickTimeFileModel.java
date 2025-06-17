
package test.ooxml.drawingml.main;

import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_QuickTimeFileModel {


    private final ST_RelationshipIdModel link;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_QuickTimeFileModel(ST_RelationshipIdModel link, CT_OfficeArtExtensionListModel extLst) {
        this.link = link;
        this.extLst = extLst;
    }

    public ST_RelationshipIdModel getLink() {
        return this.link;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
