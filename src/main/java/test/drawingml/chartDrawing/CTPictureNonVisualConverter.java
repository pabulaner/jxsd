package test.drawingml.chartDrawing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.chartDrawing.CTPictureNonVisualModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPictureNonVisualConverter
{
	
	private CTPictureNonVisualConverter() {
		// empty
	}
	
	public static CTPictureNonVisualModel fromDocx4j(CTPictureNonVisual value)
	{
		return new CTPictureNonVisualModel(
		CTNonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr())
		,
		CTNonVisualPicturePropertiesConverter.fromDocx4j(value.getCNvPicPr())
		
		);
	}
}
