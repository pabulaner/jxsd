
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TileFlipModeModel;
import test.ooxml.drawingml.main.CT_GradientStopListModel;
import test.ooxml.drawingml.main.CT_RelativeRectModel;


public class CT_GradientFillPropertiesModel {


    private final BooleanModel rotWithShape;
    private final ST_TileFlipModeModel flip;
    private final CT_GradientStopListModel gsLst;
    private final CT_RelativeRectModel tileRect;

    public CT_GradientFillPropertiesModel(BooleanModel rotWithShape, ST_TileFlipModeModel flip, CT_GradientStopListModel gsLst, CT_RelativeRectModel tileRect) {
        this.rotWithShape = rotWithShape;
        this.flip = flip;
        this.gsLst = gsLst;
        this.tileRect = tileRect;
    }

    public BooleanModel getRotWithShape() {
        return this.rotWithShape;
    }
    public ST_TileFlipModeModel getFlip() {
        return this.flip;
    }
    public CT_GradientStopListModel getGsLst() {
        return this.gsLst;
    }
    public CT_RelativeRectModel getTileRect() {
        return this.tileRect;
    }
}
