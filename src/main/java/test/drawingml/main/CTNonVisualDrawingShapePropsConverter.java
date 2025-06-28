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
import test.drawingml.main.CTNonVisualDrawingShapePropsModel.*;

// SEQUENCE CONVERTER
public class CTNonVisualDrawingShapePropsConverter
{
	
	private CTNonVisualDrawingShapePropsConverter() {
		// empty
	}
	
	public static CTNonVisualDrawingShapePropsModel fromDocx4j(CTNonVisualDrawingShapeProps value)
	{
		return new CTNonVisualDrawingShapePropsModel(
		BooleanConverter.fromDocx4j(value.getTxBox())
		,
		CTShapeLockingConverter.fromDocx4j(value.getSpLocks())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
