package com.scell.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class DrawingModel {
  private final List<AnchorModel> egAnchor;

  public DrawingModel(List<AnchorModel> egAnchor) {
    this.egAnchor = egAnchor;
  }

  public List<AnchorModel> getEGAnchor() {
    return this.egAnchor;
  }

  public static class AnchorModel {
    private final int type;

    private final Object value;

    public AnchorModel() {
      this(-1, null);
    }

    private AnchorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AnchorModel newRelSizeAnchor(RelSizeAnchorModel value) {
      return new AnchorModel(0, value);
    }

    public boolean isRelSizeAnchor() {
      return this.type == 0;
    }

    public RelSizeAnchorModel getRelSizeAnchor() {
      return (RelSizeAnchorModel) this.value;
    }

    public static AnchorModel newAbsSizeAnchor(AbsSizeAnchorModel value) {
      return new AnchorModel(1, value);
    }

    public boolean isAbsSizeAnchor() {
      return this.type == 1;
    }

    public AbsSizeAnchorModel getAbsSizeAnchor() {
      return (AbsSizeAnchorModel) this.value;
    }
  }
}
