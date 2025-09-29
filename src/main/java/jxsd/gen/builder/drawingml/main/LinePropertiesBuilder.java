package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.CompoundLineValueModel;
import jxsd.gen.model.drawingml.main.DashStopListModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.LineCapValueModel;
import jxsd.gen.model.drawingml.main.LineEndPropertiesModel;
import jxsd.gen.model.drawingml.main.LineJoinBevelModel;
import jxsd.gen.model.drawingml.main.LineJoinMiterPropertiesModel;
import jxsd.gen.model.drawingml.main.LineJoinRoundModel;
import jxsd.gen.model.drawingml.main.LinePropertiesModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.PenAlignmentValueModel;
import jxsd.gen.model.drawingml.main.PresetLineDashPropertiesModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class LinePropertiesBuilder {
  private int w;

  private LineCapValueModel cap;

  private CompoundLineValueModel cmpd;

  private PenAlignmentValueModel algn;

  private LinePropertiesModel.EG_LineFillProperties egLineFillProperties;

  private LinePropertiesModel.EG_LineDashProperties egLineDashProperties;

  private LinePropertiesModel.EG_LineJoinProperties egLineJoinProperties;

  private LineEndPropertiesModel headEnd;

  private LineEndPropertiesModel tailEnd;

  private OfficeArtExtensionListModel extLst;

  public LinePropertiesBuilder() {
  }

  public LinePropertiesBuilder setW(int w) {
    this.w = w;
    return this;
  }

  public LinePropertiesBuilder setCap(LineCapValueModel cap) {
    this.cap = cap;
    return this;
  }

  public LinePropertiesBuilder setCmpd(CompoundLineValueModel cmpd) {
    this.cmpd = cmpd;
    return this;
  }

  public LinePropertiesBuilder setAlgn(PenAlignmentValueModel algn) {
    this.algn = algn;
    return this;
  }

  public LinePropertiesBuilder setEGLineFillProperties(
      LinePropertiesModel.EG_LineFillProperties egLineFillProperties) {
    this.egLineFillProperties = egLineFillProperties;
    return this;
  }

  public LinePropertiesBuilder setEGLineDashProperties(
      LinePropertiesModel.EG_LineDashProperties egLineDashProperties) {
    this.egLineDashProperties = egLineDashProperties;
    return this;
  }

  public LinePropertiesBuilder setEGLineJoinProperties(
      LinePropertiesModel.EG_LineJoinProperties egLineJoinProperties) {
    this.egLineJoinProperties = egLineJoinProperties;
    return this;
  }

  public LinePropertiesBuilder setHeadEnd(LineEndPropertiesModel headEnd) {
    this.headEnd = headEnd;
    return this;
  }

  public LinePropertiesBuilder setTailEnd(LineEndPropertiesModel tailEnd) {
    this.tailEnd = tailEnd;
    return this;
  }

  public LinePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LinePropertiesBuilder from(LinePropertiesModel value) {
    this.w = value.getW();
    this.cap = value.getCap();
    this.cmpd = value.getCmpd();
    this.algn = value.getAlgn();
    this.egLineFillProperties = value.getEGLineFillProperties();
    this.egLineDashProperties = value.getEGLineDashProperties();
    this.egLineJoinProperties = value.getEGLineJoinProperties();
    this.headEnd = value.getHeadEnd();
    this.tailEnd = value.getTailEnd();
    this.extLst = value.getExtLst();
    return this;
  }

  public LinePropertiesModel build() {
    return new LinePropertiesModel(this.w, this.cap, this.cmpd, this.algn, this.egLineFillProperties, this.egLineDashProperties, this.egLineJoinProperties, this.headEnd, this.tailEnd, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineFillProperties {
    private int type;

    private Object value;

    public EG_LineFillProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineFillProperties setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineFillProperties setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_LineFillProperties setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_LineFillProperties setPattFill(PatternFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_LineFillProperties from(LinePropertiesModel.EG_LineFillProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isPattFill()) {
        this.type = 3;
        this.value = value.getPattFill();
      }
      return this;
    }

    public LinePropertiesModel.EG_LineFillProperties build() {
      if (this.type == -1) return new LinePropertiesModel.EG_LineFillProperties();
      if (this.type == 0) return LinePropertiesModel.EG_LineFillProperties.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return LinePropertiesModel.EG_LineFillProperties.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return LinePropertiesModel.EG_LineFillProperties.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return LinePropertiesModel.EG_LineFillProperties.newPattFill((PatternFillPropertiesModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineDashProperties {
    private int type;

    private Object value;

    public EG_LineDashProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineDashProperties setPrstDash(PresetLineDashPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineDashProperties setCustDash(DashStopListModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_LineDashProperties from(LinePropertiesModel.EG_LineDashProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isPrstDash()) {
        this.type = 0;
        this.value = value.getPrstDash();
      }
      if (value.isCustDash()) {
        this.type = 1;
        this.value = value.getCustDash();
      }
      return this;
    }

    public LinePropertiesModel.EG_LineDashProperties build() {
      if (this.type == -1) return new LinePropertiesModel.EG_LineDashProperties();
      if (this.type == 0) return LinePropertiesModel.EG_LineDashProperties.newPrstDash((PresetLineDashPropertiesModel) this.value);
      if (this.type == 1) return LinePropertiesModel.EG_LineDashProperties.newCustDash((DashStopListModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_LineJoinProperties {
    private int type;

    private Object value;

    public EG_LineJoinProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineJoinProperties setRound(LineJoinRoundModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineJoinProperties setBevel(LineJoinBevelModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_LineJoinProperties setMiter(LineJoinMiterPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_LineJoinProperties from(LinePropertiesModel.EG_LineJoinProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isRound()) {
        this.type = 0;
        this.value = value.getRound();
      }
      if (value.isBevel()) {
        this.type = 1;
        this.value = value.getBevel();
      }
      if (value.isMiter()) {
        this.type = 2;
        this.value = value.getMiter();
      }
      return this;
    }

    public LinePropertiesModel.EG_LineJoinProperties build() {
      if (this.type == -1) return new LinePropertiesModel.EG_LineJoinProperties();
      if (this.type == 0) return LinePropertiesModel.EG_LineJoinProperties.newRound((LineJoinRoundModel) this.value);
      if (this.type == 1) return LinePropertiesModel.EG_LineJoinProperties.newBevel((LineJoinBevelModel) this.value);
      if (this.type == 2) return LinePropertiesModel.EG_LineJoinProperties.newMiter((LineJoinMiterPropertiesModel) this.value);
      return null;
    }
  }
}
