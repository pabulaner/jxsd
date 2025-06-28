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
import test.drawingml.main.CTPresetGeometry2DModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPresetGeometry2DConverter
{
	
	private CTPresetGeometry2DConverter() {
		// empty
	}
	
	public static CTPresetGeometry2DModel fromDocx4j(CTPresetGeometry2D value)
	{
		return new CTPresetGeometry2DModel(
		STShapeTypeConverter.fromDocx4j(value.getPrst())
		,
		CTGeomGuideListConverter.fromDocx4j(value.getAvLst())
		
		);
	}
}
