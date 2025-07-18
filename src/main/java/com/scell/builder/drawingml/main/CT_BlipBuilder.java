package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.CT_AlphaCeilingEffectModel;
import com.scell.model.drawingml.main.CT_AlphaFloorEffectModel;
import com.scell.model.drawingml.main.CT_AlphaInverseEffectModel;
import com.scell.model.drawingml.main.CT_AlphaModulateEffectModel;
import com.scell.model.drawingml.main.CT_AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.CT_AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.CT_BiLevelEffectModel;
import com.scell.model.drawingml.main.CT_BlipModel;
import com.scell.model.drawingml.main.CT_BlurEffectModel;
import com.scell.model.drawingml.main.CT_ColorChangeEffectModel;
import com.scell.model.drawingml.main.CT_ColorReplaceEffectModel;
import com.scell.model.drawingml.main.CT_DuotoneEffectModel;
import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import com.scell.model.drawingml.main.CT_GrayscaleEffectModel;
import com.scell.model.drawingml.main.CT_HSLEffectModel;
import com.scell.model.drawingml.main.CT_LuminanceEffectModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_TintEffectModel;
import com.scell.model.drawingml.main.ST_BlipCompressionModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;
import java.lang.Object;
import java.util.List;

public class CT_BlipBuilder {
  private ST_BlipCompressionModel cstate;

  private ST_RelationshipIdModel embed;

  private ST_RelationshipIdModel link;

  private List<CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_BlipBuilder() {
  }

  public CT_BlipBuilder setCstate(ST_BlipCompressionModel cstate) {
    this.cstate = cstate;
    return this;
  }

  public CT_BlipBuilder setEmbed(ST_RelationshipIdModel embed) {
    this.embed = embed;
    return this;
  }

  public CT_BlipBuilder setLink(ST_RelationshipIdModel link) {
    this.link = link;
    return this;
  }

  public CT_BlipBuilder setAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      List<CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor) {
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    return this;
  }

  public CT_BlipBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BlipModel build() {
    return new CT_BlipModel(this.cstate, this.embed, this.link, this.alphaBiLevelOrAlphaCeilingOrAlphaFloor, this.extLst);
  }

  public CT_BlipBuilder from(CT_BlipModel value) {
    this.cstate = value.getCstate();
    this.embed = value.getEmbed();
    this.link = value.getLink();
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder {
    private int type;

    private Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaBiLevel(
        CT_AlphaBiLevelEffectModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaCeiling(
        CT_AlphaCeilingEffectModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaFloor(
        CT_AlphaFloorEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaInv(
        CT_AlphaInverseEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaMod(
        CT_AlphaModulateEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaModFix(
        CT_AlphaModulateFixedEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaRepl(
        CT_AlphaReplaceEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setBiLevel(CT_BiLevelEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setBlur(CT_BlurEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setClrChange(
        CT_ColorChangeEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setClrRepl(
        CT_ColorReplaceEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setDuotone(CT_DuotoneEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setFillOverlay(
        CT_FillOverlayEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setGrayscl(CT_GrayscaleEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setHsl(CT_HSLEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setLum(CT_LuminanceEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setTint(CT_TintEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel build() {
      if (this.type == -1) return new CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel();
      if (this.type == 0) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaBiLevel((CT_AlphaBiLevelEffectModel) this.value);
      if (this.type == 1) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaCeiling((CT_AlphaCeilingEffectModel) this.value);
      if (this.type == 2) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaFloor((CT_AlphaFloorEffectModel) this.value);
      if (this.type == 3) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaInv((CT_AlphaInverseEffectModel) this.value);
      if (this.type == 4) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaMod((CT_AlphaModulateEffectModel) this.value);
      if (this.type == 5) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaModFix((CT_AlphaModulateFixedEffectModel) this.value);
      if (this.type == 6) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaRepl((CT_AlphaReplaceEffectModel) this.value);
      if (this.type == 7) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBiLevel((CT_BiLevelEffectModel) this.value);
      if (this.type == 8) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBlur((CT_BlurEffectModel) this.value);
      if (this.type == 9) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrChange((CT_ColorChangeEffectModel) this.value);
      if (this.type == 10) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrRepl((CT_ColorReplaceEffectModel) this.value);
      if (this.type == 11) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newDuotone((CT_DuotoneEffectModel) this.value);
      if (this.type == 12) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newFillOverlay((CT_FillOverlayEffectModel) this.value);
      if (this.type == 13) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newGrayscl((CT_GrayscaleEffectModel) this.value);
      if (this.type == 14) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newHsl((CT_HSLEffectModel) this.value);
      if (this.type == 15) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newLum((CT_LuminanceEffectModel) this.value);
      if (this.type == 16) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newTint((CT_TintEffectModel) this.value);
      return null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder from(
        CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel value) {
      this.type = -1;
      this.value = null;
      if (value.isAlphaBiLevel()) {
        this.type = 0;
        this.value = value.getAlphaBiLevel();
      }
      if (value.isAlphaCeiling()) {
        this.type = 1;
        this.value = value.getAlphaCeiling();
      }
      if (value.isAlphaFloor()) {
        this.type = 2;
        this.value = value.getAlphaFloor();
      }
      if (value.isAlphaInv()) {
        this.type = 3;
        this.value = value.getAlphaInv();
      }
      if (value.isAlphaMod()) {
        this.type = 4;
        this.value = value.getAlphaMod();
      }
      if (value.isAlphaModFix()) {
        this.type = 5;
        this.value = value.getAlphaModFix();
      }
      if (value.isAlphaRepl()) {
        this.type = 6;
        this.value = value.getAlphaRepl();
      }
      if (value.isBiLevel()) {
        this.type = 7;
        this.value = value.getBiLevel();
      }
      if (value.isBlur()) {
        this.type = 8;
        this.value = value.getBlur();
      }
      if (value.isClrChange()) {
        this.type = 9;
        this.value = value.getClrChange();
      }
      if (value.isClrRepl()) {
        this.type = 10;
        this.value = value.getClrRepl();
      }
      if (value.isDuotone()) {
        this.type = 11;
        this.value = value.getDuotone();
      }
      if (value.isFillOverlay()) {
        this.type = 12;
        this.value = value.getFillOverlay();
      }
      if (value.isGrayscl()) {
        this.type = 13;
        this.value = value.getGrayscl();
      }
      if (value.isHsl()) {
        this.type = 14;
        this.value = value.getHsl();
      }
      if (value.isLum()) {
        this.type = 15;
        this.value = value.getLum();
      }
      if (value.isTint()) {
        this.type = 16;
        this.value = value.getTint();
      }
      return this;
    }
  }
}
