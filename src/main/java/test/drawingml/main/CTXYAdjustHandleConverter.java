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
import test.drawingml.main.CTXYAdjustHandleModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTXYAdjustHandleConverter
{
	
	private CTXYAdjustHandleConverter() {
		// empty
	}
	
	public static CTXYAdjustHandleModel fromDocx4j(CTXYAdjustHandle value)
	{
		return new CTXYAdjustHandleModel(
		STAdjCoordinateConverter.fromDocx4j(value.getMaxX())
		,
		STGeomGuideNameConverter.fromDocx4j(value.getGdRefY())
		,
		STGeomGuideNameConverter.fromDocx4j(value.getGdRefX())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getMaxY())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getMinY())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getMinX())
		,
		CTAdjPoint2DConverter.fromDocx4j(value.getPos())
		
		);
	}
}
