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

// SEQUENCE CONVERTER
public class CTEffectContainerConverter
{
	
	// CHOICE CONVERTER
	public static class ContOrEffectOrAlphaBiLevelConverter
	{
		
		private ContOrEffectOrAlphaBiLevelConverter() {
			// empty
		}
		
		public static ContOrEffectOrAlphaBiLevelModel fromDocx4j(ContOrEffectOrAlphaBiLevel value)
		{
			if (value.getCont() != null) return ContOrEffectOrAlphaBiLevelModel.createCont(
			CTEffectContainerConverter.fromDocx4j(value.getCont())
			);
			if (value.getEffect() != null) return ContOrEffectOrAlphaBiLevelModel.createEffect(
			CTEffectReferenceConverter.fromDocx4j(value.getEffect())
			);
			if (value.getAlphaBiLevel() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaBiLevel(
			CTAlphaBiLevelEffectConverter.fromDocx4j(value.getAlphaBiLevel())
			);
			if (value.getAlphaCeiling() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaCeiling(
			CTAlphaCeilingEffectConverter.fromDocx4j(value.getAlphaCeiling())
			);
			if (value.getAlphaFloor() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaFloor(
			CTAlphaFloorEffectConverter.fromDocx4j(value.getAlphaFloor())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTAlphaInverseEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTAlphaInverseEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTAlphaInverseEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTAlphaInverseEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTAlphaInverseEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTAlphaInverseEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getAlphaMod() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaMod(
			CTAlphaModulateEffectConverter.fromDocx4j(value.getAlphaMod())
			);
			if (value.getAlphaModFix() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaModFix(
			CTAlphaModulateFixedEffectConverter.fromDocx4j(value.getAlphaModFix())
			);
			if (value.getAlphaOutset() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaOutset(
			CTAlphaOutsetEffectConverter.fromDocx4j(value.getAlphaOutset())
			);
			if (value.getAlphaRepl() != null) return ContOrEffectOrAlphaBiLevelModel.createAlphaRepl(
			CTAlphaReplaceEffectConverter.fromDocx4j(value.getAlphaRepl())
			);
			if (value.getBiLevel() != null) return ContOrEffectOrAlphaBiLevelModel.createBiLevel(
			CTBiLevelEffectConverter.fromDocx4j(value.getBiLevel())
			);
			if (value.getBlend() != null) return ContOrEffectOrAlphaBiLevelModel.createBlend(
			CTBlendEffectConverter.fromDocx4j(value.getBlend())
			);
			if (value.getBlur() != null) return ContOrEffectOrAlphaBiLevelModel.createBlur(
			CTBlurEffectConverter.fromDocx4j(value.getBlur())
			);
			if (value.getClrChange() != null) return ContOrEffectOrAlphaBiLevelModel.createClrChange(
			CTColorChangeEffectConverter.fromDocx4j(value.getClrChange())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTColorReplaceEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTColorReplaceEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTColorReplaceEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTColorReplaceEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTColorReplaceEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTColorReplaceEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTDuotoneEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTDuotoneEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTDuotoneEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTDuotoneEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTDuotoneEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTDuotoneEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			// THIS IS A JAVA CHOICE
			if (value.getNoFill != null) return CTFillEffectModel.createNoFill(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			);
			if (value.getSolidFill != null) return CTFillEffectModel.createSolidFill(
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			);
			if (value.getGradFill != null) return CTFillEffectModel.createGradFill(
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			);
			if (value.getBlipFill != null) return CTFillEffectModel.createBlipFill(
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			);
			if (value.getPattFill != null) return CTFillEffectModel.createPattFill(
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			);
			if (value.getGrpFill != null) return CTFillEffectModel.createGrpFill(
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getFillOverlay() != null) return ContOrEffectOrAlphaBiLevelModel.createFillOverlay(
			CTFillOverlayEffectConverter.fromDocx4j(value.getFillOverlay())
			);
			if (value.getGlow() != null) return ContOrEffectOrAlphaBiLevelModel.createGlow(
			CTGlowEffectConverter.fromDocx4j(value.getGlow())
			);
			if (value.getGrayscl() != null) return ContOrEffectOrAlphaBiLevelModel.createGrayscl(
			CTGrayscaleEffectConverter.fromDocx4j(value.getGrayscl())
			);
			if (value.getHsl() != null) return ContOrEffectOrAlphaBiLevelModel.createHsl(
			CTHSLEffectConverter.fromDocx4j(value.getHsl())
			);
			if (value.getInnerShdw() != null) return ContOrEffectOrAlphaBiLevelModel.createInnerShdw(
			CTInnerShadowEffectConverter.fromDocx4j(value.getInnerShdw())
			);
			if (value.getLum() != null) return ContOrEffectOrAlphaBiLevelModel.createLum(
			CTLuminanceEffectConverter.fromDocx4j(value.getLum())
			);
			if (value.getOuterShdw() != null) return ContOrEffectOrAlphaBiLevelModel.createOuterShdw(
			CTOuterShadowEffectConverter.fromDocx4j(value.getOuterShdw())
			);
			if (value.getPrstShdw() != null) return ContOrEffectOrAlphaBiLevelModel.createPrstShdw(
			CTPresetShadowEffectConverter.fromDocx4j(value.getPrstShdw())
			);
			if (value.getReflection() != null) return ContOrEffectOrAlphaBiLevelModel.createReflection(
			CTReflectionEffectConverter.fromDocx4j(value.getReflection())
			);
			if (value.getRelOff() != null) return ContOrEffectOrAlphaBiLevelModel.createRelOff(
			CTRelativeOffsetEffectConverter.fromDocx4j(value.getRelOff())
			);
			if (value.getSoftEdge() != null) return ContOrEffectOrAlphaBiLevelModel.createSoftEdge(
			CTSoftEdgesEffectConverter.fromDocx4j(value.getSoftEdge())
			);
			if (value.getTint() != null) return ContOrEffectOrAlphaBiLevelModel.createTint(
			CTTintEffectConverter.fromDocx4j(value.getTint())
			);
			if (value.getXfrm() != null) return ContOrEffectOrAlphaBiLevelModel.createXfrm(
			CTTransformEffectConverter.fromDocx4j(value.getXfrm())
			);
			
			return new ContOrEffectOrAlphaBiLevelModel();
		}
	}
	private CTEffectContainerConverter() {
		// empty
	}
	
	public static CTEffectContainerModel fromDocx4j(CTEffectContainer value)
	{
		return new CTEffectContainerModel(
		STEffectContainerTypeConverter.fromDocx4j(value.getType())
		,
		TokenConverter.fromDocx4j(value.getName())
		,
		value.getContOrEffectOrAlphaBiLevel().stream().map(ContOrEffectOrAlphaBiLevelConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
