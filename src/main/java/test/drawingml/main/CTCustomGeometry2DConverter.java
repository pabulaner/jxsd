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
import test.drawingml.main.CTCustomGeometry2DModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTCustomGeometry2DConverter
{
	
	private CTCustomGeometry2DConverter() {
		// empty
	}
	
	public static CTCustomGeometry2DModel fromDocx4j(CTCustomGeometry2D value)
	{
		return new CTCustomGeometry2DModel(
		CTGeomGuideListConverter.fromDocx4j(value.getAvLst())
		,
		CTGeomGuideListConverter.fromDocx4j(value.getGdLst())
		,
		CTAdjustHandleListConverter.fromDocx4j(value.getAhLst())
		,
		CTConnectionSiteListConverter.fromDocx4j(value.getCxnLst())
		,
		CTGeomRectConverter.fromDocx4j(value.getRect())
		,
		CTPath2DListConverter.fromDocx4j(value.getPathLst())
		
		);
	}
}
