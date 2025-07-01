package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.officeDocument.relationships.STRelationshipIdModel;

public class CTBlipModel {
  private final STBlipCompressionModel cstate;

  private final STRelationshipIdModel embed;

  private final STRelationshipIdModel link;

  private final AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private final CTOfficeArtExtensionListModel extLst;

  public CTBlipModel(STBlipCompressionModel cstate, STRelationshipIdModel embed,
      STRelationshipIdModel link,
      AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel alphaBiLevelOrAlphaCeilingOrAlphaFloor,
      CTOfficeArtExtensionListModel extLst) {
    this.cstate = cstate;
    this.embed = embed;
    this.link = link;
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    this.extLst = extLst;
  }

  public STBlipCompressionModel getCstate() {
    return this.cstate;
  }

  public STRelationshipIdModel getEmbed() {
    return this.embed;
  }

  public STRelationshipIdModel getLink() {
    return this.link;
  }

  public AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel getAlphaBiLevelOrAlphaCeilingOrAlphaFloor() {
    return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel {
    private final Integer type;

    private final Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel() {
      this(-1, null);
    }

    private AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaBiLevel(
        CTAlphaBiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(0, value);
    }

    public Boolean isAlphaBiLevel() {
      return this.type == 0;
    }

    public CTAlphaBiLevelEffectModel getAlphaBiLevel() {
      return (CTAlphaBiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaCeiling(
        CTAlphaCeilingEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(1, value);
    }

    public Boolean isAlphaCeiling() {
      return this.type == 1;
    }

    public CTAlphaCeilingEffectModel getAlphaCeiling() {
      return (CTAlphaCeilingEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaFloor(
        CTAlphaFloorEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(2, value);
    }

    public Boolean isAlphaFloor() {
      return this.type == 2;
    }

    public CTAlphaFloorEffectModel getAlphaFloor() {
      return (CTAlphaFloorEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaInv(
        CTAlphaInverseEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(3, value);
    }

    public Boolean isAlphaInv() {
      return this.type == 3;
    }

    public CTAlphaInverseEffectModel getAlphaInv() {
      return (CTAlphaInverseEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaMod(
        CTAlphaModulateEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(4, value);
    }

    public Boolean isAlphaMod() {
      return this.type == 4;
    }

    public CTAlphaModulateEffectModel getAlphaMod() {
      return (CTAlphaModulateEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaModFix(
        CTAlphaModulateFixedEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(5, value);
    }

    public Boolean isAlphaModFix() {
      return this.type == 5;
    }

    public CTAlphaModulateFixedEffectModel getAlphaModFix() {
      return (CTAlphaModulateFixedEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaRepl(
        CTAlphaReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(6, value);
    }

    public Boolean isAlphaRepl() {
      return this.type == 6;
    }

    public CTAlphaReplaceEffectModel getAlphaRepl() {
      return (CTAlphaReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBiLevel(
        CTBiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(7, value);
    }

    public Boolean isBiLevel() {
      return this.type == 7;
    }

    public CTBiLevelEffectModel getBiLevel() {
      return (CTBiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBlur(CTBlurEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(8, value);
    }

    public Boolean isBlur() {
      return this.type == 8;
    }

    public CTBlurEffectModel getBlur() {
      return (CTBlurEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrChange(
        CTColorChangeEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(9, value);
    }

    public Boolean isClrChange() {
      return this.type == 9;
    }

    public CTColorChangeEffectModel getClrChange() {
      return (CTColorChangeEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrRepl(
        CTColorReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(10, value);
    }

    public Boolean isClrRepl() {
      return this.type == 10;
    }

    public CTColorReplaceEffectModel getClrRepl() {
      return (CTColorReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newDuotone(
        CTDuotoneEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(11, value);
    }

    public Boolean isDuotone() {
      return this.type == 11;
    }

    public CTDuotoneEffectModel getDuotone() {
      return (CTDuotoneEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newFillOverlay(
        CTFillOverlayEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(12, value);
    }

    public Boolean isFillOverlay() {
      return this.type == 12;
    }

    public CTFillOverlayEffectModel getFillOverlay() {
      return (CTFillOverlayEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newGrayscl(
        CTGrayscaleEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(13, value);
    }

    public Boolean isGrayscl() {
      return this.type == 13;
    }

    public CTGrayscaleEffectModel getGrayscl() {
      return (CTGrayscaleEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newHsl(CTHSLEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(14, value);
    }

    public Boolean isHsl() {
      return this.type == 14;
    }

    public CTHSLEffectModel getHsl() {
      return (CTHSLEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newLum(CTLuminanceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(15, value);
    }

    public Boolean isLum() {
      return this.type == 15;
    }

    public CTLuminanceEffectModel getLum() {
      return (CTLuminanceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newTint(CTTintEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(16, value);
    }

    public Boolean isTint() {
      return this.type == 16;
    }

    public CTTintEffectModel getTint() {
      return (CTTintEffectModel) this.value;
    }
  }
}
