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
import test.dml.CTFillStyleListModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTFillStyleListConverter
{
	
	private CTFillStyleListConverter() {
		// empty
	}
	
	public static CTFillStyleListModel fromDocx4j(CTFillStyleList value)
	{
		if (value.getNoFill() != null) return new CTFillStyleListModel(
		CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
		);
		if (value.getSolidFill() != null) return new CTFillStyleListModel(
		CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
		);
		if (value.getGradFill() != null) return new CTFillStyleListModel(
		CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
		);
		if (value.getBlipFill() != null) return new CTFillStyleListModel(
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		);
		if (value.getPattFill() != null) return new CTFillStyleListModel(
		CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
		);
		if (value.getGrpFill() != null) return new CTFillStyleListModel(
		CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
		);
		
		return new CTFillStyleListModel();
	}
}
