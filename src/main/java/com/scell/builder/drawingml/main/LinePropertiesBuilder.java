package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CompoundLineModel;
import com.scell.model.drawingml.main.DashStopListModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.LineCapModel;
import com.scell.model.drawingml.main.LineEndPropertiesModel;
import com.scell.model.drawingml.main.LineJoinBevelModel;
import com.scell.model.drawingml.main.LineJoinMiterPropertiesModel;
import com.scell.model.drawingml.main.LineJoinRoundModel;
import com.scell.model.drawingml.main.LinePropertiesModel;
import com.scell.model.drawingml.main.LineWidthModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.PenAlignmentModel;
import com.scell.model.drawingml.main.PresetLineDashPropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import java.lang.Object;

public class LinePropertiesBuilder {
  private LineWidthModel w;

  private LineCapModel cap;

  private CompoundLineModel cmpd;

  private PenAlignmentModel algn;

  private LinePropertiesModel.LineFillPropertiesModel egLineFillProperties;

  private LinePropertiesModel.LineDashPropertiesModel egLineDashProperties;

  private LinePropertiesModel.LineJoinPropertiesModel egLineJoinProperties;

  private LineEndPropertiesModel headEnd;

  private LineEndPropertiesModel tailEnd;

  private OfficeArtExtensionListModel extLst;

  public LinePropertiesBuilder() {
  }

  public LinePropertiesBuilder setW(LineWidthModel w) {
    this.w = w;
    return this;
  }

  public LinePropertiesBuilder setCap(LineCapModel cap) {
    this.cap = cap;
    return this;
  }

  public LinePropertiesBuilder setCmpd(CompoundLineModel cmpd) {
    this.cmpd = cmpd;
    return this;
  }

  public LinePropertiesBuilder setAlgn(PenAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public LinePropertiesBuilder setEGLineFillProperties(
      LinePropertiesModel.LineFillPropertiesModel egLineFillProperties) {
    this.egLineFillProperties = egLineFillProperties;
    return this;
  }

  public LinePropertiesBuilder setEGLineDashProperties(
      LinePropertiesModel.LineDashPropertiesModel egLineDashProperties) {
    this.egLineDashProperties = egLineDashProperties;
    return this;
  }

  public LinePropertiesBuilder setEGLineJoinProperties(
      LinePropertiesModel.LineJoinPropertiesModel egLineJoinProperties) {
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

  public LinePropertiesModel build() {
    return new LinePropertiesModel(this.w, this.cap, this.cmpd, this.algn, this.egLineFillProperties, this.egLineDashProperties, this.egLineJoinProperties, this.headEnd, this.tailEnd, this.extLst);
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

  public static class LineFillPropertiesBuilder {
    private int type;

    private Object value;

    public LineFillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public LineFillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public LineFillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public LineFillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public LineFillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public LinePropertiesModel.LineFillPropertiesModel build() {
      if (this.type == -1) return new LinePropertiesModel.LineFillPropertiesModel();
      if (this.type == 0) return LinePropertiesModel.LineFillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return LinePropertiesModel.LineFillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return LinePropertiesModel.LineFillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return LinePropertiesModel.LineFillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      return null;
    }

    public LineFillPropertiesBuilder from(LinePropertiesModel.LineFillPropertiesModel value) {
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
  }

  public static class LineDashPropertiesBuilder {
    private int type;

    private Object value;

    public LineDashPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public LineDashPropertiesBuilder setPrstDash(PresetLineDashPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public LineDashPropertiesBuilder setCustDash(DashStopListModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public LinePropertiesModel.LineDashPropertiesModel build() {
      if (this.type == -1) return new LinePropertiesModel.LineDashPropertiesModel();
      if (this.type == 0) return LinePropertiesModel.LineDashPropertiesModel.newPrstDash((PresetLineDashPropertiesModel) this.value);
      if (this.type == 1) return LinePropertiesModel.LineDashPropertiesModel.newCustDash((DashStopListModel) this.value);
      return null;
    }

    public LineDashPropertiesBuilder from(LinePropertiesModel.LineDashPropertiesModel value) {
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
  }

  public static class LineJoinPropertiesBuilder {
    private int type;

    private Object value;

    public LineJoinPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public LineJoinPropertiesBuilder setRound(LineJoinRoundModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public LineJoinPropertiesBuilder setBevel(LineJoinBevelModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public LineJoinPropertiesBuilder setMiter(LineJoinMiterPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public LinePropertiesModel.LineJoinPropertiesModel build() {
      if (this.type == -1) return new LinePropertiesModel.LineJoinPropertiesModel();
      if (this.type == 0) return LinePropertiesModel.LineJoinPropertiesModel.newRound((LineJoinRoundModel) this.value);
      if (this.type == 1) return LinePropertiesModel.LineJoinPropertiesModel.newBevel((LineJoinBevelModel) this.value);
      if (this.type == 2) return LinePropertiesModel.LineJoinPropertiesModel.newMiter((LineJoinMiterPropertiesModel) this.value);
      return null;
    }

    public LineJoinPropertiesBuilder from(LinePropertiesModel.LineJoinPropertiesModel value) {
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
  }
}
