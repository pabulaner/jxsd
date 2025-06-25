package test.dml;

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
import test.dml.CTEffectPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTEffectPropertiesConverter
{
	
	private CTEffectPropertiesConverter() {
		// empty
	}
	
	public static CTEffectPropertiesModel fromDocx4j(CTEffectProperties value)
	{
		if (value.getEffectLst() != null) return new CTEffectPropertiesModel(
		CTEffectListConverter.fromDocx4j(value.getEffectLst())
		);
		if (value.getEffectDag() != null) return new CTEffectPropertiesModel(
		CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
		);
		
		return new CTEffectPropertiesModel();
	}
}
