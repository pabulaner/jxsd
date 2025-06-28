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
import test.drawingml.main.CTEffectContainerModel.ContOrEffectOrAlphaBiLevelModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTEffectContainerModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTEffectContainerModel
{
	
	// CHOICE MODEL
	public static class ContOrEffectOrAlphaBiLevelModel
	{
		
		private final int type;
		
		private final Object value;
		
		public ContOrEffectOrAlphaBiLevelModel() {
			this(-1, null);
		}
		
		private ContOrEffectOrAlphaBiLevelModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static ContOrEffectOrAlphaBiLevelModel createCont(CTEffectContainerModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(0, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createEffect(CTEffectReferenceModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(1, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaBiLevel(CTAlphaBiLevelEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(2, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaCeiling(CTAlphaCeilingEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(3, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaFloor(CTAlphaFloorEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(4, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaInv(CTAlphaInverseEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(5, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaMod(CTAlphaModulateEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(6, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaModFix(CTAlphaModulateFixedEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(7, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaOutset(CTAlphaOutsetEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(8, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createAlphaRepl(CTAlphaReplaceEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(9, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createBiLevel(CTBiLevelEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(10, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createBlend(CTBlendEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(11, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createBlur(CTBlurEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(12, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createClrChange(CTColorChangeEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(13, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createClrRepl(CTColorReplaceEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(14, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createDuotone(CTDuotoneEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(15, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createFill(CTFillEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(16, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createFillOverlay(CTFillOverlayEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(17, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createGlow(CTGlowEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(18, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createGrayscl(CTGrayscaleEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(19, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createHsl(CTHSLEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(20, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createInnerShdw(CTInnerShadowEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(21, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createLum(CTLuminanceEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(22, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createOuterShdw(CTOuterShadowEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(23, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createPrstShdw(CTPresetShadowEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(24, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createReflection(CTReflectionEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(25, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createRelOff(CTRelativeOffsetEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(26, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createSoftEdge(CTSoftEdgesEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(27, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createTint(CTTintEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(28, value);
		}
		public static ContOrEffectOrAlphaBiLevelModel createXfrm(CTTransformEffectModel value) {
			return new ContOrEffectOrAlphaBiLevelModel(29, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isCont() {
			return this.type == 0;
		}
		
		public CTEffectContainerModel getCont() {
			if (this.type != 0) throw new ClassCastException();
			return (CTEffectContainerModel) value;
		}
		public boolean isEffect() {
			return this.type == 1;
		}
		
		public CTEffectReferenceModel getEffect() {
			if (this.type != 1) throw new ClassCastException();
			return (CTEffectReferenceModel) value;
		}
		public boolean isAlphaBiLevel() {
			return this.type == 2;
		}
		
		public CTAlphaBiLevelEffectModel getAlphaBiLevel() {
			if (this.type != 2) throw new ClassCastException();
			return (CTAlphaBiLevelEffectModel) value;
		}
		public boolean isAlphaCeiling() {
			return this.type == 3;
		}
		
		public CTAlphaCeilingEffectModel getAlphaCeiling() {
			if (this.type != 3) throw new ClassCastException();
			return (CTAlphaCeilingEffectModel) value;
		}
		public boolean isAlphaFloor() {
			return this.type == 4;
		}
		
		public CTAlphaFloorEffectModel getAlphaFloor() {
			if (this.type != 4) throw new ClassCastException();
			return (CTAlphaFloorEffectModel) value;
		}
		public boolean isAlphaInv() {
			return this.type == 5;
		}
		
		public CTAlphaInverseEffectModel getAlphaInv() {
			if (this.type != 5) throw new ClassCastException();
			return (CTAlphaInverseEffectModel) value;
		}
		public boolean isAlphaMod() {
			return this.type == 6;
		}
		
		public CTAlphaModulateEffectModel getAlphaMod() {
			if (this.type != 6) throw new ClassCastException();
			return (CTAlphaModulateEffectModel) value;
		}
		public boolean isAlphaModFix() {
			return this.type == 7;
		}
		
		public CTAlphaModulateFixedEffectModel getAlphaModFix() {
			if (this.type != 7) throw new ClassCastException();
			return (CTAlphaModulateFixedEffectModel) value;
		}
		public boolean isAlphaOutset() {
			return this.type == 8;
		}
		
		public CTAlphaOutsetEffectModel getAlphaOutset() {
			if (this.type != 8) throw new ClassCastException();
			return (CTAlphaOutsetEffectModel) value;
		}
		public boolean isAlphaRepl() {
			return this.type == 9;
		}
		
		public CTAlphaReplaceEffectModel getAlphaRepl() {
			if (this.type != 9) throw new ClassCastException();
			return (CTAlphaReplaceEffectModel) value;
		}
		public boolean isBiLevel() {
			return this.type == 10;
		}
		
		public CTBiLevelEffectModel getBiLevel() {
			if (this.type != 10) throw new ClassCastException();
			return (CTBiLevelEffectModel) value;
		}
		public boolean isBlend() {
			return this.type == 11;
		}
		
		public CTBlendEffectModel getBlend() {
			if (this.type != 11) throw new ClassCastException();
			return (CTBlendEffectModel) value;
		}
		public boolean isBlur() {
			return this.type == 12;
		}
		
		public CTBlurEffectModel getBlur() {
			if (this.type != 12) throw new ClassCastException();
			return (CTBlurEffectModel) value;
		}
		public boolean isClrChange() {
			return this.type == 13;
		}
		
		public CTColorChangeEffectModel getClrChange() {
			if (this.type != 13) throw new ClassCastException();
			return (CTColorChangeEffectModel) value;
		}
		public boolean isClrRepl() {
			return this.type == 14;
		}
		
		public CTColorReplaceEffectModel getClrRepl() {
			if (this.type != 14) throw new ClassCastException();
			return (CTColorReplaceEffectModel) value;
		}
		public boolean isDuotone() {
			return this.type == 15;
		}
		
		public CTDuotoneEffectModel getDuotone() {
			if (this.type != 15) throw new ClassCastException();
			return (CTDuotoneEffectModel) value;
		}
		public boolean isFill() {
			return this.type == 16;
		}
		
		public CTFillEffectModel getFill() {
			if (this.type != 16) throw new ClassCastException();
			return (CTFillEffectModel) value;
		}
		public boolean isFillOverlay() {
			return this.type == 17;
		}
		
		public CTFillOverlayEffectModel getFillOverlay() {
			if (this.type != 17) throw new ClassCastException();
			return (CTFillOverlayEffectModel) value;
		}
		public boolean isGlow() {
			return this.type == 18;
		}
		
		public CTGlowEffectModel getGlow() {
			if (this.type != 18) throw new ClassCastException();
			return (CTGlowEffectModel) value;
		}
		public boolean isGrayscl() {
			return this.type == 19;
		}
		
		public CTGrayscaleEffectModel getGrayscl() {
			if (this.type != 19) throw new ClassCastException();
			return (CTGrayscaleEffectModel) value;
		}
		public boolean isHsl() {
			return this.type == 20;
		}
		
		public CTHSLEffectModel getHsl() {
			if (this.type != 20) throw new ClassCastException();
			return (CTHSLEffectModel) value;
		}
		public boolean isInnerShdw() {
			return this.type == 21;
		}
		
		public CTInnerShadowEffectModel getInnerShdw() {
			if (this.type != 21) throw new ClassCastException();
			return (CTInnerShadowEffectModel) value;
		}
		public boolean isLum() {
			return this.type == 22;
		}
		
		public CTLuminanceEffectModel getLum() {
			if (this.type != 22) throw new ClassCastException();
			return (CTLuminanceEffectModel) value;
		}
		public boolean isOuterShdw() {
			return this.type == 23;
		}
		
		public CTOuterShadowEffectModel getOuterShdw() {
			if (this.type != 23) throw new ClassCastException();
			return (CTOuterShadowEffectModel) value;
		}
		public boolean isPrstShdw() {
			return this.type == 24;
		}
		
		public CTPresetShadowEffectModel getPrstShdw() {
			if (this.type != 24) throw new ClassCastException();
			return (CTPresetShadowEffectModel) value;
		}
		public boolean isReflection() {
			return this.type == 25;
		}
		
		public CTReflectionEffectModel getReflection() {
			if (this.type != 25) throw new ClassCastException();
			return (CTReflectionEffectModel) value;
		}
		public boolean isRelOff() {
			return this.type == 26;
		}
		
		public CTRelativeOffsetEffectModel getRelOff() {
			if (this.type != 26) throw new ClassCastException();
			return (CTRelativeOffsetEffectModel) value;
		}
		public boolean isSoftEdge() {
			return this.type == 27;
		}
		
		public CTSoftEdgesEffectModel getSoftEdge() {
			if (this.type != 27) throw new ClassCastException();
			return (CTSoftEdgesEffectModel) value;
		}
		public boolean isTint() {
			return this.type == 28;
		}
		
		public CTTintEffectModel getTint() {
			if (this.type != 28) throw new ClassCastException();
			return (CTTintEffectModel) value;
		}
		public boolean isXfrm() {
			return this.type == 29;
		}
		
		public CTTransformEffectModel getXfrm() {
			if (this.type != 29) throw new ClassCastException();
			return (CTTransformEffectModel) value;
		}
	}
	private final STEffectContainerTypeModel type;
	private final TokenModel name;
	private final List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel;
	
	public CTEffectContainerModel(STEffectContainerTypeModel type, TokenModel name, List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel) {
		this.type = type;
		this.name = name;
		this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
	}
	
	public STEffectContainerTypeModel getType() {
		return this.type;
	}
	public TokenModel getName() {
		return this.name;
	}
	public List<ContOrEffectOrAlphaBiLevelModel> getContOrEffectOrAlphaBiLevel() {
		return this.contOrEffectOrAlphaBiLevel;
	}
}
