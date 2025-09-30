package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetPatternValValueModel;
import org.docx4j.dml.STPresetPatternVal;

/**
 * This is a generated enum class.
 */
public class PresetPatternValValueConverter {
  private PresetPatternValValueConverter() {
  }

  public static PresetPatternValValueModel fromDocx4j(STPresetPatternVal value) {
    if (value == null) return null;
    if (value == STPresetPatternVal.PCT_5) return PresetPatternValValueModel.PCT_5;
    if (value == STPresetPatternVal.PCT_10) return PresetPatternValValueModel.PCT_10;
    if (value == STPresetPatternVal.PCT_20) return PresetPatternValValueModel.PCT_20;
    if (value == STPresetPatternVal.PCT_25) return PresetPatternValValueModel.PCT_25;
    if (value == STPresetPatternVal.PCT_30) return PresetPatternValValueModel.PCT_30;
    if (value == STPresetPatternVal.PCT_40) return PresetPatternValValueModel.PCT_40;
    if (value == STPresetPatternVal.PCT_50) return PresetPatternValValueModel.PCT_50;
    if (value == STPresetPatternVal.PCT_60) return PresetPatternValValueModel.PCT_60;
    if (value == STPresetPatternVal.PCT_70) return PresetPatternValValueModel.PCT_70;
    if (value == STPresetPatternVal.PCT_75) return PresetPatternValValueModel.PCT_75;
    if (value == STPresetPatternVal.PCT_80) return PresetPatternValValueModel.PCT_80;
    if (value == STPresetPatternVal.PCT_90) return PresetPatternValValueModel.PCT_90;
    if (value == STPresetPatternVal.HORZ) return PresetPatternValValueModel.HORZ;
    if (value == STPresetPatternVal.VERT) return PresetPatternValValueModel.VERT;
    if (value == STPresetPatternVal.LT_HORZ) return PresetPatternValValueModel.LT_HORZ;
    if (value == STPresetPatternVal.LT_VERT) return PresetPatternValValueModel.LT_VERT;
    if (value == STPresetPatternVal.DK_HORZ) return PresetPatternValValueModel.DK_HORZ;
    if (value == STPresetPatternVal.DK_VERT) return PresetPatternValValueModel.DK_VERT;
    if (value == STPresetPatternVal.NAR_HORZ) return PresetPatternValValueModel.NAR_HORZ;
    if (value == STPresetPatternVal.NAR_VERT) return PresetPatternValValueModel.NAR_VERT;
    if (value == STPresetPatternVal.DASH_HORZ) return PresetPatternValValueModel.DASH_HORZ;
    if (value == STPresetPatternVal.DASH_VERT) return PresetPatternValValueModel.DASH_VERT;
    if (value == STPresetPatternVal.CROSS) return PresetPatternValValueModel.CROSS;
    if (value == STPresetPatternVal.DN_DIAG) return PresetPatternValValueModel.DN_DIAG;
    if (value == STPresetPatternVal.UP_DIAG) return PresetPatternValValueModel.UP_DIAG;
    if (value == STPresetPatternVal.LT_DN_DIAG) return PresetPatternValValueModel.LT_DN_DIAG;
    if (value == STPresetPatternVal.LT_UP_DIAG) return PresetPatternValValueModel.LT_UP_DIAG;
    if (value == STPresetPatternVal.DK_DN_DIAG) return PresetPatternValValueModel.DK_DN_DIAG;
    if (value == STPresetPatternVal.DK_UP_DIAG) return PresetPatternValValueModel.DK_UP_DIAG;
    if (value == STPresetPatternVal.WD_DN_DIAG) return PresetPatternValValueModel.WD_DN_DIAG;
    if (value == STPresetPatternVal.WD_UP_DIAG) return PresetPatternValValueModel.WD_UP_DIAG;
    if (value == STPresetPatternVal.DASH_DN_DIAG) return PresetPatternValValueModel.DASH_DN_DIAG;
    if (value == STPresetPatternVal.DASH_UP_DIAG) return PresetPatternValValueModel.DASH_UP_DIAG;
    if (value == STPresetPatternVal.DIAG_CROSS) return PresetPatternValValueModel.DIAG_CROSS;
    if (value == STPresetPatternVal.SM_CHECK) return PresetPatternValValueModel.SM_CHECK;
    if (value == STPresetPatternVal.LG_CHECK) return PresetPatternValValueModel.LG_CHECK;
    if (value == STPresetPatternVal.SM_GRID) return PresetPatternValValueModel.SM_GRID;
    if (value == STPresetPatternVal.LG_GRID) return PresetPatternValValueModel.LG_GRID;
    if (value == STPresetPatternVal.DOT_GRID) return PresetPatternValValueModel.DOT_GRID;
    if (value == STPresetPatternVal.SM_CONFETTI) return PresetPatternValValueModel.SM_CONFETTI;
    if (value == STPresetPatternVal.LG_CONFETTI) return PresetPatternValValueModel.LG_CONFETTI;
    if (value == STPresetPatternVal.HORZ_BRICK) return PresetPatternValValueModel.HORZ_BRICK;
    if (value == STPresetPatternVal.DIAG_BRICK) return PresetPatternValValueModel.DIAG_BRICK;
    if (value == STPresetPatternVal.SOLID_DMND) return PresetPatternValValueModel.SOLID_DMND;
    if (value == STPresetPatternVal.OPEN_DMND) return PresetPatternValValueModel.OPEN_DMND;
    if (value == STPresetPatternVal.DOT_DMND) return PresetPatternValValueModel.DOT_DMND;
    if (value == STPresetPatternVal.PLAID) return PresetPatternValValueModel.PLAID;
    if (value == STPresetPatternVal.SPHERE) return PresetPatternValValueModel.SPHERE;
    if (value == STPresetPatternVal.WEAVE) return PresetPatternValValueModel.WEAVE;
    if (value == STPresetPatternVal.DIVOT) return PresetPatternValValueModel.DIVOT;
    if (value == STPresetPatternVal.SHINGLE) return PresetPatternValValueModel.SHINGLE;
    if (value == STPresetPatternVal.WAVE) return PresetPatternValValueModel.WAVE;
    if (value == STPresetPatternVal.TRELLIS) return PresetPatternValValueModel.TRELLIS;
    if (value == STPresetPatternVal.ZIG_ZAG) return PresetPatternValValueModel.ZIG_ZAG;
    return null;
  }

  public static STPresetPatternVal toDocx4j(PresetPatternValValueModel value) {
    if (value == null) return null;
    if (value == PresetPatternValValueModel.PCT_5) return STPresetPatternVal.PCT_5;
    if (value == PresetPatternValValueModel.PCT_10) return STPresetPatternVal.PCT_10;
    if (value == PresetPatternValValueModel.PCT_20) return STPresetPatternVal.PCT_20;
    if (value == PresetPatternValValueModel.PCT_25) return STPresetPatternVal.PCT_25;
    if (value == PresetPatternValValueModel.PCT_30) return STPresetPatternVal.PCT_30;
    if (value == PresetPatternValValueModel.PCT_40) return STPresetPatternVal.PCT_40;
    if (value == PresetPatternValValueModel.PCT_50) return STPresetPatternVal.PCT_50;
    if (value == PresetPatternValValueModel.PCT_60) return STPresetPatternVal.PCT_60;
    if (value == PresetPatternValValueModel.PCT_70) return STPresetPatternVal.PCT_70;
    if (value == PresetPatternValValueModel.PCT_75) return STPresetPatternVal.PCT_75;
    if (value == PresetPatternValValueModel.PCT_80) return STPresetPatternVal.PCT_80;
    if (value == PresetPatternValValueModel.PCT_90) return STPresetPatternVal.PCT_90;
    if (value == PresetPatternValValueModel.HORZ) return STPresetPatternVal.HORZ;
    if (value == PresetPatternValValueModel.VERT) return STPresetPatternVal.VERT;
    if (value == PresetPatternValValueModel.LT_HORZ) return STPresetPatternVal.LT_HORZ;
    if (value == PresetPatternValValueModel.LT_VERT) return STPresetPatternVal.LT_VERT;
    if (value == PresetPatternValValueModel.DK_HORZ) return STPresetPatternVal.DK_HORZ;
    if (value == PresetPatternValValueModel.DK_VERT) return STPresetPatternVal.DK_VERT;
    if (value == PresetPatternValValueModel.NAR_HORZ) return STPresetPatternVal.NAR_HORZ;
    if (value == PresetPatternValValueModel.NAR_VERT) return STPresetPatternVal.NAR_VERT;
    if (value == PresetPatternValValueModel.DASH_HORZ) return STPresetPatternVal.DASH_HORZ;
    if (value == PresetPatternValValueModel.DASH_VERT) return STPresetPatternVal.DASH_VERT;
    if (value == PresetPatternValValueModel.CROSS) return STPresetPatternVal.CROSS;
    if (value == PresetPatternValValueModel.DN_DIAG) return STPresetPatternVal.DN_DIAG;
    if (value == PresetPatternValValueModel.UP_DIAG) return STPresetPatternVal.UP_DIAG;
    if (value == PresetPatternValValueModel.LT_DN_DIAG) return STPresetPatternVal.LT_DN_DIAG;
    if (value == PresetPatternValValueModel.LT_UP_DIAG) return STPresetPatternVal.LT_UP_DIAG;
    if (value == PresetPatternValValueModel.DK_DN_DIAG) return STPresetPatternVal.DK_DN_DIAG;
    if (value == PresetPatternValValueModel.DK_UP_DIAG) return STPresetPatternVal.DK_UP_DIAG;
    if (value == PresetPatternValValueModel.WD_DN_DIAG) return STPresetPatternVal.WD_DN_DIAG;
    if (value == PresetPatternValValueModel.WD_UP_DIAG) return STPresetPatternVal.WD_UP_DIAG;
    if (value == PresetPatternValValueModel.DASH_DN_DIAG) return STPresetPatternVal.DASH_DN_DIAG;
    if (value == PresetPatternValValueModel.DASH_UP_DIAG) return STPresetPatternVal.DASH_UP_DIAG;
    if (value == PresetPatternValValueModel.DIAG_CROSS) return STPresetPatternVal.DIAG_CROSS;
    if (value == PresetPatternValValueModel.SM_CHECK) return STPresetPatternVal.SM_CHECK;
    if (value == PresetPatternValValueModel.LG_CHECK) return STPresetPatternVal.LG_CHECK;
    if (value == PresetPatternValValueModel.SM_GRID) return STPresetPatternVal.SM_GRID;
    if (value == PresetPatternValValueModel.LG_GRID) return STPresetPatternVal.LG_GRID;
    if (value == PresetPatternValValueModel.DOT_GRID) return STPresetPatternVal.DOT_GRID;
    if (value == PresetPatternValValueModel.SM_CONFETTI) return STPresetPatternVal.SM_CONFETTI;
    if (value == PresetPatternValValueModel.LG_CONFETTI) return STPresetPatternVal.LG_CONFETTI;
    if (value == PresetPatternValValueModel.HORZ_BRICK) return STPresetPatternVal.HORZ_BRICK;
    if (value == PresetPatternValValueModel.DIAG_BRICK) return STPresetPatternVal.DIAG_BRICK;
    if (value == PresetPatternValValueModel.SOLID_DMND) return STPresetPatternVal.SOLID_DMND;
    if (value == PresetPatternValValueModel.OPEN_DMND) return STPresetPatternVal.OPEN_DMND;
    if (value == PresetPatternValValueModel.DOT_DMND) return STPresetPatternVal.DOT_DMND;
    if (value == PresetPatternValValueModel.PLAID) return STPresetPatternVal.PLAID;
    if (value == PresetPatternValValueModel.SPHERE) return STPresetPatternVal.SPHERE;
    if (value == PresetPatternValValueModel.WEAVE) return STPresetPatternVal.WEAVE;
    if (value == PresetPatternValValueModel.DIVOT) return STPresetPatternVal.DIVOT;
    if (value == PresetPatternValValueModel.SHINGLE) return STPresetPatternVal.SHINGLE;
    if (value == PresetPatternValValueModel.WAVE) return STPresetPatternVal.WAVE;
    if (value == PresetPatternValValueModel.TRELLIS) return STPresetPatternVal.TRELLIS;
    if (value == PresetPatternValValueModel.ZIG_ZAG) return STPresetPatternVal.ZIG_ZAG;
    return null;
  }
}
