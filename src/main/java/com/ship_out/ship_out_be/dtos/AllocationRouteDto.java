package com.ship_out.ship_out_be.dtos;

import java.util.UUID;

public record AllocationRouteDto(
    UUID id,
    String voyageId,
    String linkedScheduleEtdId,
    String linkedScheduleEtaId, 
    Integer quantity,
    String unit,
    Integer utilization,
    Integer outstandingCommited,
    Integer etdWeek
) {
}