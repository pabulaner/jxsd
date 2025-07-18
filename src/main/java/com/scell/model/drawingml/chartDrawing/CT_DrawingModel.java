package com.scell.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_DrawingModel {
  private final List<EG_AnchorModel> egAnchor;

  public CT_DrawingModel(List<EG_AnchorModel> egAnchor) {
    this.egAnchor = egAnchor;
  }

  public List<EG_AnchorModel> getEGAnchor() {
    return this.egAnchor;
  }

  public static class EG_AnchorModel {
    private final int type;

    private final Object value;

    public EG_AnchorModel() {
      this(-1, null);
    }

    private EG_AnchorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_AnchorModel newRelSizeAnchor(CT_RelSizeAnchorModel value) {
      return new EG_AnchorModel(0, value);
    }

    public boolean isRelSizeAnchor() {
      return this.type == 0;
    }

    public CT_RelSizeAnchorModel getRelSizeAnchor() {
      return (CT_RelSizeAnchorModel) this.value;
    }

    public static EG_AnchorModel newAbsSizeAnchor(CT_AbsSizeAnchorModel value) {
      return new EG_AnchorModel(1, value);
    }

    public boolean isAbsSizeAnchor() {
      return this.type == 1;
    }

    public CT_AbsSizeAnchorModel getAbsSizeAnchor() {
      return (CT_AbsSizeAnchorModel) this.value;
    }
  }
}
