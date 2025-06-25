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
import test.dml.CTColorChangeEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorChangeEffectModel
{
	
	private final BooleanModel useA;
	private final CTColorModel clrFrom;
	private final CTColorModel clrTo;
	
	public CTColorChangeEffectModel(BooleanModel useA, CTColorModel clrFrom, CTColorModel clrTo) {
		this.useA = useA;
		this.clrFrom = clrFrom;
		this.clrTo = clrTo;
	}
	
	public BooleanModel getUseA() {
		return this.useA;
	}
	public CTColorModel getClrFrom() {
		return this.clrFrom;
	}
	public CTColorModel getClrTo() {
		return this.clrTo;
	}
}
