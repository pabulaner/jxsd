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
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTFillEffectModel.*;
import test.officeDocument.relationships.*;

public class CTFillEffectConverter
{
	
	private CTFillEffectConverter() {
		// empty
	}
	
	public static CTFillEffectModel fromDocx4j(CTFillEffect value)
	{
		if (value.getNoFill() != null) return new CTFillEffectModel(
		CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
		);
		if (value.getSolidFill() != null) return new CTFillEffectModel(
		CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
		);
		if (value.getGradFill() != null) return new CTFillEffectModel(
		CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
		);
		if (value.getBlipFill() != null) return new CTFillEffectModel(
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		);
		if (value.getPattFill() != null) return new CTFillEffectModel(
		CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
		);
		if (value.getGrpFill() != null) return new CTFillEffectModel(
		CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
		);
		
		return new CTFillEffectModel();
	}
}
