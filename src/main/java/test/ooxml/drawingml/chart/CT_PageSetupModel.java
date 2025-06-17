
package test.ooxml.drawingml.chart;

import test._2001.XMLSchema.IntModel;
import test.ooxml.officeDocument.sharedTypes.ST_PositiveUniversalMeasureModel;
import test.ooxml.officeDocument.sharedTypes.ST_PositiveUniversalMeasureModel;
import test._2001.XMLSchema.IntModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test.ooxml.drawingml.chart.ST_PageSetupOrientationModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;


public class CT_PageSetupModel {


    private final IntModel verticalDpi;
    private final ST_PositiveUniversalMeasureModel paperHeight;
    private final ST_PositiveUniversalMeasureModel paperWidth;
    private final IntModel horizontalDpi;
    private final UnsignedIntModel firstPageNumber;
    private final ST_PageSetupOrientationModel orientation;
    private final BooleanModel draft;
    private final UnsignedIntModel copies;
    private final UnsignedIntModel paperSize;
    private final BooleanModel useFirstPageNumber;
    private final BooleanModel blackAndWhite;

    public CT_PageSetupModel(IntModel verticalDpi, ST_PositiveUniversalMeasureModel paperHeight, ST_PositiveUniversalMeasureModel paperWidth, IntModel horizontalDpi, UnsignedIntModel firstPageNumber, ST_PageSetupOrientationModel orientation, BooleanModel draft, UnsignedIntModel copies, UnsignedIntModel paperSize, BooleanModel useFirstPageNumber, BooleanModel blackAndWhite) {
        this.verticalDpi = verticalDpi;
        this.paperHeight = paperHeight;
        this.paperWidth = paperWidth;
        this.horizontalDpi = horizontalDpi;
        this.firstPageNumber = firstPageNumber;
        this.orientation = orientation;
        this.draft = draft;
        this.copies = copies;
        this.paperSize = paperSize;
        this.useFirstPageNumber = useFirstPageNumber;
        this.blackAndWhite = blackAndWhite;
    }

    public IntModel getVerticalDpi() {
        return this.verticalDpi;
    }
    public ST_PositiveUniversalMeasureModel getPaperHeight() {
        return this.paperHeight;
    }
    public ST_PositiveUniversalMeasureModel getPaperWidth() {
        return this.paperWidth;
    }
    public IntModel getHorizontalDpi() {
        return this.horizontalDpi;
    }
    public UnsignedIntModel getFirstPageNumber() {
        return this.firstPageNumber;
    }
    public ST_PageSetupOrientationModel getOrientation() {
        return this.orientation;
    }
    public BooleanModel getDraft() {
        return this.draft;
    }
    public UnsignedIntModel getCopies() {
        return this.copies;
    }
    public UnsignedIntModel getPaperSize() {
        return this.paperSize;
    }
    public BooleanModel getUseFirstPageNumber() {
        return this.useFirstPageNumber;
    }
    public BooleanModel getBlackAndWhite() {
        return this.blackAndWhite;
    }
}
