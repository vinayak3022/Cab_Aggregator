package com.example.CabAggregator.strategies;

import com.example.CabAggregator.models.Location;

public interface PricingStrategy {
    Double findPrice(Location fromPoint, Location toPoint);
}
