package pl.jdev.opes_oanda.domain.transaction;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientConfigureTransaction {
    private String alias;
    private Double marginRate;
}
