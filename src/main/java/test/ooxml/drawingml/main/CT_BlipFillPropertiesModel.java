
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.UnsignedIntModel;
import test.ooxml.drawingml.main.CT_BlipModel;
import test.ooxml.drawingml.main.CT_RelativeRectModel;


public class CT_BlipFillPropertiesModel {


    private final BooleanModel rotWithShape;
    private final UnsignedIntModel dpi;
    private final CT_BlipModel blip;
    private final CT_RelativeRectModel srcRect;

    public CT_BlipFillPropertiesModel(BooleanModel rotWithShape, UnsignedIntModel dpi, CT_BlipModel blip, CT_RelativeRectModel srcRect) {
        this.rotWithShape = rotWithShape;
        this.dpi = dpi;
        this.blip = blip;
        this.srcRect = srcRect;
    }

    public BooleanModel getRotWithShape() {
        return this.rotWithShape;
    }
    public UnsignedIntModel getDpi() {
        return this.dpi;
    }
    public CT_BlipModel getBlip() {
        return this.blip;
    }
    public CT_RelativeRectModel getSrcRect() {
        return this.srcRect;
    }
}
