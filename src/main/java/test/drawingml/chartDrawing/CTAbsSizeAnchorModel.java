package test.drawingml.chartDrawing;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.drawingml.main.CTPositiveSize2DModel;

public class CTAbsSizeAnchorModel {
  private final CTMarkerModel from;

  private final CTPositiveSize2DModel ext;

  private final SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

  public CTAbsSizeAnchorModel(CTMarkerModel from, CTPositiveSize2DModel ext,
      SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
    this.from = from;
    this.ext = ext;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public CTMarkerModel getFrom() {
    return this.from;
  }

  public CTPositiveSize2DModel getExt() {
    return this.ext;
  }

  public SpOrGrpSpOrGraphicFrameModel getSpOrGrpSpOrGraphicFrame() {
    return this.spOrGrpSpOrGraphicFrame;
  }

  public static class SpOrGrpSpOrGraphicFrameModel {
    private final Integer type;

    private final Object value;

    public SpOrGrpSpOrGraphicFrameModel() {
      this(-1, null);
    }

    private SpOrGrpSpOrGraphicFrameModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newSp(CTShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(0, value);
    }

    public Boolean isSp() {
      return this.type == 0;
    }

    public CTShapeModel getSp() {
      return (CTShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newGrpSp(CTGroupShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(1, value);
    }

    public Boolean isGrpSp() {
      return this.type == 1;
    }

    public CTGroupShapeModel getGrpSp() {
      return (CTGroupShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newGraphicFrame(CTGraphicFrameModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(2, value);
    }

    public Boolean isGraphicFrame() {
      return this.type == 2;
    }

    public CTGraphicFrameModel getGraphicFrame() {
      return (CTGraphicFrameModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newCxnSp(CTConnectorModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(3, value);
    }

    public Boolean isCxnSp() {
      return this.type == 3;
    }

    public CTConnectorModel getCxnSp() {
      return (CTConnectorModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newPic(CTPictureModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(4, value);
    }

    public Boolean isPic() {
      return this.type == 4;
    }

    public CTPictureModel getPic() {
      return (CTPictureModel) this.value;
    }
  }
}
