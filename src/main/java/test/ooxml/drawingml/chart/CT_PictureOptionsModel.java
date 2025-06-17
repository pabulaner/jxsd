
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_PictureFormatModel;
import test.ooxml.drawingml.chart.CT_PictureStackUnitModel;


public class CT_PictureOptionsModel {


    private final CT_BooleanModel applyToFront;
    private final CT_BooleanModel applyToSides;
    private final CT_BooleanModel applyToEnd;
    private final CT_PictureFormatModel pictureFormat;
    private final CT_PictureStackUnitModel pictureStackUnit;

    public CT_PictureOptionsModel(CT_BooleanModel applyToFront, CT_BooleanModel applyToSides, CT_BooleanModel applyToEnd, CT_PictureFormatModel pictureFormat, CT_PictureStackUnitModel pictureStackUnit) {
        this.applyToFront = applyToFront;
        this.applyToSides = applyToSides;
        this.applyToEnd = applyToEnd;
        this.pictureFormat = pictureFormat;
        this.pictureStackUnit = pictureStackUnit;
    }

    public CT_BooleanModel getApplyToFront() {
        return this.applyToFront;
    }
    public CT_BooleanModel getApplyToSides() {
        return this.applyToSides;
    }
    public CT_BooleanModel getApplyToEnd() {
        return this.applyToEnd;
    }
    public CT_PictureFormatModel getPictureFormat() {
        return this.pictureFormat;
    }
    public CT_PictureStackUnitModel getPictureStackUnit() {
        return this.pictureStackUnit;
    }
}
