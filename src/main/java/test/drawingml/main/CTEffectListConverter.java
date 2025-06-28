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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTEffectListModel.*;

// SEQUENCE CONVERTER
public class CTEffectListConverter
{
	
	private CTEffectListConverter() {
		// empty
	}
	
	public static CTEffectListModel fromDocx4j(CTEffectList value)
	{
		return new CTEffectListModel(
		CTBlurEffectConverter.fromDocx4j(value.getBlur())
		,
		CTFillOverlayEffectConverter.fromDocx4j(value.getFillOverlay())
		,
		CTGlowEffectConverter.fromDocx4j(value.getGlow())
		,
		CTInnerShadowEffectConverter.fromDocx4j(value.getInnerShdw())
		,
		CTOuterShadowEffectConverter.fromDocx4j(value.getOuterShdw())
		,
		CTPresetShadowEffectConverter.fromDocx4j(value.getPrstShdw())
		,
		CTReflectionEffectConverter.fromDocx4j(value.getReflection())
		,
		CTSoftEdgesEffectConverter.fromDocx4j(value.getSoftEdge())
		
		);
	}
}
