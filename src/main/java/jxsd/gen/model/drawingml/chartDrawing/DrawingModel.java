package jxsd.gen.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.chartDrawing.DrawingBuilder;

/**
 * This is a generated sequence class.
 */
public class DrawingModel {
  private final List<EG_Anchor> egAnchor;

  public DrawingModel(List<EG_Anchor> egAnchor) {
    this.egAnchor = egAnchor;
  }

  public DrawingBuilder builder() {
    return new DrawingBuilder().from(this);
  }

  public List<EG_Anchor> getEGAnchor() {
    return this.egAnchor;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Anchor {
    private final int type;

    private final Object value;

    public EG_Anchor() {
      this(-1, null);
    }

    private EG_Anchor(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public DrawingBuilder.EG_Anchor builder() {
      return new DrawingBuilder.EG_Anchor().from(this);
    }

    public static EG_Anchor newRelSizeAnchor(RelSizeAnchorModel value) {
      return new EG_Anchor(0, value);
    }

    public boolean isRelSizeAnchor() {
      return this.type == 0;
    }

    public RelSizeAnchorModel getRelSizeAnchor() {
      return (RelSizeAnchorModel) this.value;
    }

    public static EG_Anchor newAbsSizeAnchor(AbsSizeAnchorModel value) {
      return new EG_Anchor(1, value);
    }

    public boolean isAbsSizeAnchor() {
      return this.type == 1;
    }

    public AbsSizeAnchorModel getAbsSizeAnchor() {
      return (AbsSizeAnchorModel) this.value;
    }
  }
}
