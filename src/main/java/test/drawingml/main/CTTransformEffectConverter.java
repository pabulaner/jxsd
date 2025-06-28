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
import test.drawingml.main.CTTransformEffectModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTransformEffectConverter
{
	
	private CTTransformEffectConverter() {
		// empty
	}
	
	public static CTTransformEffectModel fromDocx4j(CTTransformEffect value)
	{
		return new CTTransformEffectModel(
		STPercentageConverter.fromDocx4j(value.getSy())
		,
		STFixedAngleConverter.fromDocx4j(value.getKy())
		,
		STPercentageConverter.fromDocx4j(value.getSx())
		,
		STCoordinateConverter.fromDocx4j(value.getTy())
		,
		STFixedAngleConverter.fromDocx4j(value.getKx())
		,
		STCoordinateConverter.fromDocx4j(value.getTx())
		
		);
	}
}
