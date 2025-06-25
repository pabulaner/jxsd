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
import test.dml.CTBlurEffectModel.*;
import test.officeDocument.relationships.*;

public class CTBlurEffectModel
{
	
	private final STPositiveCoordinateModel rad;
	private final BooleanModel grow;
	
	public CTBlurEffectModel(STPositiveCoordinateModel rad, BooleanModel grow) {
		this.rad = rad;
		this.grow = grow;
	}
	
	public STPositiveCoordinateModel getRad() {
		return this.rad;
	}
	public BooleanModel getGrow() {
		return this.grow;
	}
}
