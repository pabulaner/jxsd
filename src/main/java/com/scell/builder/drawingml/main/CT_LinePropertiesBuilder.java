package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_DashStopListModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_LineEndPropertiesModel;
import com.scell.model.drawingml.main.CT_LineJoinBevelModel;
import com.scell.model.drawingml.main.CT_LineJoinMiterPropertiesModel;
import com.scell.model.drawingml.main.CT_LineJoinRoundModel;
import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_PresetLineDashPropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.ST_CompoundLineModel;
import com.scell.model.drawingml.main.ST_LineCapModel;
import com.scell.model.drawingml.main.ST_LineWidthModel;
import com.scell.model.drawingml.main.ST_PenAlignmentModel;
import java.lang.Object;

public class CT_LinePropertiesBuilder {
  private ST_LineWidthModel w;

  private ST_LineCapModel cap;

  private ST_CompoundLineModel cmpd;

  private ST_PenAlignmentModel algn;

  private CT_LinePropertiesModel.EG_LineFillPropertiesModel egLineFillProperties;

  private CT_LinePropertiesModel.EG_LineDashPropertiesModel egLineDashProperties;

  private CT_LinePropertiesModel.EG_LineJoinPropertiesModel egLineJoinProperties;

  private CT_LineEndPropertiesModel headEnd;

  private CT_LineEndPropertiesModel tailEnd;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_LinePropertiesBuilder() {
  }

  public CT_LinePropertiesBuilder setW(ST_LineWidthModel w) {
    this.w = w;
    return this;
  }

  public CT_LinePropertiesBuilder setCap(ST_LineCapModel cap) {
    this.cap = cap;
    return this;
  }

  public CT_LinePropertiesBuilder setCmpd(ST_CompoundLineModel cmpd) {
    this.cmpd = cmpd;
    return this;
  }

  public CT_LinePropertiesBuilder setAlgn(ST_PenAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_LinePropertiesBuilder setEGLineFillProperties(
      CT_LinePropertiesModel.EG_LineFillPropertiesModel egLineFillProperties) {
    this.egLineFillProperties = egLineFillProperties;
    return this;
  }

  public CT_LinePropertiesBuilder setEGLineDashProperties(
      CT_LinePropertiesModel.EG_LineDashPropertiesModel egLineDashProperties) {
    this.egLineDashProperties = egLineDashProperties;
    return this;
  }

  public CT_LinePropertiesBuilder setEGLineJoinProperties(
      CT_LinePropertiesModel.EG_LineJoinPropertiesModel egLineJoinProperties) {
    this.egLineJoinProperties = egLineJoinProperties;
    return this;
  }

  public CT_LinePropertiesBuilder setHeadEnd(CT_LineEndPropertiesModel headEnd) {
    this.headEnd = headEnd;
    return this;
  }

  public CT_LinePropertiesBuilder setTailEnd(CT_LineEndPropertiesModel tailEnd) {
    this.tailEnd = tailEnd;
    return this;
  }

  public CT_LinePropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LinePropertiesModel build() {
    return new CT_LinePropertiesModel(this.w, this.cap, this.cmpd, this.algn, this.egLineFillProperties, this.egLineDashProperties, this.egLineJoinProperties, this.headEnd, this.tailEnd, this.extLst);
  }

  public CT_LinePropertiesBuilder from(CT_LinePropertiesModel value) {
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

  public static class EG_LineFillPropertiesBuilder {
    private int type;

    private Object value;

    public EG_LineFillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineFillPropertiesBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineFillPropertiesBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_LineFillPropertiesBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_LineFillPropertiesBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.EG_LineFillPropertiesModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.EG_LineFillPropertiesModel();
      if (this.type == 0) return CT_LinePropertiesModel.EG_LineFillPropertiesModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.EG_LineFillPropertiesModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_LinePropertiesModel.EG_LineFillPropertiesModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_LinePropertiesModel.EG_LineFillPropertiesModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      return null;
    }

    public EG_LineFillPropertiesBuilder from(
        CT_LinePropertiesModel.EG_LineFillPropertiesModel value) {
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

  public static class EG_LineDashPropertiesBuilder {
    private int type;

    private Object value;

    public EG_LineDashPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineDashPropertiesBuilder setPrstDash(CT_PresetLineDashPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineDashPropertiesBuilder setCustDash(CT_DashStopListModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.EG_LineDashPropertiesModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.EG_LineDashPropertiesModel();
      if (this.type == 0) return CT_LinePropertiesModel.EG_LineDashPropertiesModel.newPrstDash((CT_PresetLineDashPropertiesModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.EG_LineDashPropertiesModel.newCustDash((CT_DashStopListModel) this.value);
      return null;
    }

    public EG_LineDashPropertiesBuilder from(
        CT_LinePropertiesModel.EG_LineDashPropertiesModel value) {
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

  public static class EG_LineJoinPropertiesBuilder {
    private int type;

    private Object value;

    public EG_LineJoinPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_LineJoinPropertiesBuilder setRound(CT_LineJoinRoundModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_LineJoinPropertiesBuilder setBevel(CT_LineJoinBevelModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_LineJoinPropertiesBuilder setMiter(CT_LineJoinMiterPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.EG_LineJoinPropertiesModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.EG_LineJoinPropertiesModel();
      if (this.type == 0) return CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newRound((CT_LineJoinRoundModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newBevel((CT_LineJoinBevelModel) this.value);
      if (this.type == 2) return CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newMiter((CT_LineJoinMiterPropertiesModel) this.value);
      return null;
    }

    public EG_LineJoinPropertiesBuilder from(
        CT_LinePropertiesModel.EG_LineJoinPropertiesModel value) {
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
