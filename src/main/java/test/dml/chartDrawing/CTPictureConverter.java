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
import test.dml.chartDrawing.CTPictureModel.*;
import test.officeDocument.relationships.*;

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
