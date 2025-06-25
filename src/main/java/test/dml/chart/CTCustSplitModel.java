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
import test.dml.chart.CTCustSplitModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTCustSplitModel
{
	
	private final List<CTUnsignedIntModel> secondPiePt;
	
	public CTCustSplitModel(List<CTUnsignedIntModel> secondPiePt) {
		this.secondPiePt = secondPiePt;
	}
	
	public List<CTUnsignedIntModel> getSecondPiePt() {
		return this.secondPiePt;
	}
}
