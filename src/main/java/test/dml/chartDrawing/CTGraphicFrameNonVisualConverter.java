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
import test.officeDocument.relationships.*;
import test.dml.chartDrawing.CTGraphicFrameNonVisualModel.*;

public class CTGraphicFrameNonVisualConverter
{
	
	private CTGraphicFrameNonVisualConverter() {
		// empty
	}
	
	public static CTGraphicFrameNonVisualModel fromDocx4j(CTGraphicFrameNonVisual value)
	{
		return new CTGraphicFrameNonVisualModel(
		CTNonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr())
		,
		CTNonVisualGraphicFramePropertiesConverter.fromDocx4j(value.getCNvGraphicFramePr())
		
		);
	}
}
