
package test.ooxml.drawingml.picture;

import test.ooxml.drawingml.picture.CT_PictureNonVisualModel;
import test.ooxml.drawingml.main.CT_BlipFillPropertiesModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;


public class CT_PictureModel {


    private final CT_PictureNonVisualModel nvPicPr;
    private final CT_BlipFillPropertiesModel blipFill;
    private final CT_ShapePropertiesModel spPr;

    public CT_PictureModel(CT_PictureNonVisualModel nvPicPr, CT_BlipFillPropertiesModel blipFill, CT_ShapePropertiesModel spPr) {
        this.nvPicPr = nvPicPr;
        this.blipFill = blipFill;
        this.spPr = spPr;
    }

    public CT_PictureNonVisualModel getNvPicPr() {
        return this.nvPicPr;
    }
    public CT_BlipFillPropertiesModel getBlipFill() {
        return this.blipFill;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
}
