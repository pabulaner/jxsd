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
import test.dml.CTFillPropertiesModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTFillPropertiesConverter
{
	
	private CTFillPropertiesConverter() {
		// empty
	}
	
	public static CTFillPropertiesModel fromDocx4j(CTFillProperties value)
	{
		if (value.getNoFill() != null) return new CTFillPropertiesModel(
		CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
		);
		if (value.getSolidFill() != null) return new CTFillPropertiesModel(
		CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
		);
		if (value.getGradFill() != null) return new CTFillPropertiesModel(
		CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
		);
		if (value.getBlipFill() != null) return new CTFillPropertiesModel(
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		);
		if (value.getPattFill() != null) return new CTFillPropertiesModel(
		CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
		);
		if (value.getGrpFill() != null) return new CTFillPropertiesModel(
		CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
		);
		
		return new CTFillPropertiesModel();
	}
}
