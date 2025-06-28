package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTPresetColorModel.TintOrShadeOrCompModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTPresetColorModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPresetColorModel
{
	
	// CHOICE MODEL
	public static class TintOrShadeOrCompModel
	{
		
		private final int type;
		
		private final Object value;
		
		public TintOrShadeOrCompModel() {
			this(-1, null);
		}
		
		private TintOrShadeOrCompModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static TintOrShadeOrCompModel createTint(CTPositiveFixedPercentageModel value) {
			return new TintOrShadeOrCompModel(0, value);
		}
		public static TintOrShadeOrCompModel createShade(CTPositiveFixedPercentageModel value) {
			return new TintOrShadeOrCompModel(1, value);
		}
		public static TintOrShadeOrCompModel createComp(CTComplementTransformModel value) {
			return new TintOrShadeOrCompModel(2, value);
		}
		public static TintOrShadeOrCompModel createInv(CTInverseTransformModel value) {
			return new TintOrShadeOrCompModel(3, value);
		}
		public static TintOrShadeOrCompModel createGray(CTGrayscaleTransformModel value) {
			return new TintOrShadeOrCompModel(4, value);
		}
		public static TintOrShadeOrCompModel createAlpha(CTPositiveFixedPercentageModel value) {
			return new TintOrShadeOrCompModel(5, value);
		}
		public static TintOrShadeOrCompModel createAlphaOff(CTFixedPercentageModel value) {
			return new TintOrShadeOrCompModel(6, value);
		}
		public static TintOrShadeOrCompModel createAlphaMod(CTPositivePercentageModel value) {
			return new TintOrShadeOrCompModel(7, value);
		}
		public static TintOrShadeOrCompModel createHue(CTPositiveFixedAngleModel value) {
			return new TintOrShadeOrCompModel(8, value);
		}
		public static TintOrShadeOrCompModel createHueOff(CTAngleModel value) {
			return new TintOrShadeOrCompModel(9, value);
		}
		public static TintOrShadeOrCompModel createHueMod(CTPositivePercentageModel value) {
			return new TintOrShadeOrCompModel(10, value);
		}
		public static TintOrShadeOrCompModel createSat(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(11, value);
		}
		public static TintOrShadeOrCompModel createSatOff(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(12, value);
		}
		public static TintOrShadeOrCompModel createSatMod(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(13, value);
		}
		public static TintOrShadeOrCompModel createLum(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(14, value);
		}
		public static TintOrShadeOrCompModel createLumOff(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(15, value);
		}
		public static TintOrShadeOrCompModel createLumMod(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(16, value);
		}
		public static TintOrShadeOrCompModel createRed(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(17, value);
		}
		public static TintOrShadeOrCompModel createRedOff(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(18, value);
		}
		public static TintOrShadeOrCompModel createRedMod(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(19, value);
		}
		public static TintOrShadeOrCompModel createGreen(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(20, value);
		}
		public static TintOrShadeOrCompModel createGreenOff(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(21, value);
		}
		public static TintOrShadeOrCompModel createGreenMod(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(22, value);
		}
		public static TintOrShadeOrCompModel createBlue(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(23, value);
		}
		public static TintOrShadeOrCompModel createBlueOff(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(24, value);
		}
		public static TintOrShadeOrCompModel createBlueMod(CTPercentageModel value) {
			return new TintOrShadeOrCompModel(25, value);
		}
		public static TintOrShadeOrCompModel createGamma(CTGammaTransformModel value) {
			return new TintOrShadeOrCompModel(26, value);
		}
		public static TintOrShadeOrCompModel createInvGamma(CTInverseGammaTransformModel value) {
			return new TintOrShadeOrCompModel(27, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isTint() {
			return this.type == 0;
		}
		
		public CTPositiveFixedPercentageModel getTint() {
			if (this.type != 0) throw new ClassCastException();
			return (CTPositiveFixedPercentageModel) value;
		}
		public boolean isShade() {
			return this.type == 1;
		}
		
		public CTPositiveFixedPercentageModel getShade() {
			if (this.type != 1) throw new ClassCastException();
			return (CTPositiveFixedPercentageModel) value;
		}
		public boolean isComp() {
			return this.type == 2;
		}
		
		public CTComplementTransformModel getComp() {
			if (this.type != 2) throw new ClassCastException();
			return (CTComplementTransformModel) value;
		}
		public boolean isInv() {
			return this.type == 3;
		}
		
		public CTInverseTransformModel getInv() {
			if (this.type != 3) throw new ClassCastException();
			return (CTInverseTransformModel) value;
		}
		public boolean isGray() {
			return this.type == 4;
		}
		
		public CTGrayscaleTransformModel getGray() {
			if (this.type != 4) throw new ClassCastException();
			return (CTGrayscaleTransformModel) value;
		}
		public boolean isAlpha() {
			return this.type == 5;
		}
		
		public CTPositiveFixedPercentageModel getAlpha() {
			if (this.type != 5) throw new ClassCastException();
			return (CTPositiveFixedPercentageModel) value;
		}
		public boolean isAlphaOff() {
			return this.type == 6;
		}
		
		public CTFixedPercentageModel getAlphaOff() {
			if (this.type != 6) throw new ClassCastException();
			return (CTFixedPercentageModel) value;
		}
		public boolean isAlphaMod() {
			return this.type == 7;
		}
		
		public CTPositivePercentageModel getAlphaMod() {
			if (this.type != 7) throw new ClassCastException();
			return (CTPositivePercentageModel) value;
		}
		public boolean isHue() {
			return this.type == 8;
		}
		
		public CTPositiveFixedAngleModel getHue() {
			if (this.type != 8) throw new ClassCastException();
			return (CTPositiveFixedAngleModel) value;
		}
		public boolean isHueOff() {
			return this.type == 9;
		}
		
		public CTAngleModel getHueOff() {
			if (this.type != 9) throw new ClassCastException();
			return (CTAngleModel) value;
		}
		public boolean isHueMod() {
			return this.type == 10;
		}
		
		public CTPositivePercentageModel getHueMod() {
			if (this.type != 10) throw new ClassCastException();
			return (CTPositivePercentageModel) value;
		}
		public boolean isSat() {
			return this.type == 11;
		}
		
		public CTPercentageModel getSat() {
			if (this.type != 11) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isSatOff() {
			return this.type == 12;
		}
		
		public CTPercentageModel getSatOff() {
			if (this.type != 12) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isSatMod() {
			return this.type == 13;
		}
		
		public CTPercentageModel getSatMod() {
			if (this.type != 13) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isLum() {
			return this.type == 14;
		}
		
		public CTPercentageModel getLum() {
			if (this.type != 14) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isLumOff() {
			return this.type == 15;
		}
		
		public CTPercentageModel getLumOff() {
			if (this.type != 15) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isLumMod() {
			return this.type == 16;
		}
		
		public CTPercentageModel getLumMod() {
			if (this.type != 16) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isRed() {
			return this.type == 17;
		}
		
		public CTPercentageModel getRed() {
			if (this.type != 17) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isRedOff() {
			return this.type == 18;
		}
		
		public CTPercentageModel getRedOff() {
			if (this.type != 18) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isRedMod() {
			return this.type == 19;
		}
		
		public CTPercentageModel getRedMod() {
			if (this.type != 19) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isGreen() {
			return this.type == 20;
		}
		
		public CTPercentageModel getGreen() {
			if (this.type != 20) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isGreenOff() {
			return this.type == 21;
		}
		
		public CTPercentageModel getGreenOff() {
			if (this.type != 21) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isGreenMod() {
			return this.type == 22;
		}
		
		public CTPercentageModel getGreenMod() {
			if (this.type != 22) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isBlue() {
			return this.type == 23;
		}
		
		public CTPercentageModel getBlue() {
			if (this.type != 23) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isBlueOff() {
			return this.type == 24;
		}
		
		public CTPercentageModel getBlueOff() {
			if (this.type != 24) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isBlueMod() {
			return this.type == 25;
		}
		
		public CTPercentageModel getBlueMod() {
			if (this.type != 25) throw new ClassCastException();
			return (CTPercentageModel) value;
		}
		public boolean isGamma() {
			return this.type == 26;
		}
		
		public CTGammaTransformModel getGamma() {
			if (this.type != 26) throw new ClassCastException();
			return (CTGammaTransformModel) value;
		}
		public boolean isInvGamma() {
			return this.type == 27;
		}
		
		public CTInverseGammaTransformModel getInvGamma() {
			if (this.type != 27) throw new ClassCastException();
			return (CTInverseGammaTransformModel) value;
		}
	}
	private final STPresetColorValModel val;
	private final List<TintOrShadeOrCompModel> tintOrShadeOrComp;
	
	public CTPresetColorModel(STPresetColorValModel val, List<TintOrShadeOrCompModel> tintOrShadeOrComp) {
		this.val = val;
		this.tintOrShadeOrComp = tintOrShadeOrComp;
	}
	
	public STPresetColorValModel getVal() {
		return this.val;
	}
	public List<TintOrShadeOrCompModel> getTintOrShadeOrComp() {
		return this.tintOrShadeOrComp;
	}
}
