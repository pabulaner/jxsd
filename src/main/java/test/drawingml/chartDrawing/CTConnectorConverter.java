package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTConnectorModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTConnectorConverter
{
	
	private CTConnectorConverter() {
		// empty
	}
	
	public static CTConnectorModel fromDocx4j(CTConnector value)
	{
		return new CTConnectorModel(
		BooleanConverter.fromDocx4j(value.getFPublished())
		,
		StringConverter.fromDocx4j(value.getMacro())
		,
		CTConnectorNonVisualConverter.fromDocx4j(value.getNvCxnSpPr())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTShapeStyleConverter.fromDocx4j(value.getStyle())
		
		);
	}
}
