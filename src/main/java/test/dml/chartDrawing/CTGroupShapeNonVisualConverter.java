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
import test.dml.chartDrawing.CTGroupShapeNonVisualModel.*;
import test.officeDocument.relationships.*;

public class CTGroupShapeNonVisualConverter
{
	
	private CTGroupShapeNonVisualConverter() {
		// empty
	}
	
	public static CTGroupShapeNonVisualModel fromDocx4j(CTGroupShapeNonVisual value)
	{
		return new CTGroupShapeNonVisualModel(
		CTNonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr())
		,
		CTNonVisualGroupDrawingShapePropsConverter.fromDocx4j(value.getCNvGrpSpPr())
		
		);
	}
}
