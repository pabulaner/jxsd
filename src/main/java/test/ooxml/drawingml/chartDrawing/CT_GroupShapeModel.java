
package test.ooxml.drawingml.chartDrawing;

import test.ooxml.drawingml.chartDrawing.CT_GroupShapeNonVisualModel;
import test.ooxml.drawingml.main.CT_GroupShapePropertiesModel;
import test.ooxml.drawingml.chartDrawing.CT_ShapeModel;
import test.ooxml.drawingml.chartDrawing.CT_GroupShapeModel;
import test.ooxml.drawingml.chartDrawing.CT_GraphicFrameModel;
import test.ooxml.drawingml.chartDrawing.CT_ConnectorModel;
import test.ooxml.drawingml.chartDrawing.CT_PictureModel;


public class CT_GroupShapeModel {

public class SpOrgrpSpOrgraphicFrameModel {


    private final Object value;

    public SpOrgrpSpOrgraphicFrameModel(CT_ShapeModel value) {
        this.value = value;
    }
    public SpOrgrpSpOrgraphicFrameModel(CT_GroupShapeModel value) {
        this.value = value;
    }
    public SpOrgrpSpOrgraphicFrameModel(CT_GraphicFrameModel value) {
        this.value = value;
    }
    public SpOrgrpSpOrgraphicFrameModel(CT_ConnectorModel value) {
        this.value = value;
    }
    public SpOrgrpSpOrgraphicFrameModel(CT_PictureModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_ShapeModel getSp() {
        return (CT_ShapeModel) value;
    }
    public CT_GroupShapeModel getGrpSp() {
        return (CT_GroupShapeModel) value;
    }
    public CT_GraphicFrameModel getGraphicFrame() {
        return (CT_GraphicFrameModel) value;
    }
    public CT_ConnectorModel getCxnSp() {
        return (CT_ConnectorModel) value;
    }
    public CT_PictureModel getPic() {
        return (CT_PictureModel) value;
    }
}

    private final CT_GroupShapeNonVisualModel nvGrpSpPr;
    private final CT_GroupShapePropertiesModel grpSpPr;
    private final SpOrgrpSpOrgraphicFrameModel spOrgrpSpOrgraphicFrame;

    public CT_GroupShapeModel(CT_GroupShapeNonVisualModel nvGrpSpPr, CT_GroupShapePropertiesModel grpSpPr, SpOrgrpSpOrgraphicFrameModel spOrgrpSpOrgraphicFrame) {
        this.nvGrpSpPr = nvGrpSpPr;
        this.grpSpPr = grpSpPr;
        this.spOrgrpSpOrgraphicFrame = spOrgrpSpOrgraphicFrame;
    }

    public CT_GroupShapeNonVisualModel getNvGrpSpPr() {
        return this.nvGrpSpPr;
    }
    public CT_GroupShapePropertiesModel getGrpSpPr() {
        return this.grpSpPr;
    }
    public SpOrgrpSpOrgraphicFrameModel getSpOrgrpSpOrgraphicFrame() {
        return this.spOrgrpSpOrgraphicFrame;
    }
}
