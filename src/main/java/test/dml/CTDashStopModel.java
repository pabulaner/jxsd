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
import test.dml.CTDashStopModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDashStopModel
{
	
	private final STPositivePercentageModel sp;
	private final STPositivePercentageModel d;
	
	public CTDashStopModel(STPositivePercentageModel sp, STPositivePercentageModel d) {
		this.sp = sp;
		this.d = d;
	}
	
	public STPositivePercentageModel getSp() {
		return this.sp;
	}
	public STPositivePercentageModel getD() {
		return this.d;
	}
}
