package test.dml.chartDrawing;

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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTShapeModel.*;
import test.officeDocument.relationships.*;

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
