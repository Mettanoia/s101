package s0102n1ex1.application.domain.model;

import java.math.BigDecimal;

// Item 60 Effective Java to know why preu is BigDecimal instead of being a primitive float.
public record Producte(String nom, BigDecimal preu){
}
