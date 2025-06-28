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
import test.drawingml.chartDrawing.CTDrawingModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTDrawingConverter
{
	
	private CTDrawingConverter() {
		// empty
	}
	
	public static CTDrawingModel fromDocx4j(CTDrawing value)
	{
		if (value.getRelSizeAnchor() != null) return CTDrawingModel.createRelSizeAnchor(
		CTRelSizeAnchorConverter.fromDocx4j(value.getRelSizeAnchor())
		);
		if (value.getAbsSizeAnchor() != null) return CTDrawingModel.createAbsSizeAnchor(
		CTAbsSizeAnchorConverter.fromDocx4j(value.getAbsSizeAnchor())
		);
		
		return new CTDrawingModel();
	}
}
