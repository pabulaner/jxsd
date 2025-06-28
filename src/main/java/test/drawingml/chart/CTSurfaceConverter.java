package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.CTSurfaceModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTSurfaceConverter
{
	
	private CTSurfaceConverter() {
		// empty
	}
	
	public static CTSurfaceModel fromDocx4j(CTSurface value)
	{
		return new CTSurfaceModel(
		CTUnsignedIntConverter.fromDocx4j(value.getThickness())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTPictureOptionsConverter.fromDocx4j(value.getPictureOptions())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
