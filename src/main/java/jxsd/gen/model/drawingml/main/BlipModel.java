package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.BlipBuilder;

/**
 * This is a generated sequence class.
 */
public class BlipModel {
  private final BlipCompressionValueModel cstate;

  private final String embed;

  private final String link;

  private final List<AlphaBiLevelOrAlphaCeilingOrAlphaFloor> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private final OfficeArtExtensionListModel extLst;

  public BlipModel(BlipCompressionValueModel cstate, String embed, String link,
      List<AlphaBiLevelOrAlphaCeilingOrAlphaFloor> alphaBiLevelOrAlphaCeilingOrAlphaFloor,
      OfficeArtExtensionListModel extLst) {
    this.cstate = cstate;
    this.embed = embed;
    this.link = link;
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    this.extLst = extLst;
  }

  public BlipBuilder builder() {
    return new BlipBuilder().from(this);
  }

  public BlipCompressionValueModel getCstate() {
    return this.cstate;
  }

  public String getEmbed() {
    return this.embed;
  }

  public String getLink() {
    return this.link;
  }

  public List<AlphaBiLevelOrAlphaCeilingOrAlphaFloor> getAlphaBiLevelOrAlphaCeilingOrAlphaFloor() {
    return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloor {
    private final int type;

    private final Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloor() {
      this(-1, null);
    }

    private AlphaBiLevelOrAlphaCeilingOrAlphaFloor(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public BlipBuilder.AlphaBiLevelOrAlphaCeilingOrAlphaFloor builder() {
      return new BlipBuilder.AlphaBiLevelOrAlphaCeilingOrAlphaFloor().from(this);
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaBiLevel(
        AlphaBiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(0, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 0;
    }

    public AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (AlphaBiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaCeiling(
        AlphaCeilingEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(1, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 1;
    }

    public AlphaCeilingEffectModel getAlphaCeiling() {
      return (AlphaCeilingEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaFloor(
        AlphaFloorEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(2, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 2;
    }

    public AlphaFloorEffectModel getAlphaFloor() {
      return (AlphaFloorEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaInv(
        AlphaInverseEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(3, value);
    }

    public boolean isAlphaInv() {
      return this.type == 3;
    }

    public AlphaInverseEffectModel getAlphaInv() {
      return (AlphaInverseEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaMod(
        AlphaModulateEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(4, value);
    }

    public boolean isAlphaMod() {
      return this.type == 4;
    }

    public AlphaModulateEffectModel getAlphaMod() {
      return (AlphaModulateEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(5, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 5;
    }

    public AlphaModulateFixedEffectModel getAlphaModFix() {
      return (AlphaModulateFixedEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newAlphaRepl(
        AlphaReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(6, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 6;
    }

    public AlphaReplaceEffectModel getAlphaRepl() {
      return (AlphaReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newBiLevel(BiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(7, value);
    }

    public boolean isBiLevel() {
      return this.type == 7;
    }

    public BiLevelEffectModel getBiLevel() {
      return (BiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newBlur(BlurEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(8, value);
    }

    public boolean isBlur() {
      return this.type == 8;
    }

    public BlurEffectModel getBlur() {
      return (BlurEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newClrChange(
        ColorChangeEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(9, value);
    }

    public boolean isClrChange() {
      return this.type == 9;
    }

    public ColorChangeEffectModel getClrChange() {
      return (ColorChangeEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newClrRepl(ColorReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(10, value);
    }

    public boolean isClrRepl() {
      return this.type == 10;
    }

    public ColorReplaceEffectModel getClrRepl() {
      return (ColorReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newDuotone(DuotoneEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(11, value);
    }

    public boolean isDuotone() {
      return this.type == 11;
    }

    public DuotoneEffectModel getDuotone() {
      return (DuotoneEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newFillOverlay(
        FillOverlayEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(12, value);
    }

    public boolean isFillOverlay() {
      return this.type == 12;
    }

    public FillOverlayEffectModel getFillOverlay() {
      return (FillOverlayEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newGrayscl(GrayscaleEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(13, value);
    }

    public boolean isGrayscl() {
      return this.type == 13;
    }

    public GrayscaleEffectModel getGrayscl() {
      return (GrayscaleEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newHsl(HSLEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(14, value);
    }

    public boolean isHsl() {
      return this.type == 14;
    }

    public HSLEffectModel getHsl() {
      return (HSLEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newLum(LuminanceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(15, value);
    }

    public boolean isLum() {
      return this.type == 15;
    }

    public LuminanceEffectModel getLum() {
      return (LuminanceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloor newTint(TintEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloor(16, value);
    }

    public boolean isTint() {
      return this.type == 16;
    }

    public TintEffectModel getTint() {
      return (TintEffectModel) this.value;
    }
  }
}
