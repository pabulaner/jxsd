package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTEffectContainerModel.ContOrEffectOrAlphaBiLevelModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTEffectContainerModel.*;
import test.officeDocument.relationships.*;

public class CTEffectContainerConverter
{
	
	public static class ContOrEffectOrAlphaBiLevelConverter
	{
		
		private CTEffectContainerConverter() {
			// empty
		}
		
		public static CTEffectContainerModel fromDocx4j(CTEffectContainer value)
		{
			return new ContOrEffectOrAlphaBiLevelModel(
			CTEffectContainerConverter.fromDocx4j(value.getCont())
			,
			CTEffectReferenceConverter.fromDocx4j(value.getEffect())
			,
			CTAlphaBiLevelEffectConverter.fromDocx4j(value.getAlphaBiLevel())
			,
			CTAlphaCeilingEffectConverter.fromDocx4j(value.getAlphaCeiling())
			,
			CTAlphaFloorEffectConverter.fromDocx4j(value.getAlphaFloor())
			,
			CTAlphaInverseEffectConverter.fromDocx4j(value.getAlphaInv())
			,
			CTAlphaModulateEffectConverter.fromDocx4j(value.getAlphaMod())
			,
			CTAlphaModulateFixedEffectConverter.fromDocx4j(value.getAlphaModFix())
			,
			CTAlphaOutsetEffectConverter.fromDocx4j(value.getAlphaOutset())
			,
			CTAlphaReplaceEffectConverter.fromDocx4j(value.getAlphaRepl())
			,
			CTBiLevelEffectConverter.fromDocx4j(value.getBiLevel())
			,
			CTBlendEffectConverter.fromDocx4j(value.getBlend())
			,
			CTBlurEffectConverter.fromDocx4j(value.getBlur())
			,
			CTColorChangeEffectConverter.fromDocx4j(value.getClrChange())
			,
			CTColorReplaceEffectConverter.fromDocx4j(value.getClrRepl())
			,
			CTDuotoneEffectConverter.fromDocx4j(value.getDuotone())
			,
			CTFillEffectConverter.fromDocx4j(value.getFill())
			,
			CTFillOverlayEffectConverter.fromDocx4j(value.getFillOverlay())
			,
			CTGlowEffectConverter.fromDocx4j(value.getGlow())
			,
			CTGrayscaleEffectConverter.fromDocx4j(value.getGrayscl())
			,
			CTHSLEffectConverter.fromDocx4j(value.getHsl())
			,
			CTInnerShadowEffectConverter.fromDocx4j(value.getInnerShdw())
			,
			CTLuminanceEffectConverter.fromDocx4j(value.getLum())
			,
			CTOuterShadowEffectConverter.fromDocx4j(value.getOuterShdw())
			,
			CTPresetShadowEffectConverter.fromDocx4j(value.getPrstShdw())
			,
			CTReflectionEffectConverter.fromDocx4j(value.getReflection())
			,
			CTRelativeOffsetEffectConverter.fromDocx4j(value.getRelOff())
			,
			CTSoftEdgesEffectConverter.fromDocx4j(value.getSoftEdge())
			,
			CTTintEffectConverter.fromDocx4j(value.getTint())
			,
			CTTransformEffectConverter.fromDocx4j(value.getXfrm())
			
			);
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
		value.getContOrEffectOrAlphaBiLevel().stream().map(ContOrEffectOrAlphaBiLevelConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
