package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.AlphaBiLevelEffectModel;
import jxsd.gen.model.drawingml.main.AlphaCeilingEffectModel;
import jxsd.gen.model.drawingml.main.AlphaFloorEffectModel;
import jxsd.gen.model.drawingml.main.AlphaInverseEffectModel;
import jxsd.gen.model.drawingml.main.AlphaModulateEffectModel;
import jxsd.gen.model.drawingml.main.AlphaModulateFixedEffectModel;
import jxsd.gen.model.drawingml.main.AlphaReplaceEffectModel;
import jxsd.gen.model.drawingml.main.BiLevelEffectModel;
import jxsd.gen.model.drawingml.main.BlipCompressionValueModel;
import jxsd.gen.model.drawingml.main.BlipModel;
import jxsd.gen.model.drawingml.main.BlurEffectModel;
import jxsd.gen.model.drawingml.main.ColorChangeEffectModel;
import jxsd.gen.model.drawingml.main.ColorReplaceEffectModel;
import jxsd.gen.model.drawingml.main.DuotoneEffectModel;
import jxsd.gen.model.drawingml.main.FillOverlayEffectModel;
import jxsd.gen.model.drawingml.main.GrayscaleEffectModel;
import jxsd.gen.model.drawingml.main.HSLEffectModel;
import jxsd.gen.model.drawingml.main.LuminanceEffectModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.TintEffectModel;

/**
 * This is a generated sequence class.
 */
public class BlipBuilder {
  private BlipCompressionValueModel cstate;

  private String embed;

  private String link;

  private List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private OfficeArtExtensionListModel extLst;

  public BlipBuilder() {
  }

  public BlipBuilder setCstate(BlipCompressionValueModel cstate) {
    this.cstate = cstate;
    return this;
  }

  public BlipBuilder setEmbed(String embed) {
    this.embed = embed;
    return this;
  }

  public BlipBuilder setLink(String link) {
    this.link = link;
    return this;
  }

  public BlipBuilder setAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor> alphaBiLevelOrAlphaCeilingOrAlphaFloor) {
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    return this;
  }

  public BlipBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BlipBuilder from(BlipModel value) {
    this.cstate = value.getCstate();
    this.embed = value.getEmbed();
    this.link = value.getLink();
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor();
    this.extLst = value.getExtLst();
    return this;
  }

  public BlipModel build() {
    return new BlipModel(this.cstate, this.embed, this.link, this.alphaBiLevelOrAlphaCeilingOrAlphaFloor, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloor {
    private int type;

    private Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor() {
      this.type = -1;
      this.value = null;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaBiLevel(AlphaBiLevelEffectModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaCeiling(AlphaCeilingEffectModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaFloor(AlphaFloorEffectModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaInv(AlphaInverseEffectModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaMod(AlphaModulateEffectModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setAlphaRepl(AlphaReplaceEffectModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setBiLevel(BiLevelEffectModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setBlur(BlurEffectModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setClrChange(ColorChangeEffectModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setClrRepl(ColorReplaceEffectModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setDuotone(DuotoneEffectModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setFillOverlay(FillOverlayEffectModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setGrayscl(GrayscaleEffectModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setHsl(HSLEffectModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setLum(LuminanceEffectModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor setTint(TintEffectModel value) {
      this.type = 16;
      this.value = value;
      return this;
    }

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor from(
        BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor value) {
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

    public BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor build() {
      if (this.type == -1) return new BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor();
      if (this.type == 0) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaBiLevel((AlphaBiLevelEffectModel) this.value);
      if (this.type == 1) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaCeiling((AlphaCeilingEffectModel) this.value);
      if (this.type == 2) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaFloor((AlphaFloorEffectModel) this.value);
      if (this.type == 3) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaInv((AlphaInverseEffectModel) this.value);
      if (this.type == 4) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaMod((AlphaModulateEffectModel) this.value);
      if (this.type == 5) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaModFix((AlphaModulateFixedEffectModel) this.value);
      if (this.type == 6) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaRepl((AlphaReplaceEffectModel) this.value);
      if (this.type == 7) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newBiLevel((BiLevelEffectModel) this.value);
      if (this.type == 8) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newBlur((BlurEffectModel) this.value);
      if (this.type == 9) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newClrChange((ColorChangeEffectModel) this.value);
      if (this.type == 10) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newClrRepl((ColorReplaceEffectModel) this.value);
      if (this.type == 11) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newDuotone((DuotoneEffectModel) this.value);
      if (this.type == 12) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newFillOverlay((FillOverlayEffectModel) this.value);
      if (this.type == 13) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newGrayscl((GrayscaleEffectModel) this.value);
      if (this.type == 14) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newHsl((HSLEffectModel) this.value);
      if (this.type == 15) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newLum((LuminanceEffectModel) this.value);
      if (this.type == 16) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newTint((TintEffectModel) this.value);
      return null;
    }
  }
}
