
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.StringModel;
import test.ooxml.officeDocument.sharedTypes.ST_GuidModel;
import test.ooxml.drawingml.main.CT_TableBackgroundStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_TablePartStyleModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_TableStyleModel {


    private final StringModel styleName;
    private final ST_GuidModel styleId;
    private final CT_TableBackgroundStyleModel tblBg;
    private final CT_TablePartStyleModel wholeTbl;
    private final CT_TablePartStyleModel band1H;
    private final CT_TablePartStyleModel band2H;
    private final CT_TablePartStyleModel band1V;
    private final CT_TablePartStyleModel band2V;
    private final CT_TablePartStyleModel lastCol;
    private final CT_TablePartStyleModel firstCol;
    private final CT_TablePartStyleModel lastRow;
    private final CT_TablePartStyleModel seCell;
    private final CT_TablePartStyleModel swCell;
    private final CT_TablePartStyleModel firstRow;
    private final CT_TablePartStyleModel neCell;
    private final CT_TablePartStyleModel nwCell;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableStyleModel(StringModel styleName, ST_GuidModel styleId, CT_TableBackgroundStyleModel tblBg, CT_TablePartStyleModel wholeTbl, CT_TablePartStyleModel band1H, CT_TablePartStyleModel band2H, CT_TablePartStyleModel band1V, CT_TablePartStyleModel band2V, CT_TablePartStyleModel lastCol, CT_TablePartStyleModel firstCol, CT_TablePartStyleModel lastRow, CT_TablePartStyleModel seCell, CT_TablePartStyleModel swCell, CT_TablePartStyleModel firstRow, CT_TablePartStyleModel neCell, CT_TablePartStyleModel nwCell, CT_OfficeArtExtensionListModel extLst) {
        this.styleName = styleName;
        this.styleId = styleId;
        this.tblBg = tblBg;
        this.wholeTbl = wholeTbl;
        this.band1H = band1H;
        this.band2H = band2H;
        this.band1V = band1V;
        this.band2V = band2V;
        this.lastCol = lastCol;
        this.firstCol = firstCol;
        this.lastRow = lastRow;
        this.seCell = seCell;
        this.swCell = swCell;
        this.firstRow = firstRow;
        this.neCell = neCell;
        this.nwCell = nwCell;
        this.extLst = extLst;
    }

    public StringModel getStyleName() {
        return this.styleName;
    }
    public ST_GuidModel getStyleId() {
        return this.styleId;
    }
    public CT_TableBackgroundStyleModel getTblBg() {
        return this.tblBg;
    }
    public CT_TablePartStyleModel getWholeTbl() {
        return this.wholeTbl;
    }
    public CT_TablePartStyleModel getBand1H() {
        return this.band1H;
    }
    public CT_TablePartStyleModel getBand2H() {
        return this.band2H;
    }
    public CT_TablePartStyleModel getBand1V() {
        return this.band1V;
    }
    public CT_TablePartStyleModel getBand2V() {
        return this.band2V;
    }
    public CT_TablePartStyleModel getLastCol() {
        return this.lastCol;
    }
    public CT_TablePartStyleModel getFirstCol() {
        return this.firstCol;
    }
    public CT_TablePartStyleModel getLastRow() {
        return this.lastRow;
    }
    public CT_TablePartStyleModel getSeCell() {
        return this.seCell;
    }
    public CT_TablePartStyleModel getSwCell() {
        return this.swCell;
    }
    public CT_TablePartStyleModel getFirstRow() {
        return this.firstRow;
    }
    public CT_TablePartStyleModel getNeCell() {
        return this.neCell;
    }
    public CT_TablePartStyleModel getNwCell() {
        return this.nwCell;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
