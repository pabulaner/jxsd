package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.DrawingModel;
import com.scell.model.drawingml.chartDrawing.RelSizeAnchorModel;
import java.lang.Object;
import java.util.List;

public class DrawingBuilder {
  private List<DrawingModel.AnchorModel> egAnchor;

  public DrawingBuilder() {
  }

  public DrawingBuilder setEGAnchor(List<DrawingModel.AnchorModel> egAnchor) {
    this.egAnchor = egAnchor;
    return this;
  }

  public DrawingModel build() {
    return new DrawingModel(this.egAnchor);
  }

  public DrawingBuilder from(DrawingModel value) {
    this.egAnchor = value.getEGAnchor();
    return this;
  }

  public static class AnchorBuilder {
    private int type;

    private Object value;

    public AnchorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AnchorBuilder setRelSizeAnchor(RelSizeAnchorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AnchorBuilder setAbsSizeAnchor(AbsSizeAnchorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DrawingModel.AnchorModel build() {
      if (this.type == -1) return new DrawingModel.AnchorModel();
      if (this.type == 0) return DrawingModel.AnchorModel.newRelSizeAnchor((RelSizeAnchorModel) this.value);
      if (this.type == 1) return DrawingModel.AnchorModel.newAbsSizeAnchor((AbsSizeAnchorModel) this.value);
      return null;
    }

    public AnchorBuilder from(DrawingModel.AnchorModel value) {
      this.type = -1;
      this.value = null;
      if (value.isRelSizeAnchor()) {
        this.type = 0;
        this.value = value.getRelSizeAnchor();
      }
      if (value.isAbsSizeAnchor()) {
        this.type = 1;
        this.value = value.getAbsSizeAnchor();
      }
      return this;
    }
  }
}
