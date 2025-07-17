package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetPatternValModel;
import org.docx4j.dml.STPresetPatternVal;

public class ST_PresetPatternValConverter {
  private ST_PresetPatternValConverter() {
  }

  public static ST_PresetPatternValModel fromDocx4j(STPresetPatternVal value) {
    if (value == null) return null;
    if (value == STPresetPatternVal.PCT5) return ST_PresetPatternValModel.PCT5;
    if (value == STPresetPatternVal.PCT10) return ST_PresetPatternValModel.PCT10;
    if (value == STPresetPatternVal.PCT20) return ST_PresetPatternValModel.PCT20;
    if (value == STPresetPatternVal.PCT25) return ST_PresetPatternValModel.PCT25;
    if (value == STPresetPatternVal.PCT30) return ST_PresetPatternValModel.PCT30;
    if (value == STPresetPatternVal.PCT40) return ST_PresetPatternValModel.PCT40;
    if (value == STPresetPatternVal.PCT50) return ST_PresetPatternValModel.PCT50;
    if (value == STPresetPatternVal.PCT60) return ST_PresetPatternValModel.PCT60;
    if (value == STPresetPatternVal.PCT70) return ST_PresetPatternValModel.PCT70;
    if (value == STPresetPatternVal.PCT75) return ST_PresetPatternValModel.PCT75;
    if (value == STPresetPatternVal.PCT80) return ST_PresetPatternValModel.PCT80;
    if (value == STPresetPatternVal.PCT90) return ST_PresetPatternValModel.PCT90;
    if (value == STPresetPatternVal.HORZ) return ST_PresetPatternValModel.HORZ;
    if (value == STPresetPatternVal.VERT) return ST_PresetPatternValModel.VERT;
    if (value == STPresetPatternVal.LT_HORZ) return ST_PresetPatternValModel.LT_HORZ;
    if (value == STPresetPatternVal.LT_VERT) return ST_PresetPatternValModel.LT_VERT;
    if (value == STPresetPatternVal.DK_HORZ) return ST_PresetPatternValModel.DK_HORZ;
    if (value == STPresetPatternVal.DK_VERT) return ST_PresetPatternValModel.DK_VERT;
    if (value == STPresetPatternVal.NAR_HORZ) return ST_PresetPatternValModel.NAR_HORZ;
    if (value == STPresetPatternVal.NAR_VERT) return ST_PresetPatternValModel.NAR_VERT;
    if (value == STPresetPatternVal.DASH_HORZ) return ST_PresetPatternValModel.DASH_HORZ;
    if (value == STPresetPatternVal.DASH_VERT) return ST_PresetPatternValModel.DASH_VERT;
    if (value == STPresetPatternVal.CROSS) return ST_PresetPatternValModel.CROSS;
    if (value == STPresetPatternVal.DN_DIAG) return ST_PresetPatternValModel.DN_DIAG;
    if (value == STPresetPatternVal.UP_DIAG) return ST_PresetPatternValModel.UP_DIAG;
    if (value == STPresetPatternVal.LT_DN_DIAG) return ST_PresetPatternValModel.LT_DN_DIAG;
    if (value == STPresetPatternVal.LT_UP_DIAG) return ST_PresetPatternValModel.LT_UP_DIAG;
    if (value == STPresetPatternVal.DK_DN_DIAG) return ST_PresetPatternValModel.DK_DN_DIAG;
    if (value == STPresetPatternVal.DK_UP_DIAG) return ST_PresetPatternValModel.DK_UP_DIAG;
    if (value == STPresetPatternVal.WD_DN_DIAG) return ST_PresetPatternValModel.WD_DN_DIAG;
    if (value == STPresetPatternVal.WD_UP_DIAG) return ST_PresetPatternValModel.WD_UP_DIAG;
    if (value == STPresetPatternVal.DASH_DN_DIAG) return ST_PresetPatternValModel.DASH_DN_DIAG;
    if (value == STPresetPatternVal.DASH_UP_DIAG) return ST_PresetPatternValModel.DASH_UP_DIAG;
    if (value == STPresetPatternVal.DIAG_CROSS) return ST_PresetPatternValModel.DIAG_CROSS;
    if (value == STPresetPatternVal.SM_CHECK) return ST_PresetPatternValModel.SM_CHECK;
    if (value == STPresetPatternVal.LG_CHECK) return ST_PresetPatternValModel.LG_CHECK;
    if (value == STPresetPatternVal.SM_GRID) return ST_PresetPatternValModel.SM_GRID;
    if (value == STPresetPatternVal.LG_GRID) return ST_PresetPatternValModel.LG_GRID;
    if (value == STPresetPatternVal.DOT_GRID) return ST_PresetPatternValModel.DOT_GRID;
    if (value == STPresetPatternVal.SM_CONFETTI) return ST_PresetPatternValModel.SM_CONFETTI;
    if (value == STPresetPatternVal.LG_CONFETTI) return ST_PresetPatternValModel.LG_CONFETTI;
    if (value == STPresetPatternVal.HORZ_BRICK) return ST_PresetPatternValModel.HORZ_BRICK;
    if (value == STPresetPatternVal.DIAG_BRICK) return ST_PresetPatternValModel.DIAG_BRICK;
    if (value == STPresetPatternVal.SOLID_DMND) return ST_PresetPatternValModel.SOLID_DMND;
    if (value == STPresetPatternVal.OPEN_DMND) return ST_PresetPatternValModel.OPEN_DMND;
    if (value == STPresetPatternVal.DOT_DMND) return ST_PresetPatternValModel.DOT_DMND;
    if (value == STPresetPatternVal.PLAID) return ST_PresetPatternValModel.PLAID;
    if (value == STPresetPatternVal.SPHERE) return ST_PresetPatternValModel.SPHERE;
    if (value == STPresetPatternVal.WEAVE) return ST_PresetPatternValModel.WEAVE;
    if (value == STPresetPatternVal.DIVOT) return ST_PresetPatternValModel.DIVOT;
    if (value == STPresetPatternVal.SHINGLE) return ST_PresetPatternValModel.SHINGLE;
    if (value == STPresetPatternVal.WAVE) return ST_PresetPatternValModel.WAVE;
    if (value == STPresetPatternVal.TRELLIS) return ST_PresetPatternValModel.TRELLIS;
    if (value == STPresetPatternVal.ZIG_ZAG) return ST_PresetPatternValModel.ZIG_ZAG;
    return null;
  }

  public static STPresetPatternVal toDocx4j(ST_PresetPatternValModel value) {
    return null;
  }
}
