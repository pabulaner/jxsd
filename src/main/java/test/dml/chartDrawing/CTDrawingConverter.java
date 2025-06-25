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
import test.dml.chartDrawing.CTDrawingModel.*;
import test.officeDocument.relationships.*;

public class CTDrawingConverter
{
	
	private CTDrawingConverter() {
		// empty
	}
	
	public static CTDrawingModel fromDocx4j(CTDrawing value)
	{
		if (value.getRelSizeAnchor() != null) return new CTDrawingModel(
		CTRelSizeAnchorConverter.fromDocx4j(value.getRelSizeAnchor())
		);
		if (value.getAbsSizeAnchor() != null) return new CTDrawingModel(
		CTAbsSizeAnchorConverter.fromDocx4j(value.getAbsSizeAnchor())
		);
		
		return new CTDrawingModel();
	}
}
