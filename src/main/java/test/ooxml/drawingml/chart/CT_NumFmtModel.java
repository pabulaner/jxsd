
package test.ooxml.drawingml.chart;

import test.ooxml.officeDocument.sharedTypes.ST_XstringModel;
import test._2001.XMLSchema.BooleanModel;


public class CT_NumFmtModel {


    private final ST_XstringModel formatCode;
    private final BooleanModel sourceLinked;

    public CT_NumFmtModel(ST_XstringModel formatCode, BooleanModel sourceLinked) {
        this.formatCode = formatCode;
        this.sourceLinked = sourceLinked;
    }

    public ST_XstringModel getFormatCode() {
        return this.formatCode;
    }
    public BooleanModel getSourceLinked() {
        return this.sourceLinked;
    }
}
