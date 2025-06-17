
package test.ooxml.drawingml.main;

import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;
import test._2001.XMLSchema.StringModel;


public class CT_EmbeddedWAVAudioFileModel {


    private final ST_RelationshipIdModel embed;
    private final StringModel name;

    public CT_EmbeddedWAVAudioFileModel(ST_RelationshipIdModel embed, StringModel name) {
        this.embed = embed;
        this.name = name;
    }

    public ST_RelationshipIdModel getEmbed() {
        return this.embed;
    }
    public StringModel getName() {
        return this.name;
    }
}
