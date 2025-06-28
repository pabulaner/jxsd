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
import test.drawingml.chartDrawing.CTShapeModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTShapeConverter
{
	
	private CTShapeConverter() {
		// empty
	}
	
	public static CTShapeModel fromDocx4j(CTShape value)
	{
		return new CTShapeModel(
		BooleanConverter.fromDocx4j(value.getFPublished())
		,
		StringConverter.fromDocx4j(value.getMacro())
		,
		BooleanConverter.fromDocx4j(value.getFLocksText())
		,
		StringConverter.fromDocx4j(value.getTextlink())
		,
		CTShapeNonVisualConverter.fromDocx4j(value.getNvSpPr())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTShapeStyleConverter.fromDocx4j(value.getStyle())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxBody())
		
		);
	}
}
