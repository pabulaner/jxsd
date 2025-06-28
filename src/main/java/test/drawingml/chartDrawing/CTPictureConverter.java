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
import test.drawingml.chartDrawing.CTPictureModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPictureConverter
{
	
	private CTPictureConverter() {
		// empty
	}
	
	public static CTPictureModel fromDocx4j(CTPicture value)
	{
		return new CTPictureModel(
		BooleanConverter.fromDocx4j(value.getFPublished())
		,
		StringConverter.fromDocx4j(value.getMacro())
		,
		CTPictureNonVisualConverter.fromDocx4j(value.getNvPicPr())
		,
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTShapeStyleConverter.fromDocx4j(value.getStyle())
		
		);
	}
}
