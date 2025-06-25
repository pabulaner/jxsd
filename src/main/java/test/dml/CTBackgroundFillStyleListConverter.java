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
import test.dml.CTBackgroundFillStyleListModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBackgroundFillStyleListConverter
{
	
	private CTBackgroundFillStyleListConverter() {
		// empty
	}
	
	public static CTBackgroundFillStyleListModel fromDocx4j(CTBackgroundFillStyleList value)
	{
		if (value.getNoFill() != null) return new CTBackgroundFillStyleListModel(
		CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
		);
		if (value.getSolidFill() != null) return new CTBackgroundFillStyleListModel(
		CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
		);
		if (value.getGradFill() != null) return new CTBackgroundFillStyleListModel(
		CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
		);
		if (value.getBlipFill() != null) return new CTBackgroundFillStyleListModel(
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		);
		if (value.getPattFill() != null) return new CTBackgroundFillStyleListModel(
		CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
		);
		if (value.getGrpFill() != null) return new CTBackgroundFillStyleListModel(
		CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
		);
		
		return new CTBackgroundFillStyleListModel();
	}
}
