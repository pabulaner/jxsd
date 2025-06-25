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
import test.dml.CTStyleMatrixModel.*;
import test.officeDocument.relationships.*;

public class CTStyleMatrixModel
{
	
	private final StringModel name;
	private final CTFillStyleListModel fillStyleLst;
	private final CTLineStyleListModel lnStyleLst;
	private final CTEffectStyleListModel effectStyleLst;
	private final CTBackgroundFillStyleListModel bgFillStyleLst;
	
	public CTStyleMatrixModel(StringModel name, CTFillStyleListModel fillStyleLst, CTLineStyleListModel lnStyleLst, CTEffectStyleListModel effectStyleLst, CTBackgroundFillStyleListModel bgFillStyleLst) {
		this.name = name;
		this.fillStyleLst = fillStyleLst;
		this.lnStyleLst = lnStyleLst;
		this.effectStyleLst = effectStyleLst;
		this.bgFillStyleLst = bgFillStyleLst;
	}
	
	public StringModel getName() {
		return this.name;
	}
	public CTFillStyleListModel getFillStyleLst() {
		return this.fillStyleLst;
	}
	public CTLineStyleListModel getLnStyleLst() {
		return this.lnStyleLst;
	}
	public CTEffectStyleListModel getEffectStyleLst() {
		return this.effectStyleLst;
	}
	public CTBackgroundFillStyleListModel getBgFillStyleLst() {
		return this.bgFillStyleLst;
	}
}
