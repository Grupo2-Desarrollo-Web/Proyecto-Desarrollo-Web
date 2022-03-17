package co.javeriana.restaurantes.Restaurantes.Insumo.Domain.ValueObjects;

import co.javeriana.restaurantes.Shared.Domain.Aggregate.CustomUUID;

public class InsumoID extends CustomUUID {

    private InsumoID() {}

    public InsumoID(String value) {
        super(value);
    }
}
