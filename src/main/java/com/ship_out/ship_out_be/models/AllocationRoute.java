package com.ship_out.ship_out_be.models;

import java.util.UUID;

public class AllocationRoute {
    UUID id;
    String voyageId;
    String linkedScheduleEtdId;
    String linkedScheduleEtaId;
    Integer quantity;
    String unit;
    Integer utilization;
    Integer outstandingCommited;
    Integer etdWeek;
}