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
import test.drawingml.main.CTReflectionEffectModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTReflectionEffectConverter
{
	
	private CTReflectionEffectConverter() {
		// empty
	}
	
	public static CTReflectionEffectModel fromDocx4j(CTReflectionEffect value)
	{
		return new CTReflectionEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getBlurRad())
		,
		STPositiveFixedPercentageConverter.fromDocx4j(value.getEndPos())
		,
		STPercentageConverter.fromDocx4j(value.getSy())
		,
		STFixedAngleConverter.fromDocx4j(value.getKx())
		,
		STPositiveFixedPercentageConverter.fromDocx4j(value.getStA())
		,
		STPositiveFixedPercentageConverter.fromDocx4j(value.getStPos())
		,
		STRectAlignmentConverter.fromDocx4j(value.getAlgn())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getDist())
		,
		BooleanConverter.fromDocx4j(value.getRotWithShape())
		,
		STFixedAngleConverter.fromDocx4j(value.getKy())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getFadeDir())
		,
		STPercentageConverter.fromDocx4j(value.getSx())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getDir())
		,
		STPositiveFixedPercentageConverter.fromDocx4j(value.getEndA())
		
		);
	}
}
