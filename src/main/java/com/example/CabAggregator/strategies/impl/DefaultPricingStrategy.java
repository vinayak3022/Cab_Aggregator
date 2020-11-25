package com.example.CabAggregator.strategies.impl;

import com.example.CabAggregator.models.Location;
import com.example.CabAggregator.strategies.PricingStrategy;
import org.springframework.stereotype.Service;

@Service
public class DefaultPricingStrategy implements PricingStrategy {

    public static final Double PER_KM_RATE = 10.0;

    @Override
    public Double findPrice(Location fromPoint, Location toPoint) {
        return fromPoint.distance(toPoint) * PER_KM_RATE;
    }
}
