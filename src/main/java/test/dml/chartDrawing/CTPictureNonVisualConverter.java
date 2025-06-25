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
import test.dml.chartDrawing.CTPictureNonVisualModel.*;
import test.officeDocument.relationships.*;

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
