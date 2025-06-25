package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTXYAdjustHandleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
