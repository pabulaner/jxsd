package test.drawingml.main;

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
import test.drawingml.main.CTEffectPropertiesModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTEffectPropertiesConverter
{
	
	private CTEffectPropertiesConverter() {
		// empty
	}
	
	public static CTEffectPropertiesModel fromDocx4j(CTEffectProperties value)
	{
		if (value.getEffectLst() != null) return CTEffectPropertiesModel.createEffectLst(
		CTEffectListConverter.fromDocx4j(value.getEffectLst())
		);
		if (value.getEffectDag() != null) return CTEffectPropertiesModel.createEffectDag(
		CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
		);
		
		return new CTEffectPropertiesModel();
	}
}
