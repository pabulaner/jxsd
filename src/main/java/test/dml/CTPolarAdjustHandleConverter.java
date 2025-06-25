package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPolarAdjustHandleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPolarAdjustHandleConverter
{
	
	private CTPolarAdjustHandleConverter() {
		// empty
	}
	
	public static CTPolarAdjustHandleModel fromDocx4j(CTPolarAdjustHandle value)
	{
		return new CTPolarAdjustHandleModel(
		STGeomGuideNameConverter.fromDocx4j(value.getGdRefAng())
		,
		STGeomGuideNameConverter.fromDocx4j(value.getGdRefR())
		,
		STAdjAngleConverter.fromDocx4j(value.getMaxAng())
		,
		STAdjAngleConverter.fromDocx4j(value.getMinAng())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getMaxR())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getMinR())
		,
		CTAdjPoint2DConverter.fromDocx4j(value.getPos())
		
		);
	}
}
