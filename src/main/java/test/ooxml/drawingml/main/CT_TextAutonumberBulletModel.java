
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_TextAutonumberSchemeModel;
import test.ooxml.drawingml.main.ST_TextBulletStartAtNumModel;


public class CT_TextAutonumberBulletModel {


    private final ST_TextAutonumberSchemeModel type;
    private final ST_TextBulletStartAtNumModel startAt;

    public CT_TextAutonumberBulletModel(ST_TextAutonumberSchemeModel type, ST_TextBulletStartAtNumModel startAt) {
        this.type = type;
        this.startAt = startAt;
    }

    public ST_TextAutonumberSchemeModel getType() {
        return this.type;
    }
    public ST_TextBulletStartAtNumModel getStartAt() {
        return this.startAt;
    }
}
