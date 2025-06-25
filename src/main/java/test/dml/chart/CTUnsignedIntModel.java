package test.dml.chart;

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
import test.dml.chart.CTUnsignedIntModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTUnsignedIntModel
{
	
	private final UnsignedIntModel val;
	
	public CTUnsignedIntModel(UnsignedIntModel val) {
		this.val = val;
	}
	
	public UnsignedIntModel getVal() {
		return this.val;
	}
}
