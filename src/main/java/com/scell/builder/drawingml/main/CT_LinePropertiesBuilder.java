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

  private CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  private CT_LinePropertiesModel.PrstDashOrCustDashModel prstDashOrCustDash;

  private CT_LinePropertiesModel.RoundOrBevelOrMiterModel roundOrBevelOrMiter;

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

  public CT_LinePropertiesBuilder setNoFillOrSolidFillOrGradFill(
      CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    return this;
  }

  public CT_LinePropertiesBuilder setPrstDashOrCustDash(
      CT_LinePropertiesModel.PrstDashOrCustDashModel prstDashOrCustDash) {
    this.prstDashOrCustDash = prstDashOrCustDash;
    return this;
  }

  public CT_LinePropertiesBuilder setRoundOrBevelOrMiter(
      CT_LinePropertiesModel.RoundOrBevelOrMiterModel roundOrBevelOrMiter) {
    this.roundOrBevelOrMiter = roundOrBevelOrMiter;
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
    return new CT_LinePropertiesModel(this.w, this.cap, this.cmpd, this.algn, this.noFillOrSolidFillOrGradFill, this.prstDashOrCustDash, this.roundOrBevelOrMiter, this.headEnd, this.tailEnd, this.extLst);
  }

  public CT_LinePropertiesBuilder from(CT_LinePropertiesModel value) {
    this.w = value.getW();
    this.cap = value.getCap();
    this.cmpd = value.getCmpd();
    this.algn = value.getAlgn();
    this.noFillOrSolidFillOrGradFill = value.getNoFillOrSolidFillOrGradFill();
    this.prstDashOrCustDash = value.getPrstDashOrCustDash();
    this.roundOrBevelOrMiter = value.getRoundOrBevelOrMiter();
    this.headEnd = value.getHeadEnd();
    this.tailEnd = value.getTailEnd();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class NoFillOrSolidFillOrGradFillBuilder {
    private int type;

    private Object value;

    public NoFillOrSolidFillOrGradFillBuilder() {
      this.type = -1;
      this.value = null;
    }

    public NoFillOrSolidFillOrGradFillBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel();
      if (this.type == 0) return CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      return null;
    }

    public NoFillOrSolidFillOrGradFillBuilder from(
        CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
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

  public static class PrstDashOrCustDashBuilder {
    private int type;

    private Object value;

    public PrstDashOrCustDashBuilder() {
      this.type = -1;
      this.value = null;
    }

    public PrstDashOrCustDashBuilder setPrstDash(CT_PresetLineDashPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public PrstDashOrCustDashBuilder setCustDash(CT_DashStopListModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.PrstDashOrCustDashModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.PrstDashOrCustDashModel();
      if (this.type == 0) return CT_LinePropertiesModel.PrstDashOrCustDashModel.newPrstDash((CT_PresetLineDashPropertiesModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.PrstDashOrCustDashModel.newCustDash((CT_DashStopListModel) this.value);
      return null;
    }

    public PrstDashOrCustDashBuilder from(CT_LinePropertiesModel.PrstDashOrCustDashModel value) {
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

  public static class RoundOrBevelOrMiterBuilder {
    private int type;

    private Object value;

    public RoundOrBevelOrMiterBuilder() {
      this.type = -1;
      this.value = null;
    }

    public RoundOrBevelOrMiterBuilder setRound(CT_LineJoinRoundModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public RoundOrBevelOrMiterBuilder setBevel(CT_LineJoinBevelModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public RoundOrBevelOrMiterBuilder setMiter(CT_LineJoinMiterPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_LinePropertiesModel.RoundOrBevelOrMiterModel build() {
      if (this.type == -1) return new CT_LinePropertiesModel.RoundOrBevelOrMiterModel();
      if (this.type == 0) return CT_LinePropertiesModel.RoundOrBevelOrMiterModel.newRound((CT_LineJoinRoundModel) this.value);
      if (this.type == 1) return CT_LinePropertiesModel.RoundOrBevelOrMiterModel.newBevel((CT_LineJoinBevelModel) this.value);
      if (this.type == 2) return CT_LinePropertiesModel.RoundOrBevelOrMiterModel.newMiter((CT_LineJoinMiterPropertiesModel) this.value);
      return null;
    }

    public RoundOrBevelOrMiterBuilder from(CT_LinePropertiesModel.RoundOrBevelOrMiterModel value) {
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
