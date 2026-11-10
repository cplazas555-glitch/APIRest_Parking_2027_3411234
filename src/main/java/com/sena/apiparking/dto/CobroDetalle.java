package com.sena.apiparking.dto;

public record CobroDetalle(Long idTarifa,long minutosTotales,long horasCompletas, long fraccionesCobradas, long tarifaHora,long tarifaFraccion, int tarifaMinutos , long valorTotal) {

}
