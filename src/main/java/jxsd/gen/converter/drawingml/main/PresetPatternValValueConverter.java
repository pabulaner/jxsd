package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetPatternValValueBuilder;
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
    if (value == PresetPatternValValueBuilder.PCT_5) return PresetPatternValValueModel.PCT_5;
    if (value == PresetPatternValValueBuilder.PCT_10) return PresetPatternValValueModel.PCT_10;
    if (value == PresetPatternValValueBuilder.PCT_20) return PresetPatternValValueModel.PCT_20;
    if (value == PresetPatternValValueBuilder.PCT_25) return PresetPatternValValueModel.PCT_25;
    if (value == PresetPatternValValueBuilder.PCT_30) return PresetPatternValValueModel.PCT_30;
    if (value == PresetPatternValValueBuilder.PCT_40) return PresetPatternValValueModel.PCT_40;
    if (value == PresetPatternValValueBuilder.PCT_50) return PresetPatternValValueModel.PCT_50;
    if (value == PresetPatternValValueBuilder.PCT_60) return PresetPatternValValueModel.PCT_60;
    if (value == PresetPatternValValueBuilder.PCT_70) return PresetPatternValValueModel.PCT_70;
    if (value == PresetPatternValValueBuilder.PCT_75) return PresetPatternValValueModel.PCT_75;
    if (value == PresetPatternValValueBuilder.PCT_80) return PresetPatternValValueModel.PCT_80;
    if (value == PresetPatternValValueBuilder.PCT_90) return PresetPatternValValueModel.PCT_90;
    if (value == PresetPatternValValueBuilder.HORZ) return PresetPatternValValueModel.HORZ;
    if (value == PresetPatternValValueBuilder.VERT) return PresetPatternValValueModel.VERT;
    if (value == PresetPatternValValueBuilder.LT_HORZ) return PresetPatternValValueModel.LT_HORZ;
    if (value == PresetPatternValValueBuilder.LT_VERT) return PresetPatternValValueModel.LT_VERT;
    if (value == PresetPatternValValueBuilder.DK_HORZ) return PresetPatternValValueModel.DK_HORZ;
    if (value == PresetPatternValValueBuilder.DK_VERT) return PresetPatternValValueModel.DK_VERT;
    if (value == PresetPatternValValueBuilder.NAR_HORZ) return PresetPatternValValueModel.NAR_HORZ;
    if (value == PresetPatternValValueBuilder.NAR_VERT) return PresetPatternValValueModel.NAR_VERT;
    if (value == PresetPatternValValueBuilder.DASH_HORZ) return PresetPatternValValueModel.DASH_HORZ;
    if (value == PresetPatternValValueBuilder.DASH_VERT) return PresetPatternValValueModel.DASH_VERT;
    if (value == PresetPatternValValueBuilder.CROSS) return PresetPatternValValueModel.CROSS;
    if (value == PresetPatternValValueBuilder.DN_DIAG) return PresetPatternValValueModel.DN_DIAG;
    if (value == PresetPatternValValueBuilder.UP_DIAG) return PresetPatternValValueModel.UP_DIAG;
    if (value == PresetPatternValValueBuilder.LT_DN_DIAG) return PresetPatternValValueModel.LT_DN_DIAG;
    if (value == PresetPatternValValueBuilder.LT_UP_DIAG) return PresetPatternValValueModel.LT_UP_DIAG;
    if (value == PresetPatternValValueBuilder.DK_DN_DIAG) return PresetPatternValValueModel.DK_DN_DIAG;
    if (value == PresetPatternValValueBuilder.DK_UP_DIAG) return PresetPatternValValueModel.DK_UP_DIAG;
    if (value == PresetPatternValValueBuilder.WD_DN_DIAG) return PresetPatternValValueModel.WD_DN_DIAG;
    if (value == PresetPatternValValueBuilder.WD_UP_DIAG) return PresetPatternValValueModel.WD_UP_DIAG;
    if (value == PresetPatternValValueBuilder.DASH_DN_DIAG) return PresetPatternValValueModel.DASH_DN_DIAG;
    if (value == PresetPatternValValueBuilder.DASH_UP_DIAG) return PresetPatternValValueModel.DASH_UP_DIAG;
    if (value == PresetPatternValValueBuilder.DIAG_CROSS) return PresetPatternValValueModel.DIAG_CROSS;
    if (value == PresetPatternValValueBuilder.SM_CHECK) return PresetPatternValValueModel.SM_CHECK;
    if (value == PresetPatternValValueBuilder.LG_CHECK) return PresetPatternValValueModel.LG_CHECK;
    if (value == PresetPatternValValueBuilder.SM_GRID) return PresetPatternValValueModel.SM_GRID;
    if (value == PresetPatternValValueBuilder.LG_GRID) return PresetPatternValValueModel.LG_GRID;
    if (value == PresetPatternValValueBuilder.DOT_GRID) return PresetPatternValValueModel.DOT_GRID;
    if (value == PresetPatternValValueBuilder.SM_CONFETTI) return PresetPatternValValueModel.SM_CONFETTI;
    if (value == PresetPatternValValueBuilder.LG_CONFETTI) return PresetPatternValValueModel.LG_CONFETTI;
    if (value == PresetPatternValValueBuilder.HORZ_BRICK) return PresetPatternValValueModel.HORZ_BRICK;
    if (value == PresetPatternValValueBuilder.DIAG_BRICK) return PresetPatternValValueModel.DIAG_BRICK;
    if (value == PresetPatternValValueBuilder.SOLID_DMND) return PresetPatternValValueModel.SOLID_DMND;
    if (value == PresetPatternValValueBuilder.OPEN_DMND) return PresetPatternValValueModel.OPEN_DMND;
    if (value == PresetPatternValValueBuilder.DOT_DMND) return PresetPatternValValueModel.DOT_DMND;
    if (value == PresetPatternValValueBuilder.PLAID) return PresetPatternValValueModel.PLAID;
    if (value == PresetPatternValValueBuilder.SPHERE) return PresetPatternValValueModel.SPHERE;
    if (value == PresetPatternValValueBuilder.WEAVE) return PresetPatternValValueModel.WEAVE;
    if (value == PresetPatternValValueBuilder.DIVOT) return PresetPatternValValueModel.DIVOT;
    if (value == PresetPatternValValueBuilder.SHINGLE) return PresetPatternValValueModel.SHINGLE;
    if (value == PresetPatternValValueBuilder.WAVE) return PresetPatternValValueModel.WAVE;
    if (value == PresetPatternValValueBuilder.TRELLIS) return PresetPatternValValueModel.TRELLIS;
    if (value == PresetPatternValValueBuilder.ZIG_ZAG) return PresetPatternValValueModel.ZIG_ZAG;
    return null;
  }

  public static STPresetPatternVal toDocx4j(PresetPatternValValueModel value) {
    if (value == null) return null;
    if (value == PresetPatternValValueModel.PCT_5) return PresetPatternValValueBuilder.PCT_5;
    if (value == PresetPatternValValueModel.PCT_10) return PresetPatternValValueBuilder.PCT_10;
    if (value == PresetPatternValValueModel.PCT_20) return PresetPatternValValueBuilder.PCT_20;
    if (value == PresetPatternValValueModel.PCT_25) return PresetPatternValValueBuilder.PCT_25;
    if (value == PresetPatternValValueModel.PCT_30) return PresetPatternValValueBuilder.PCT_30;
    if (value == PresetPatternValValueModel.PCT_40) return PresetPatternValValueBuilder.PCT_40;
    if (value == PresetPatternValValueModel.PCT_50) return PresetPatternValValueBuilder.PCT_50;
    if (value == PresetPatternValValueModel.PCT_60) return PresetPatternValValueBuilder.PCT_60;
    if (value == PresetPatternValValueModel.PCT_70) return PresetPatternValValueBuilder.PCT_70;
    if (value == PresetPatternValValueModel.PCT_75) return PresetPatternValValueBuilder.PCT_75;
    if (value == PresetPatternValValueModel.PCT_80) return PresetPatternValValueBuilder.PCT_80;
    if (value == PresetPatternValValueModel.PCT_90) return PresetPatternValValueBuilder.PCT_90;
    if (value == PresetPatternValValueModel.HORZ) return PresetPatternValValueBuilder.HORZ;
    if (value == PresetPatternValValueModel.VERT) return PresetPatternValValueBuilder.VERT;
    if (value == PresetPatternValValueModel.LT_HORZ) return PresetPatternValValueBuilder.LT_HORZ;
    if (value == PresetPatternValValueModel.LT_VERT) return PresetPatternValValueBuilder.LT_VERT;
    if (value == PresetPatternValValueModel.DK_HORZ) return PresetPatternValValueBuilder.DK_HORZ;
    if (value == PresetPatternValValueModel.DK_VERT) return PresetPatternValValueBuilder.DK_VERT;
    if (value == PresetPatternValValueModel.NAR_HORZ) return PresetPatternValValueBuilder.NAR_HORZ;
    if (value == PresetPatternValValueModel.NAR_VERT) return PresetPatternValValueBuilder.NAR_VERT;
    if (value == PresetPatternValValueModel.DASH_HORZ) return PresetPatternValValueBuilder.DASH_HORZ;
    if (value == PresetPatternValValueModel.DASH_VERT) return PresetPatternValValueBuilder.DASH_VERT;
    if (value == PresetPatternValValueModel.CROSS) return PresetPatternValValueBuilder.CROSS;
    if (value == PresetPatternValValueModel.DN_DIAG) return PresetPatternValValueBuilder.DN_DIAG;
    if (value == PresetPatternValValueModel.UP_DIAG) return PresetPatternValValueBuilder.UP_DIAG;
    if (value == PresetPatternValValueModel.LT_DN_DIAG) return PresetPatternValValueBuilder.LT_DN_DIAG;
    if (value == PresetPatternValValueModel.LT_UP_DIAG) return PresetPatternValValueBuilder.LT_UP_DIAG;
    if (value == PresetPatternValValueModel.DK_DN_DIAG) return PresetPatternValValueBuilder.DK_DN_DIAG;
    if (value == PresetPatternValValueModel.DK_UP_DIAG) return PresetPatternValValueBuilder.DK_UP_DIAG;
    if (value == PresetPatternValValueModel.WD_DN_DIAG) return PresetPatternValValueBuilder.WD_DN_DIAG;
    if (value == PresetPatternValValueModel.WD_UP_DIAG) return PresetPatternValValueBuilder.WD_UP_DIAG;
    if (value == PresetPatternValValueModel.DASH_DN_DIAG) return PresetPatternValValueBuilder.DASH_DN_DIAG;
    if (value == PresetPatternValValueModel.DASH_UP_DIAG) return PresetPatternValValueBuilder.DASH_UP_DIAG;
    if (value == PresetPatternValValueModel.DIAG_CROSS) return PresetPatternValValueBuilder.DIAG_CROSS;
    if (value == PresetPatternValValueModel.SM_CHECK) return PresetPatternValValueBuilder.SM_CHECK;
    if (value == PresetPatternValValueModel.LG_CHECK) return PresetPatternValValueBuilder.LG_CHECK;
    if (value == PresetPatternValValueModel.SM_GRID) return PresetPatternValValueBuilder.SM_GRID;
    if (value == PresetPatternValValueModel.LG_GRID) return PresetPatternValValueBuilder.LG_GRID;
    if (value == PresetPatternValValueModel.DOT_GRID) return PresetPatternValValueBuilder.DOT_GRID;
    if (value == PresetPatternValValueModel.SM_CONFETTI) return PresetPatternValValueBuilder.SM_CONFETTI;
    if (value == PresetPatternValValueModel.LG_CONFETTI) return PresetPatternValValueBuilder.LG_CONFETTI;
    if (value == PresetPatternValValueModel.HORZ_BRICK) return PresetPatternValValueBuilder.HORZ_BRICK;
    if (value == PresetPatternValValueModel.DIAG_BRICK) return PresetPatternValValueBuilder.DIAG_BRICK;
    if (value == PresetPatternValValueModel.SOLID_DMND) return PresetPatternValValueBuilder.SOLID_DMND;
    if (value == PresetPatternValValueModel.OPEN_DMND) return PresetPatternValValueBuilder.OPEN_DMND;
    if (value == PresetPatternValValueModel.DOT_DMND) return PresetPatternValValueBuilder.DOT_DMND;
    if (value == PresetPatternValValueModel.PLAID) return PresetPatternValValueBuilder.PLAID;
    if (value == PresetPatternValValueModel.SPHERE) return PresetPatternValValueBuilder.SPHERE;
    if (value == PresetPatternValValueModel.WEAVE) return PresetPatternValValueBuilder.WEAVE;
    if (value == PresetPatternValValueModel.DIVOT) return PresetPatternValValueBuilder.DIVOT;
    if (value == PresetPatternValValueModel.SHINGLE) return PresetPatternValValueBuilder.SHINGLE;
    if (value == PresetPatternValValueModel.WAVE) return PresetPatternValValueBuilder.WAVE;
    if (value == PresetPatternValValueModel.TRELLIS) return PresetPatternValValueBuilder.TRELLIS;
    if (value == PresetPatternValValueModel.ZIG_ZAG) return PresetPatternValValueBuilder.ZIG_ZAG;
    return null;
  }
}
