package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.AlphaCeilingEffectModel;
import com.scell.model.drawingml.main.AlphaFloorEffectModel;
import com.scell.model.drawingml.main.AlphaInverseEffectModel;
import com.scell.model.drawingml.main.AlphaModulateEffectModel;
import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.BiLevelEffectModel;
import com.scell.model.drawingml.main.BlipCompressionValueModel;
import com.scell.model.drawingml.main.BlipModel;
import com.scell.model.drawingml.main.BlurEffectModel;
import com.scell.model.drawingml.main.ColorChangeEffectModel;
import com.scell.model.drawingml.main.ColorReplaceEffectModel;
import com.scell.model.drawingml.main.DuotoneEffectModel;
import com.scell.model.drawingml.main.FillOverlayEffectModel;
import com.scell.model.drawingml.main.GrayscaleEffectModel;
import com.scell.model.drawingml.main.HSLEffectModel;
import com.scell.model.drawingml.main.LuminanceEffectModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.TintEffectModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;
import java.lang.Object;
import java.util.List;

public class BlipBuilder {
  private BlipCompressionValueModel cstate;

  private RelationshipIdValueModel embed;

  private RelationshipIdValueModel link;

  private List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private OfficeArtExtensionListModel extLst;

  public BlipBuilder() {
  }

  public BlipBuilder setCstate(BlipCompressionValueModel cstate) {
    this.cstate = cstate;
    return this;
  }

  public BlipBuilder setEmbed(RelationshipIdValueModel embed) {
    this.embed = embed;
    return this;
  }

  public BlipBuilder setLink(RelationshipIdValueModel link) {
    this.link = link;
    return this;
  }

  public BlipBuilder setAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor) {
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    return this;
  }

  public BlipBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BlipModel build() {
    return new BlipModel(this.cstate, this.embed, this.link, this.alphaBiLevelOrAlphaCeilingOrAlphaFloor, this.extLst);
  }

  public BlipBuilder from(BlipModel value) {
    this.cstate = value.getCstate();
    this.embed = value.getEmbed();
    this.link = value.getLink();
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder {
    private int type;

    private Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaBiLevel(
        AlphaBiLevelEffectModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaCeiling(
        AlphaCeilingEffectModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaFloor(
        AlphaFloorEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaInv(
        AlphaInverseEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaMod(
        AlphaModulateEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setAlphaRepl(
        AlphaReplaceEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setBiLevel(BiLevelEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setBlur(BlurEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setClrChange(
        ColorChangeEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setClrRepl(
        ColorReplaceEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setDuotone(DuotoneEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setFillOverlay(
        FillOverlayEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setGrayscl(
        GrayscaleEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setHsl(HSLEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setLum(LuminanceEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder setTint(TintEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel build() {
      if (this.type == -1) return new BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel();
      if (this.type == 0) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaBiLevel((AlphaBiLevelEffectModel) this.value);
      if (this.type == 1) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaCeiling((AlphaCeilingEffectModel) this.value);
      if (this.type == 2) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaFloor((AlphaFloorEffectModel) this.value);
      if (this.type == 3) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaInv((AlphaInverseEffectModel) this.value);
      if (this.type == 4) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaMod((AlphaModulateEffectModel) this.value);
      if (this.type == 5) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaModFix((AlphaModulateFixedEffectModel) this.value);
      if (this.type == 6) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaRepl((AlphaReplaceEffectModel) this.value);
      if (this.type == 7) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newBiLevel((BiLevelEffectModel) this.value);
      if (this.type == 8) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newBlur((BlurEffectModel) this.value);
      if (this.type == 9) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newClrChange((ColorChangeEffectModel) this.value);
      if (this.type == 10) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newClrRepl((ColorReplaceEffectModel) this.value);
      if (this.type == 11) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newDuotone((DuotoneEffectModel) this.value);
      if (this.type == 12) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newFillOverlay((FillOverlayEffectModel) this.value);
      if (this.type == 13) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newGrayscl((GrayscaleEffectModel) this.value);
      if (this.type == 14) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newHsl((HSLEffectModel) this.value);
      if (this.type == 15) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newLum((LuminanceEffectModel) this.value);
      if (this.type == 16) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newTint((TintEffectModel) this.value);
      return null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueBuilder from(
        BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel value) {
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
