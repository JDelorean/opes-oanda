package pl.jdev.opes_oanda.domain.pricing;

import lombok.Data;

@Data
class PriceBucket {
    private String price;
    private Integer liquidity;
}
