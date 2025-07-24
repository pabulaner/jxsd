package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.AlphaCeilingEffectModel;
import com.scell.model.drawingml.main.AlphaFloorEffectModel;
import com.scell.model.drawingml.main.AlphaInverseEffectModel;
import com.scell.model.drawingml.main.AlphaModulateEffectModel;
import com.scell.model.drawingml.main.AlphaModulateFixedEffectModel;
import com.scell.model.drawingml.main.AlphaReplaceEffectModel;
import com.scell.model.drawingml.main.BiLevelEffectModel;
import com.scell.model.drawingml.main.BlipCompressionModel;
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
import com.scell.model.officeDocument.relationships.RelationshipIdModel;
import java.lang.Object;
import java.util.List;

public class BlipBuilder {
  private BlipCompressionModel cstate;

  private RelationshipIdModel embed;

  private RelationshipIdModel link;

  private List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private OfficeArtExtensionListModel extLst;

  public BlipBuilder() {
  }

  public BlipBuilder setCstate(BlipCompressionModel cstate) {
    this.cstate = cstate;
    return this;
  }

  public BlipBuilder setEmbed(RelationshipIdModel embed) {
    this.embed = embed;
    return this;
  }

  public BlipBuilder setLink(RelationshipIdModel link) {
    this.link = link;
    return this;
  }

  public BlipBuilder setAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor) {
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

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder {
    private int type;

    private Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaBiLevel(
        AlphaBiLevelEffectModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaCeiling(
        AlphaCeilingEffectModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaFloor(
        AlphaFloorEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaInv(
        AlphaInverseEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaMod(
        AlphaModulateEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setAlphaRepl(
        AlphaReplaceEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setBiLevel(BiLevelEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setBlur(BlurEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setClrChange(
        ColorChangeEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setClrRepl(ColorReplaceEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setDuotone(DuotoneEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setFillOverlay(
        FillOverlayEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setGrayscl(GrayscaleEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setHsl(HSLEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setLum(LuminanceEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder setTint(TintEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel build() {
      if (this.type == -1) return new BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel();
      if (this.type == 0) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaBiLevel((AlphaBiLevelEffectModel) this.value);
      if (this.type == 1) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaCeiling((AlphaCeilingEffectModel) this.value);
      if (this.type == 2) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaFloor((AlphaFloorEffectModel) this.value);
      if (this.type == 3) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaInv((AlphaInverseEffectModel) this.value);
      if (this.type == 4) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaMod((AlphaModulateEffectModel) this.value);
      if (this.type == 5) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaModFix((AlphaModulateFixedEffectModel) this.value);
      if (this.type == 6) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaRepl((AlphaReplaceEffectModel) this.value);
      if (this.type == 7) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBiLevel((BiLevelEffectModel) this.value);
      if (this.type == 8) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBlur((BlurEffectModel) this.value);
      if (this.type == 9) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrChange((ColorChangeEffectModel) this.value);
      if (this.type == 10) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrRepl((ColorReplaceEffectModel) this.value);
      if (this.type == 11) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newDuotone((DuotoneEffectModel) this.value);
      if (this.type == 12) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newFillOverlay((FillOverlayEffectModel) this.value);
      if (this.type == 13) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newGrayscl((GrayscaleEffectModel) this.value);
      if (this.type == 14) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newHsl((HSLEffectModel) this.value);
      if (this.type == 15) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newLum((LuminanceEffectModel) this.value);
      if (this.type == 16) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newTint((TintEffectModel) this.value);
      return null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorBuilder from(
        BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel value) {
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
