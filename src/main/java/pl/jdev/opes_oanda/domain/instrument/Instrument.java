package pl.jdev.opes_oanda.domain.instrument;

import lombok.Data;

@Data
public class Instrument {

    enum InstrumentType {
        CURRENCY, CFD, METAL
    }

    @Data
    private class InstrumentCommission {
        private String instrument;
        private String commission;
        private String unitsTraded;
        private String minimumCommission;
    }

    private String name;
    private InstrumentType type;
    private String displayName;
    private Integer pipLocation;
    private Integer displayPrecision;
    private Integer tradeUnitsPrecision;
    private String minimumTradeSize;
    private String maximumTrailingStopDistance;
    private String minimumTrailingStopDistance;
    private String maximumPositionSize;
    private String maximumOrderUnits;
    private String marginRate;
    private InstrumentCommission commission;
}