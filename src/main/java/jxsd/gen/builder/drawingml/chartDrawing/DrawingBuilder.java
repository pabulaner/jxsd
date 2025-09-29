package jxsd.gen.builder.drawingml.chartDrawing;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import jxsd.gen.model.drawingml.chartDrawing.DrawingModel;
import jxsd.gen.model.drawingml.chartDrawing.RelSizeAnchorModel;

/**
 * This is a generated sequence class.
 */
public class DrawingBuilder {
  private List<DrawingModel.EG_Anchor> egAnchor;

  public DrawingBuilder() {
  }

  public DrawingBuilder setEGAnchor(List<DrawingModel.EG_Anchor> egAnchor) {
    this.egAnchor = egAnchor;
    return this;
  }

  public DrawingBuilder from(DrawingModel value) {
    this.egAnchor = value.getEGAnchor();
    return this;
  }

  public DrawingModel build() {
    return new DrawingModel(this.egAnchor);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Anchor {
    private int type;

    private Object value;

    public EG_Anchor() {
      this.type = -1;
      this.value = null;
    }

    public EG_Anchor setRelSizeAnchor(RelSizeAnchorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_Anchor setAbsSizeAnchor(AbsSizeAnchorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_Anchor from(DrawingModel.EG_Anchor value) {
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

    public DrawingModel.EG_Anchor build() {
      if (this.type == -1) return new DrawingModel.EG_Anchor();
      if (this.type == 0) return DrawingModel.EG_Anchor.newRelSizeAnchor((RelSizeAnchorModel) this.value);
      if (this.type == 1) return DrawingModel.EG_Anchor.newAbsSizeAnchor((AbsSizeAnchorModel) this.value);
      return null;
    }
  }
}
