package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_BlipModel {
  private final ST_BlipCompressionModel cstate;

  private final ST_RelationshipIdModel embed;

  private final ST_RelationshipIdModel link;

  private final List<alphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_BlipModel(ST_BlipCompressionModel cstate, ST_RelationshipIdModel embed,
      ST_RelationshipIdModel link,
      List<alphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor,
      CT_OfficeArtExtensionListModel extLst) {
    this.cstate = cstate;
    this.embed = embed;
    this.link = link;
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    this.extLst = extLst;
  }

  public ST_BlipCompressionModel getCstate() {
    return this.cstate;
  }

  public ST_RelationshipIdModel getEmbed() {
    return this.embed;
  }

  public ST_RelationshipIdModel getLink() {
    return this.link;
  }

  public List<alphaBiLevelOrAlphaCeilingOrAlphaFloorModel> getAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      ) {
    return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class alphaBiLevelOrAlphaCeilingOrAlphaFloorModel {
    private final int type;

    private final Object value;

    public alphaBiLevelOrAlphaCeilingOrAlphaFloorModel() {
      this(-1, null);
    }

    private alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaBiLevel(
        CT_AlphaBiLevelEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(0, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 0;
    }

    public CT_AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (CT_AlphaBiLevelEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaCeiling(
        CT_AlphaCeilingEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(1, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 1;
    }

    public CT_AlphaCeilingEffectModel getAlphaCeiling() {
      return (CT_AlphaCeilingEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaFloor(
        CT_AlphaFloorEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(2, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 2;
    }

    public CT_AlphaFloorEffectModel getAlphaFloor() {
      return (CT_AlphaFloorEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaInv(
        CT_AlphaInverseEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(3, value);
    }

    public boolean isAlphaInv() {
      return this.type == 3;
    }

    public CT_AlphaInverseEffectModel getAlphaInv() {
      return (CT_AlphaInverseEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaMod(
        CT_AlphaModulateEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(4, value);
    }

    public boolean isAlphaMod() {
      return this.type == 4;
    }

    public CT_AlphaModulateEffectModel getAlphaMod() {
      return (CT_AlphaModulateEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaModFix(
        CT_AlphaModulateFixedEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(5, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 5;
    }

    public CT_AlphaModulateFixedEffectModel getAlphaModFix() {
      return (CT_AlphaModulateFixedEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaRepl(
        CT_AlphaReplaceEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(6, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 6;
    }

    public CT_AlphaReplaceEffectModel getAlphaRepl() {
      return (CT_AlphaReplaceEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBiLevel(
        CT_BiLevelEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(7, value);
    }

    public boolean isBiLevel() {
      return this.type == 7;
    }

    public CT_BiLevelEffectModel getBiLevel() {
      return (CT_BiLevelEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBlur(CT_BlurEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(8, value);
    }

    public boolean isBlur() {
      return this.type == 8;
    }

    public CT_BlurEffectModel getBlur() {
      return (CT_BlurEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrChange(
        CT_ColorChangeEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(9, value);
    }

    public boolean isClrChange() {
      return this.type == 9;
    }

    public CT_ColorChangeEffectModel getClrChange() {
      return (CT_ColorChangeEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrRepl(
        CT_ColorReplaceEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(10, value);
    }

    public boolean isClrRepl() {
      return this.type == 10;
    }

    public CT_ColorReplaceEffectModel getClrRepl() {
      return (CT_ColorReplaceEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newDuotone(
        CT_DuotoneEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(11, value);
    }

    public boolean isDuotone() {
      return this.type == 11;
    }

    public CT_DuotoneEffectModel getDuotone() {
      return (CT_DuotoneEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newFillOverlay(
        CT_FillOverlayEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(12, value);
    }

    public boolean isFillOverlay() {
      return this.type == 12;
    }

    public CT_FillOverlayEffectModel getFillOverlay() {
      return (CT_FillOverlayEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newGrayscl(
        CT_GrayscaleEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(13, value);
    }

    public boolean isGrayscl() {
      return this.type == 13;
    }

    public CT_GrayscaleEffectModel getGrayscl() {
      return (CT_GrayscaleEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newHsl(CT_HSLEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(14, value);
    }

    public boolean isHsl() {
      return this.type == 14;
    }

    public CT_HSLEffectModel getHsl() {
      return (CT_HSLEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newLum(
        CT_LuminanceEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(15, value);
    }

    public boolean isLum() {
      return this.type == 15;
    }

    public CT_LuminanceEffectModel getLum() {
      return (CT_LuminanceEffectModel) this.value;
    }

    public static alphaBiLevelOrAlphaCeilingOrAlphaFloorModel newTint(CT_TintEffectModel value) {
      return new alphaBiLevelOrAlphaCeilingOrAlphaFloorModel(16, value);
    }

    public boolean isTint() {
      return this.type == 16;
    }

    public CT_TintEffectModel getTint() {
      return (CT_TintEffectModel) this.value;
    }
  }
}
