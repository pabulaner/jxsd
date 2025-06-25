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
import test.dml.CTNonVisualDrawingShapePropsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
